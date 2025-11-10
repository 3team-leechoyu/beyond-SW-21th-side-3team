package store.view;

import store.controller.StoreManager;

import java.util.Scanner;

public class StoreMenu {
    StoreManager sm = new StoreManager();
    Scanner sc = new Scanner(System.in);

    public void menu(){
        String menu = """
                =====편의점=====
                1. 상품 등록
                2. 상품 조회
                3. 상품 수정
                4. 매출 확인
                9. 종료       
                """;
        System.out.println(menu);
        System.out.println("번호 입력 : ");
        int num = sc.nextInt();
        do{
            switch (num){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 9:

                    break;
                default:
                    System.out.println("잘못 입력하였습니다.");

            }

        }while(num != 9);

    }

}
