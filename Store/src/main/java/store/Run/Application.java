package store.Run;

import store.controller.*;
import store.model.dto.Selling;

public class Application {
    public static void main(String[] args) {
        System.out.println("테스트");
        AiManager aiManager = new AiManager();
        aiManager.buy_ai();         //AI 구매
        aiManager.buy_ai();         //AI 구매
        System.out.println();
        SellingHistoryManager sellingHistoryManager = new SellingHistoryManager();
        for(Selling s : sellingHistoryManager.getHistory()){
            System.out.println(s.toString());       //구매 기록 확인
        }
        System.out.println("=====================================");
        ProductSelling productSelling = new ProductSelling();
        StoreManager storeManager = new StoreManager();
        productSelling.sellProducts("하리보 1, 신라면 2",storeManager.p);
        for(Selling s : sellingHistoryManager.getHistory()){
            System.out.println(s.toString());       //구매 기록 확인
        }
    }
}
