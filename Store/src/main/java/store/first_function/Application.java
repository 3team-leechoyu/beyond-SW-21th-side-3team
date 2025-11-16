package com.mybatis.first_function;

import com.mybatis.first_function.dto.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map;


public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("""
                      === 메뉴 선택 ===
                      1. 품목 조회
                      0. 프로그램 종료
                      메뉴 선택 : 
                    """);
            int no = sc.nextInt();

            switch (no) {
                case 1: searchProduct(); break;
                case 0:
                    System.out.println("프로그램 종료"); return;
            }
        } while(true);
    }

    private static void searchProduct() {

        Scanner sc = new Scanner(System.in);
        ProductService ps = new ProductService();

        List<Product> result;

        do {
            System.out.print("""
                    === 품목 조회 서브 메뉴 ===
                    1. 이름으로 검색
                    2. 카테고리로 검색
                    0. 이전 메뉴로
                    메뉴 입력 : 
                    """);

            int no = sc.nextInt();

            switch(no) {
                case 1: result = ps.searchByName(inputSearchCriteriaMap(no)); break;
                case 2: result = ps.searchByCategory(inputSearchCriteriaMap(no)); break;
                case 0: return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    continue;
            }

            if (result == null || result.isEmpty()) {
                System.out.println("검색 결과가 존재하지 않습니다.");
                continue;
            }

            showSortMenu(result, ps);
        } while(true);
    }

    private static void showSortMenu(List<Product> list, ProductService ps) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("""
                === 정렬 방법 ===
                1. 유통기한 임박 순
                2. 재고 많은 순
                3. 재고 적은 순
                0. 이전 메뉴로
                메뉴 선택 : 
                """);

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    ps.sortByExpirationDate(list);   // 정렬만 함
                    System.out.println("▶ 유통기한 임박 순 정렬 결과:");
                    list.forEach(System.out::println);
                    break;

                case 2:
                    ps.sortByLotStock(list);
                    System.out.println("▶ 재고 많은 순 정렬 결과:");
                    list.forEach(System.out::println);
                    break;

                case 3:
                    ps.sortByLessStock(list);
                    System.out.println("▶ 재고 적은 순 정렬 결과:");
                    list.forEach(System.out::println);
                    break;

                case 0:
                    return; // 🔥 검색 메뉴로 돌아가기

                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }

    }

    private static Map<String, Object> inputSearchCriteriaMap(int no) {

        Scanner sc = new Scanner(System.in);

        Map<String, Object> criteria = new HashMap<>();

        if(no == 1) {
            System.out.print("검색할 품목 입력 : ");
            String name = sc.nextLine();
            criteria.put("name", name);
        }  else if(no == 2) {
            System.out.print("검색할 카테고리 입력 : ");
            String category = sc.nextLine();
            criteria.put("category", category);
        }

        return criteria;
    }
}
