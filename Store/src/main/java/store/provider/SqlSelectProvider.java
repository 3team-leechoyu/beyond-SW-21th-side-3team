package store.provider;

import org.apache.ibatis.jdbc.SQL;

public class SqlSelectProvider {

    public String historyCategory() {
        return new SQL()
                .SELECT("id")
                .SELECT("category_id AS categoryId")
                .SELECT("name")
                .SELECT("price")
                .SELECT("count")
                .SELECT("date")
                .FROM("Selling")
                .ORDER_BY("category_id")
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

}
