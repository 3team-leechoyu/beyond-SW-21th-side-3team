package store.provider;

import org.apache.ibatis.session.SqlSession;
import store.mapper.InsertMapper;
import store.model.dto.Selling;

import static store.model.dto.Template.getSqlSession;

public class InsertService {

    public void insertHistory(Selling s){
        SqlSession sqlSession = getSqlSession();
        InsertMapper mapper = sqlSession.getMapper(InsertMapper.class);
        int result = mapper.addHistory(s);
        if(result > 0){
            sqlSession.commit();
            System.out.println("매출 기록 등록 완료");
        } else {
            sqlSession.rollback();
            System.out.println("매출 기록 등록 실패");
        }
        sqlSession.close();

    }
}
