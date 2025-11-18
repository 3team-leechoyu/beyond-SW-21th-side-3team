package store.controller;

import org.apache.ibatis.session.SqlSession;
import store.mapper.ProductMapper;
import store.mapper.SellingMapper;
import store.model.dto.Product;
import store.model.dto.Selling;
import store.model.dto.Template;

import java.time.LocalDate;

public class ProductSelling {

    public void sellProducts(String input) {

        SqlSession sqlSession = Template.getSqlSession();
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        SellingMapper sellingMapper = sqlSession.getMapper(SellingMapper.class);

        double totalPrice = 0;

        try {
            // 입력 예: "하리보 1, 신라면 2"
            String[] items = input.split(",");

            for (String item : items) {
                String[] parts = item.trim().split(" ");

                if (parts.length != 2) {
                    System.out.println("입력 형식이 잘못되었습니다: " + item);
                    continue;
                }

                String name = parts[0];
                int quantity;

                try {
                    quantity = Integer.parseInt(parts[1]);
                } catch (NumberFormatException e) {
                    System.out.println("수량이 숫자가 아닙니다: " + parts[1]);
                    continue;
                }

                // 1. 상품 DB 조회
                Product product = productMapper.findByName(name);

                if (product == null) {
                    System.out.println(" 상품 '" + name + "' 을(를) 찾을 수 없습니다.");
                    continue;
                }

                // 2. 재고 확인
                if (product.getStock() < quantity) {
                    System.out.println(" 재고 부족: " + name + " (남은 수량: " + product.getStock() + ")");
                    continue;
                }

                // 3. 재고 차감
                productMapper.updateStock(product.getName(), product.getStock() - quantity);

                // 4. 가격 계산
                double salePrice = product.getPrice() * quantity;
                totalPrice += salePrice;

                // 5. 판매 기록 생성
                Selling record = new Selling(
                        product.getCategoryId(), // 카테고리
                        quantity ,          // 수량
                        LocalDate.now(),    // 판매일
                        0,                  // id (자동증가)
                        name,               // 상품명
                        (int) salePrice   // 가격
                );

                sellingMapper.insertSelling(record);

                System.out.println("✔ 판매됨: " + name + " x " + quantity);
            }

            sqlSession.commit();
            System.out.println("\n 총 판매 금액: " + totalPrice + "원");

        } catch (Exception e) {
            System.out.println("판매 중 오류 발생 → ROLLBACK");
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }
    }
}
