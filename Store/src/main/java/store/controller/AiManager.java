package store.controller;

import store.model.dto.Ai;
import store.model.dto.Category;
import store.model.dto.Product;


public class AiManager {
    Ai ai [] = new Ai[10];
    StoreManager sm = null;

    public void ai_set(){
        for(int i=0;i<ai.length;i++){
            ai[i] = new Ai();
        }
    }

    public int buy_ai(){
        int sum=0;
        for(int i=0;i<ai.length;i++){
            for(Category c : Category.values()){
                if(ai[i].getdesire(c)>=70){
                    Product bought = sm.buyCategory(c);
                    if(bought != null){
                        System.out.println("기타를 구매했습니다: " + bought.getName());
                        System.out.println("가격: " + bought.getPrice() + "원");
                        sum = sum+bought.getPrice();
                        System.out.println("남은 재고: " + bought.getStock());
                    }
                    else{
                        System.out.println("재고가 부족하여 구매를 못 했습니다.");
                    }


                }
            }

        }

        return sum;
    }
}
