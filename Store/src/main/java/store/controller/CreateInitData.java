package store.controller;

import store.model.dto.Category;
import store.model.dto.Product;

import java.time.LocalDate;
import java.util.List;

public class CreateInitData {

    public void CreateInitData(List<Product> p){
        // 젤리
        p.add(new Product(Category.JELLY, LocalDate.of(2025, 12, 30), "하리보", 1500, 20));
        p.add(new Product(Category.JELLY, LocalDate.of(2026, 3, 15), "젤리데이", 1200, 15));
        p.add(new Product(Category.JELLY, LocalDate.of(2025, 11, 5), "곰젤리", 1000, 25));

        // 유제품
        p.add(new Product(Category.DAIRY, LocalDate.of(2025, 12, 1), "서울우유", 1800, 30));
        p.add(new Product(Category.DAIRY, LocalDate.of(2025, 12, 15), "요플레", 1200, 25));
        p.add(new Product(Category.DAIRY, LocalDate.of(2026, 1, 1), "치즈", 2500, 10));

        // 과자
        p.add(new Product(Category.SNACK, LocalDate.of(2026, 2, 20), "포카칩", 2000, 40));
        p.add(new Product(Category.SNACK, LocalDate.of(2026, 3, 10), "새우깡", 1500, 50));
        p.add(new Product(Category.SNACK, LocalDate.of(2026, 4, 1), "오징어칩", 1800, 35));

        // 초콜릿
        p.add(new Product(Category.CHOCOLATE, LocalDate.of(2026, 5, 1), "가나초콜릿", 1500, 40));
        p.add(new Product(Category.CHOCOLATE, LocalDate.of(2026, 6, 10), "페레로로쉐", 3500, 20));
        p.add(new Product(Category.CHOCOLATE, LocalDate.of(2026, 7, 15), "킨더초콜릿", 2500, 30));

        // 라면
        p.add(new Product(Category.RAMEN, LocalDate.of(2027, 1, 10), "신라면", 1000, 50));
        p.add(new Product(Category.RAMEN, LocalDate.of(2026, 12, 20), "진라면", 900, 40));
        p.add(new Product(Category.RAMEN, LocalDate.of(2027, 2, 5), "불닭볶음면", 1500, 25));

        // 주류
        p.add(new Product(Category.ALCOHOL, LocalDate.of(2030, 1, 1), "참이슬", 2000, 60));
        p.add(new Product(Category.ALCOHOL, LocalDate.of(2030, 1, 1), "카스", 2500, 40));
        p.add(new Product(Category.ALCOHOL, LocalDate.of(2030, 1, 1), "테라", 2500, 35));

        // 음료
        p.add(new Product(Category.BEVERAGE, LocalDate.of(2026, 5, 30), "콜라", 1500, 30));
        p.add(new Product(Category.BEVERAGE, LocalDate.of(2026, 6, 15), "사이다", 1500, 30));
        p.add(new Product(Category.BEVERAGE, LocalDate.of(2026, 7, 1), "환타", 1600, 20));

        // 담배
        p.add(new Product(Category.CIGARETTE, LocalDate.of(2030, 1, 1), "말보로", 4500, 40));
        p.add(new Product(Category.CIGARETTE, LocalDate.of(2030, 1, 1), "에쎄", 4300, 35));
        p.add(new Product(Category.CIGARETTE, LocalDate.of(2030, 1, 1), "던힐", 4800, 30));

        // 생필품
        p.add(new Product(Category.DAILY_NECESSITIES, LocalDate.of(2028, 5, 1), "칫솔", 1500, 15));
        p.add(new Product(Category.DAILY_NECESSITIES, LocalDate.of(2028, 5, 1), "치약", 2000, 10));
        p.add(new Product(Category.DAILY_NECESSITIES, LocalDate.of(2028, 5, 1), "비누", 1000, 20));

        // 빵
        p.add(new Product(Category.BREAD, LocalDate.of(2025, 12, 15), "소보루빵", 2500, 10));
        p.add(new Product(Category.BREAD, LocalDate.of(2025, 12, 20), "단팥빵", 2000, 15));
        p.add(new Product(Category.BREAD, LocalDate.of(2025, 12, 25), "크림빵", 2200, 12));

        // 아이스크림
        p.add(new Product(Category.ICE_CREAM, LocalDate.of(2026, 1, 15), "메로나", 1000, 30));
        p.add(new Product(Category.ICE_CREAM, LocalDate.of(2026, 2, 1), "비비빅", 1200, 25));
        p.add(new Product(Category.ICE_CREAM, LocalDate.of(2026, 3, 10), "돼지바", 1500, 20));

        // 즉석 식품
        p.add(new Product(Category.INSTANT_FOOD, LocalDate.of(2026, 12, 10), "컵밥", 3500, 15));
        p.add(new Product(Category.INSTANT_FOOD, LocalDate.of(2026, 11, 20), "즉석카레", 3000, 20));
        p.add(new Product(Category.INSTANT_FOOD, LocalDate.of(2026, 10, 30), "즉석짜장", 3200, 18));

        // 기타
        p.add(new Product(Category.ETC, LocalDate.of(2027, 5, 10), "충전기", 8000, 5));
        p.add(new Product(Category.ETC, LocalDate.of(2028, 3, 1), "건전지", 4000, 10));
        p.add(new Product(Category.ETC, LocalDate.of(2028, 6, 15), "USB 케이블", 5000, 8));
    }
}
