package store.provider;

import org.apache.ibatis.jdbc.SQL;
import store.model.dto.Selling;

public class SqlInsertProvider {
    public String addHistory(Selling s){
        return new SQL()
                .INSERT_INTO("Selling")
                .VALUES("name", "# { name }")
                .VALUES("category", "# { categoryInt }")
                .VALUES("price", "# { price }")
                .VALUES("count", "#{ count }")
                .toString();
    }
}
