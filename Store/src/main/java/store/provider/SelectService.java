package store.provider;

import org.apache.ibatis.session.SqlSession;
import store.model.dto.Product;

import java.util.List;

import static store.model.dto.Template.getSqlSession;

public class SelectService {

    public void selectCategoryHistory(){
        SqlSession sqlSession = getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Product> p = mapper.historyCategory();

        if(p != null && !p.isEmpty()){
            p.forEach(System.out::println);
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }
        sqlSession.close();



    }

    public List<Product> selectAllProduct(){
        SqlSession sqlSession = getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Product> p = mapper.allProduct();
        if(p != null && !p.isEmpty()){
            p.forEach(System.out::println);
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }
        sqlSession.close();

        return p;
    }

    public void selectDateHistory() {
        SqlSession sqlSession = getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
    }
}
