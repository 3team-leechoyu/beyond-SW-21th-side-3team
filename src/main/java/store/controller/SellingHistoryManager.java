package store.controller;

import store.model.dto.Selling;

import java.util.ArrayList;
import java.util.List;

public class SellingHistoryManager {
    static int id=0;
    static List<Selling> history = new ArrayList<>();

    public List<Selling> getHistory() {
        return history;
    }

}
