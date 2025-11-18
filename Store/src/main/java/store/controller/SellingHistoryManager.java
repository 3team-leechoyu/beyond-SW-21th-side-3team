package store.controller;

import store.model.dto.Category;
import store.model.dto.Selling;
import store.provider.SelectService;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SellingHistoryManager {
    public void SellingHistory(){
        SelectService ss = new SelectService();
        Scanner sc = new Scanner(System.in);
        System.out.print("검색하실 상품을 입력하시오. : ");
        String name =sc.nextLine();
        ss.selectNameHistory(name);
    }


    public void SellingCategoryHistory() {
        SelectService ss = new SelectService();
        Scanner sc = new Scanner(System.in);
        System.out.println("검색하실 품목을 입력하시오. : ");
        String input = sc.nextLine().toUpperCase(); // 입력을 대문자로 맞춤
        Category category = Category.valueOf(input);
        int category_id = category.ordinal()+1;
        ss.selectCategoryHistory(category_id);
    }
}
