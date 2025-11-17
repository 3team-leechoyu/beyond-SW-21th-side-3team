//package store.controller;
//
//import store.model.dto.Product;
//import store.model.dto.Selling;
//
//import java.util.*;
//
//public class SortManager {
//    private List<Product> result;
//
//    public List<Product> sortByExpiration(Product[] search){
//        result = new ArrayList<>(Arrays.asList(search));
//        result.sort(Comparator.comparing(Product::getDate));
//
//        return result; }
//
//    public List<Product> sortByStock(Product[] search){
//        result = new ArrayList<>(Arrays.asList(search));
//        result.sort(Comparator.comparing(Product::getStock));
//
//        return result; }
//
//    public List<Product> sortByLessStock(Product[] search){
//        result = new ArrayList<>(Arrays.asList(search));
//        result.sort(Comparator.comparing(Product::getStock));
//        Collections.reverse(result);
//
//        return result; }
//
//    public List<Selling> historySortByCategory(List<Selling> search){
//        List<Selling> result = new ArrayList<>(search); //복사
//        result.sort(Comparator.comparing(Selling::getCategory));
//        return result;
//    }
//    public List<Selling> historySortByDate(List<Selling> search){
//        List<Selling> result = new ArrayList<>(search);
//        result.sort(Comparator.comparing(Selling::getDate));
//        return result;
//    }
//}
