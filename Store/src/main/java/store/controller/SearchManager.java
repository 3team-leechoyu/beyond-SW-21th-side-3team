package store.controller;

import store.model.dto.Category;
import store.model.dto.Product;

import java.util.Scanner;

public class SearchManager {

    public void searchBy(String keyword, Product[] products){

        boolean find = false;
        for(Product p : products){
            String name  = p.getName();
            Category c = p.getCategory();
            String category = c.name();

            if(keyword == null) {
                System.out.println(p);
                find = true;
            } else {
                if (name.contains(keyword) || category.contains(keyword)) {
                    System.out.println(p);
                    find = true;
                }
            }
        }

        if(!find) {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }
    }
}
