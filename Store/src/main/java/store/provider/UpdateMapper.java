package store.provider;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;

public interface UpdateMapper {

    @UpdateProvider(type = SqlUpdateProvider.class, method = "updatePrice")
    int updatePrice(@Param("name") String name, @Param("price") int price);

    @UpdateProvider(type = SqlUpdateProvider.class, method = "updateCategory")
    int updateCategory(@Param("name")String name, @Param("category") String category);
}
