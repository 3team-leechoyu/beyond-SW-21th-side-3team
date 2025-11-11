package store.controller;

import store.model.dto.Product;

import java.util.*;

public class SortManager {
    private List<Product> result;

    public List<Product> sortByExpiration(Product[] search){
        result = new ArrayList<>(Arrays.asList(search));
        result.sort(Comparator.comparing(Product::getDate));

        return result; }

    public List<Product> sortByStock(Product[] search){
        result = new ArrayList<>(Arrays.asList(search));
        result.sort(Comparator.comparing(Product::getStock));

        return result; }

    public List<Product> sortByLessStock(Product[] search){
        result = new ArrayList<>(Arrays.asList(search));
        result.sort(Comparator.comparing(Product::getStock));
        Collections.reverse(result);

        return result; }
}
