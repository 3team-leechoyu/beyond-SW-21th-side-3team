package store.view;

import store.controller.StoreManager;

import java.util.Scanner;

public class StoreMenu {
    StoreManager sm = new StoreManager();
    Scanner sc = new Scanner(System.in);

    public void menu(){
        String menu = """
                        ██████╗ ██╗   ██╗ ███████╗
                       ██╔════╝ ██║   ██║ ██╔════╝
                ====== ██║      ██║   ██║ ███████╗ ======
                       ██║      ██║   ██║ ╚════██║
                       ╚██████╗ ╚██████╔╝ ███████║
                        ╚═════╝  ╚═════╝  ╚══════╝
                     1. 상품 조회
                        1) 카테고리로 검색
                        2) 상품명으로 검색
                        3) 재고 많은 순으로 검색
                        4) 유통기한 임박한 순으로 검색
                     2. 상품 판매
                     3. 상품 정보 변경
                        1) 가격 변경
                        2) 카테고리 변경
                     4. 판매기록 조회
                        1) 품목별
                        2) 날짜별
                     5. 새상품 등록
                     6. 상품 삭제
                     7. 프로그램 종료
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
