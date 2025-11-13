package store.controller;

import store.model.dto.Product;
import store.model.dto.Selling;
import java.time.LocalDate;
import java.util.ArrayList;


public class ProductSelling {
    private ArrayList<Selling> salesHistory = new ArrayList<>();

    public void sellProducts(String input, ArrayList<Product> p) {
        // 예: "하리보 1, 신라면 2"
        String[] items = input.split(",");
        double totalPrice = 0;
        StringBuilder soldItems = new StringBuilder();

        for (String item : items) {
            String[] parts = item.trim().split(" ");
            if (parts.length != 2) continue;

            String name = parts[0];
            int quantity;

            try {
                quantity = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("수량이 올바르지 않습니다: " + parts[1]);
                continue;
            }

            // 상품 검색
            Product product = null;
            for (Product prod : p) {
                if (prod.getName().equals(name)) {
                    product = prod;
                    break;
                }
            }

            if (product == null) {
                System.out.println("상품 '" + name + "' 을(를) 찾을 수 없습니다.");
                continue;
            }

            if (product.getStock() < quantity) {
                System.out.println("재고 부족: " + name + " (남은 수량: " + product.getStock() + ")");
                continue;
            }

            // 재고 차감
            product.setStock(product.getStock() - quantity);
            // 금액 계산
            double salePrice = product.getPrice() * quantity;
            totalPrice += salePrice;
            soldItems.append(name).append(" x").append(quantity).append(", ");

            //      판매기록 생성
            Selling record = new Selling(
                    product.getName(),
                    product.getCategory(),
                    product.getPrice(),
                    quantity,
                    LocalDate.now()
            );
            salesHistory.add(record);
        }

        // 판매 기록 저장
        if (soldItems.length() > 0) {
            soldItems.setLength(soldItems.length() - 2); // 마지막 ", " 제거
            System.out.println("\n판매 완료: " + soldItems);
            System.out.println("총 금액: " + totalPrice + "원");
        } else {
            System.out.println("판매할 상품이 없습니다.");
        }

        //판매기록 출력
        if (!salesHistory.isEmpty()) {
            System.out.println("\n 판매기록]");
            for (Selling s : salesHistory) {
                System.out.println(s);
            }
        }
    }

    public ArrayList<Selling> getSalesHistory() {
        return salesHistory;
    }
}