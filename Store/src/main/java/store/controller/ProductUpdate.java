package store.controller;

import store.model.dto.Category;
import store.model.dto.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductUpdate {

    public void updateProductPrice(ArrayList<Product> p){
        Scanner sc = new Scanner(System.in);
        boolean tr = false;
        System.out.print("가격을 변경할 상품명을 입력하세요 : ");
        String name = sc.nextLine();
        for(Product pro : p) {
            if (pro.getName().equals(name)) {
                System.out.println("변경할 가격을 입력하세요 : ");
                int price = sc.nextInt();
                pro.setPrice(price);
                tr = true;
                System.out.println(name+"의 상품이 "+price+"로 바뀌었습니다.");
                break;

            }
        }
        if(!tr)
            System.out.println("상품이 없습니다.");

    }

    public void changeProductPrice(ArrayList<Product> p){
        Scanner sc = new Scanner(System.in);
        boolean tr = false;
        System.out.print("카테고리를 변경할 상품명을 입력하세요 : ");
        String name = sc.nextLine();
        for(Product pro : p) {
            if (pro.getName().equals(name)) {
                System.out.println("변경할 카테고리를 입력하세요 : ");
                String category = sc.nextLine();
                Category c = Category.valueOf(category);
                pro.setCategory(c);
                tr = true;
                System.out.println(name+"의 상품이 "+category+"로 바뀌었습니다.");
                break;

            }
        }
        if(!tr)
            System.out.println("상품이 없습니다.");
    }

}
