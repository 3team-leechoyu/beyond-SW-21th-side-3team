package store.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import store.model.dto.Selling;

@Mapper
public interface SellingMapper {

    //    @Insert("""
//        INSERT INTO selling(product_id, quantity, price, sell_date)
//        VALUES(#{productId}, #{quantity}, #{price}, #{sellDate})
//    """)
    @Insert("INSERT INTO selling(date, category, product_name, quantity, total_price) " +
            "VALUES(#{date}, #{category}, #{productName}, #{quantity}, #{totalPrice})")

    int insertSelling(Selling selling);
}
