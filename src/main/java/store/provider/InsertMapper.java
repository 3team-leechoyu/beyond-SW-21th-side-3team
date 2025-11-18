package store.provider;


import org.apache.ibatis.annotations.InsertProvider;
import store.model.dto.Selling;

public interface InsertMapper {
    @InsertProvider(type = SqlInsertProvider.class, method = "addHistory")
    int addHistory(Selling selling);
}
