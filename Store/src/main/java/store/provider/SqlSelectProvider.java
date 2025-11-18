package store.provider;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

public class SqlSelectProvider {

    public String historyCategory(@Param("category_id") int category_id) {
        return new SQL()
                .SELECT("id")
                .SELECT("category_id AS categoryId")
                .SELECT("name")
                .SELECT("price")
                .SELECT("count")
                .SELECT("date")
                .FROM("Selling")
                .WHERE("category_id = #{category_id}")
                .toString();
    }

    public String allProduct(){
        return new SQL()
//                .SELECT("id")
                .SELECT("name")
                .SELECT("category")
                .SELECT("price")
                .SELECT("stock")
                .SELECT("date")
                .FROM("Product")
                .toString();
    }

    public String historyDate(){
        return new SQL()
                .SELECT("id")
                .SELECT("category_id AS categoryId")
                .SELECT("name")
                .SELECT("price")
                .SELECT("count")
                .SELECT("date")
                .FROM("Selling")
                .ORDER_BY("date")
                .toString();
    }
    public String historyName(@Param("name") String name){
        return new SQL()
                .SELECT("id")
                .SELECT("category_id AS categoryId")
                .SELECT("name")
                .SELECT("price")
                .SELECT("count")
                .SELECT("date")
                .FROM("Selling")
                .WHERE("name = #{name}")
                .toString();
    }


}
