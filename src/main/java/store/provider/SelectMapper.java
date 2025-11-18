package store.provider;

import org.apache.ibatis.annotations.SelectProvider;
import store.model.dto.Product;

import java.util.List;

public interface SelectMapper {
    @SelectProvider(type = SqlSelectProvider.class , method="historyCategory")
    List<Product> historyCategory();

    @SelectProvider(type = SqlSelectProvider.class, method = "allProduct")
    List<Product> allProduct();

    @SelectProvider(type = SqlSelectProvider.class, method = "historyDate")
    List<Product> historyDate();
}
