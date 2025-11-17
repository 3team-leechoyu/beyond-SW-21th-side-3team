package store.mapper;

import org.apache.ibatis.annotations.*;
import store.model.dto.Product;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("SELECT * FROM product")
    List<Product> findAll();

    @Select("SELECT * FROM product WHERE name = #{name}")
    Product findByName(String name);

    //    @Update("UPDATE product SET stock = #{stock} WHERE product_id = #{productId}")
//    int updateStock(Product product);
    @Update("UPDATE product SET stock = #{stock} WHERE name = #{name}")
    int updateStock(@Param("name") String name, @Param("stock") int stock);
}
