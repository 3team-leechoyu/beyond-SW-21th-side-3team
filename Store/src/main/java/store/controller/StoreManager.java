package store.controller;

import store.model.dto.Category;
import store.model.dto.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreManager {
    ArrayList<Product> p = new ArrayList<>();

    public StoreManager() {
        // 카테고리별 기본 상품 1개씩 등록
        p.add(new Product(Category.BEVERAGE, LocalDate.of(2025, 12, 31), "콜라", 1500, 20));
        p.add(new Product(Category.SNACK, LocalDate.of(2026, 1, 15), "포카칩", 2000, 15));
        p.add(new Product(Category.ICE_CREAM, LocalDate.of(2025, 8, 1), "메로나", 1000, 10));
        p.add(new Product(Category.CIGARETTE, LocalDate.of(2030, 1, 1), "말보로", 4500, 50));
        p.add(new Product(Category.ETC, LocalDate.of(2027, 5, 10), "충전기", 8000, 5));

        System.out.println("카테고리별 기본 상품이 등록되었습니다!");
    }

    public void insertProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.print("등록할 상품 이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("가격 입력");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print("수량 입력");
        int stock = sc.nextInt();
        sc.nextLine();
        System.out.print("유통기한 입력 YYYY-MM-DD");
        String date = sc.nextLine();
        LocalDate ldate = LocalDate.parse(date);
        System.out.print("카테고리 입력: ");
        String category = sc.nextLine();
        Category c = Category.valueOf(category);
        p.add(new Product(c,ldate,name,price,stock));


    }

    public Product buyCategory(Category category){
        for(Product product: p){
            if(product.getCategory() == category && product.getStock()>=1){
                product.setStock(product.getStock()-1);
                return product;
            }
        }
        return null;
    }



}
