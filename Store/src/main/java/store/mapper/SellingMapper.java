package store.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import store.model.dto.Selling;

@Mapper
public interface SellingMapper {

    @Insert("INSERT INTO selling(id, name, category_id, price, count, date) " +
            "VALUES(#{id},#{name}, #{categoryId}, #{price}, #{count}, #{date})")
    int insertSelling(Selling selling);
}
