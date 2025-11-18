package store.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import store.model.dto.Product;
import store.model.dto.Selling;
import store.provider.SqlSelectProvider;

import java.util.List;

public interface SelectMapper {
    @SelectProvider(type = SqlSelectProvider.class , method="historyCategory")
    List<Selling> historyCategory(@Param("category_id")int category_id);

    @SelectProvider(type = SqlSelectProvider.class, method = "allProduct")
    List<Product> allProduct();

    @SelectProvider(type = SqlSelectProvider.class, method = "historyDate")
    List<Selling> historyDate();

    @SelectProvider(type = SqlSelectProvider.class, method = "historyName")
    List<Selling> historyName(@Param("name") String name);

}
