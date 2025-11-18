package store.controller;

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
        System.out.print("검색하실 품목을 입력하시오. : ");
        String name =sc.nextLine();
        ss.selectNameHistory(name);
    }


}
