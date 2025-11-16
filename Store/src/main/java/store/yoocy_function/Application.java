package com.mybatis.first_function;

import com.mybatis.first_function.dto.Product;

import java.time.LocalDate;
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
                      5. 새 상품 등록
                      6. 상품 삭제
                      0. 프로그램 종료
                      메뉴 선택 : 
                    """);
            int no = sc.nextInt();

            switch (no) {
                case 1: searchProduct(); break;
                case 5: registerProduct(); break;
                case 6: deleteProduct(); break;
                case 0:
                    System.out.println("프로그램 종료"); return;
            }
        } while(true);
    }

    private static void deleteProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("삭제할 상품명 입력 : ");
        String name = sc.nextLine();

        ProductService ps = new ProductService();
        int result = ps.deleteProduct(name);

        if(result > 0) System.out.println("상품 삭제가 완료되었습니다.");
        else System.out.println("삭제에 실패하였습니다.");
    }


    private static void registerProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("상품명 입력 : ");
        String name = sc.nextLine();

        System.out.print("카테고리 ID 입력 : ");
        int categoryId = sc.nextInt();

        System.out.print("가격 입력 : ");
        int price = sc.nextInt();

        System.out.print("재고 입력 : ");
        int stock = sc.nextInt();

        System.out.print("유통기한(YYYY-MM-DD) 입력 : ");
        LocalDate date = LocalDate.parse(sc.next());

        Product p = new Product();
        p.setName(name);
        p.setCategory(categoryId);
        p.setPrice(price);
        p.setStock(stock);
        p.setDate(date);

        ProductService ps = new ProductService();
        ps.insertProduct(p);
    }


    private static void searchProduct() {

        Scanner sc = new Scanner(System.in);
        ProductService ps = new ProductService();

        List<Product> result = null;

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
            }

        if (result == null || result.isEmpty()) {
            System.out.println("검색 결과가 존재하지 않습니다.");
            return;
        }

        boolean sorted = showSortMenu(result, ps);

        if(!sorted) {
            searchProduct();
            return;
        }
        return;
    }

    private static boolean showSortMenu(List<Product> list, ProductService ps) {
        Scanner sc = new Scanner(System.in);

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
                    System.out.println("<유통기한 임박 순 정렬 결과>");
                    list.forEach(System.out::println);
                    return true;
                case 2:
                    ps.sortByLotStock(list);
                    System.out.println("<재고 많은 순 정렬 결과>");
                    list.forEach(System.out::println);
                    return true;
                case 3:
                    ps.sortByLessStock(list);
                    System.out.println("<재고 적은 순 정렬 결과>");
                    list.forEach(System.out::println);
                    return true;
                case 0:
                    return false; // 🔥 검색 메뉴로 돌아가기
        }
        return false;
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
