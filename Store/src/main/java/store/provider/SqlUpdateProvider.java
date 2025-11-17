package store.provider;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;
import store.model.dto.Selling;

public class SqlUpdateProvider {

    public String updatePrice(@Param("name") String name,@Param("price") int price) {
        return new SQL()
                .UPDATE("Product")
                .SET("price = #{price}")
                .WHERE("name = #{name}")
                .toString();
    }
    public String updateCategory(@Param("name") String name,@Param("category_id") int category_id){
        return new SQL()
                .UPDATE("Product")
                .SET("category_id = #{category_id}")
                .WHERE("name = #{name}")
                .toString();
    }
    public String updateStock(Selling selling){
        SQL sql = new SQL();
        sql.UPDATE("Product");
        sql.SET("stock = stock - #{count}");
        sql.WHERE("name = #{name}");
        return sql.toString();
    }


}
