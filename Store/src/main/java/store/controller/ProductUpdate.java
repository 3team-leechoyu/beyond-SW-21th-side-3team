package store.controller;

import store.model.dto.Category;
import store.model.dto.Product;
import store.provider.UpdateService;

import java.util.*;

public class ProductUpdate {

    public void inputupdatePrice(){
        UpdateService us = new UpdateService();
        Scanner sc = new Scanner(System.in);

        System.out.print("가격을 변경할 상품명을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("변경할 가격을 입력하세요 : ");
        int price = sc.nextInt();
        us.updateprice(name,price);


    }

    public void inputupdateCategory() {
        UpdateService us = new UpdateService();
        Scanner sc = new Scanner(System.in);

        System.out.print("카테고리를 변경할 상품명을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("변경할 카테고리를 입력하세요 : ");
        String category = sc.nextLine();
        us.updatecategory(name,category);
    }
}
