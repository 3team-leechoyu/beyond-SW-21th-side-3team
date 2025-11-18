package store.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;
import store.model.dto.Selling;
import store.provider.SqlUpdateProvider;

public interface UpdateMapper {

    @UpdateProvider(type = SqlUpdateProvider.class, method = "updatePrice")
    int updatePrice(@Param("name") String name, @Param("price") int price);

    @UpdateProvider(type = SqlUpdateProvider.class, method = "updateCategory")
    int updateCategory(@Param("name")String name, @Param("category_id") int category_id);

    @UpdateProvider(type = SqlUpdateProvider.class, method = "updateStock")
    int updateStock(Selling selling);
}
