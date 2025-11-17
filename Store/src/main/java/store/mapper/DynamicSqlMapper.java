package store.mapper;


import store.model.dto.Product;

import java.util.List;
import java.util.Map;

public interface DynamicSqlMapper {

    List<Product> searchByName(Map<String, Object> criteria);
    List<Product> searchByCategory(Map<String, Object> criteria);

    int insertProduct(Product p);

    int deleteProduct(String name);
}
