package store.controller;

import store.model.dto.Category;
import store.model.dto.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchManager {

    public List<Product> searchBy(String keyword, Product[] products){

        List<Product> result = new ArrayList<>();

        for(Product p : products){
            String name  = p.getName();
            Category c = p.getCategory();
            String category = c.name();

            if(keyword == null) {
                result.add(p);
            } else {
                if (name.contains(keyword) || category.contains(keyword)) {
                    result.add(p);
                }
            }
        }

        if(result.isEmpty()) {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }
        return result;
    }
}
