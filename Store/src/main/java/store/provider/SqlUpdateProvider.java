package store.provider;

import org.apache.ibatis.jdbc.SQL;

public class SqlUpdateProvider {

    public String updatePrice(String name, int price) {
        return new SQL()
                .UPDATE("tbl_menu")
                .SET("menu_price = #{price}")
                .WHERE("menu_name = #{name}")
                .toString();
    }
    public String updateCategory(String name,String category){
        return new SQL()
                .UPDATE("tbl_menu")
                .SET("menu_category = #{category}")
                .WHERE("menu_name = #{name}")
                .toString();
    }


}
