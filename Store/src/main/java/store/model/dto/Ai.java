package store.model.dto;

import java.util.EnumMap;


public class Ai {
    private EnumMap<Category, Integer> desire = new EnumMap<>(Category.class);

    public Ai() {
        for (Category c : Category.values()) {
            desire.put(c, (int) (Math.random() * 101)); // 0~100
        }
    }

    public int getdesire(Category c){
        return desire.get(c);
    }
}
