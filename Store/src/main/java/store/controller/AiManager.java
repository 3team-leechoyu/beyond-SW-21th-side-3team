package store.controller;

import store.model.dto.Ai;
import store.model.dto.Category;
import store.model.dto.Product;
import store.model.dto.Selling;

import java.time.LocalDate;

import static store.controller.SellingHistoryManager.id;

public class AiManager {
    Ai ai [] = new Ai[10];
    StoreManager sm = new StoreManager();
    LocalDate date = LocalDate.of(2025, 11, 12);

    public void ai_set(){
        for(int i=0;i<ai.length;i++){
            ai[i] = new Ai();
        }
    }

    public void buy_ai(){
        ai_set();
        SellingHistoryManager shm = new SellingHistoryManager();
        int sum=0;
        for(int i=0;i<ai.length;i++){
            for(Category c : Category.values()){
                if(ai[i].getdesire(c)>=70){
                    Product bought = sm.buyCategory(c);
                    int size = (int) ((Math.random()*3)+1);     // 몇 개를 구매할지 (1~3)

                    if(bought.getStock()>=size){
                        System.out.println(bought.getName()+"(을)를 구매했습니다: ");

                        // 판매 기록 저장
                        shm.history.add(new Selling(id,date,c,bought.getPrice()*size,size));

                        System.out.println("가격: " + bought.getPrice()*size + "원");
//                        sum = sum+bought.getPrice();
                        bought.setStock(bought.getStock()-size);
                        System.out.println("남은 재고: " + bought.getStock());

                        id++; // id 값 증가
                    }
                    else{
                        System.out.println("재고가 부족하여 구매를 못 했습니다.");
                    }
                }
            }

        }
        date = date.plusDays(1);
//        return sum;
    }
}
