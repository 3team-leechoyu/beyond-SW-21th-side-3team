//package store.controller;
//
//import store.model.dto.Ai;
//import store.model.dto.Category;
//import store.model.dto.Product;
//import store.model.dto.Selling;
//import store.provider.InsertService;
//import store.provider.SelectService;
//import store.provider.UpdateService;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//
//
//public class AiManager {
//    Ai ai [] = new Ai[10];
//    StoreManager sm = new StoreManager();
//    LocalDate date = LocalDate.of(2025, 11, 12);
//
//    public void ai_set(){
//        for(int i=0;i<ai.length;i++){
//            ai[i] = new Ai();
//        }
//    }
//
//    public void buy_ai(){
//        ai_set();
//        SelectService ss = new SelectService();
//        InsertService is = new InsertService();
//        UpdateService us = new UpdateService();
//        List<Product> p = ss.selectAllProduct();
//        int sum=0;
//        for(int i=0;i<ai.length;i++){
//            for(Category c : Category.values()){
//                if(ai[i].getdesire(c)>=70){
//                    Product bought = buyCategory(c);
//                    int size = (int) ((Math.random()*3)+1);     // 몇 개를 구매할지 (1~3)
//
//                    if(bought.getStock()>=size){
//                        System.out.println(bought.getName()+"(을)를 구매했습니다: ");
//
//                        // 판매 기록 저장
//                        System.out.println("가격: " + bought.getPrice()*size + "원");
//                        Selling historyProduct = new Selling(bought.getCategory(),size,date, bought.getName(),bought.getPrice()*size);
//
//                        us.updateStock(historyProduct);
//
//                        // 재고 기록
//                        bought.setStock(bought.getStock()-size);
//                        System.out.println("남은 재고: " + bought.getStock());
//
////                        id++; // id 값 증가
//                    }
//                    else{
//                        System.out.println("재고가 부족하여 구매를 못 했습니다.");
//                    }
//                }
//            }
//
//        }
//        date = date.plusDays(1);
////        return sum;
//    }
//
//    public Product buyCategory(Category category){
//        SelectService ss = new SelectService();
//        List<Product> p = ss.selectAllProduct();
//        List<Product> pro = new ArrayList<>();
//        int rand=0;
//        for(Product product: p){
//            if(product.getCategory() == category){
//                pro.add(product);
//                rand = (int) ((Math.random()*pro.size())); //같은 카테고리 중 몇 번재 상품을 구매할지
//            }
//        }
//        return pro.get(rand);
//    }
//}
