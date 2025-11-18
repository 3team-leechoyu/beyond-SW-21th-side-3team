package store.mapper;


import org.apache.ibatis.annotations.InsertProvider;
import store.model.dto.Selling;
import store.provider.SqlInsertProvider;

public interface InsertMapper {
    @InsertProvider(type = SqlInsertProvider.class, method = "addHistory")
    int addHistory(Selling selling);
}
