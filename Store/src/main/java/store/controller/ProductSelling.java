package store.controller;

import store.model.dto.Product;
import java.util.ArrayList;

public class ProductSelling {

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
            double salePrice = product.getPrice() * quantity;
            totalPrice += salePrice;
            soldItems.append(name).append(" x").append(quantity).append(", ");
        }

//        // 판매 기록 저장
//        if (soldItems.length() > 0) {
//            SaleDTO sale = new SaleDTO(
//                    SaleDTO.generateSaleId(),
//                    LocalDateTime.now(),
//                    soldItems.substring(0, soldItems.length() - 2),
//                    totalPrice
//            );
//            saleRepository.addSale(sale);
//            System.out.println("✅ 판매 완료! 총액: " + totalPrice + "원");
//        }
    }
}
