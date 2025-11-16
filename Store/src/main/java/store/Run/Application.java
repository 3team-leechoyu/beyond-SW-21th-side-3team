package store.Run;

import store.controller.*;
import store.model.dto.Selling;
import store.view.StoreMenu;

public class Application {
    public static void main(String[] args) {
        StoreMenu sm = new StoreMenu();

        sm.menu();  // 메뉴 실행
    }
}
