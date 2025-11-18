package store.provider;

import org.apache.ibatis.session.SqlSession;
import store.mapper.SelectMapper;
import store.model.dto.Product;
import store.model.dto.Selling;

import java.util.List;
import java.util.Scanner;

import static store.model.dto.Template.getSqlSession;

public class SelectService {

    public void selectCategoryHistory(int category_id){
        Scanner sc=new Scanner(System.in);
        SqlSession sqlSession = getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Selling> p = mapper.historyCategory(category_id);




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
        List<Selling> p = mapper.historyDate();

        if(p != null && !p.isEmpty()){
            p.forEach(System.out::println);
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }
        sqlSession.close();

    }

    public void selectNameHistory(String name) {
        SqlSession sqlSession = getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Selling> p = mapper.historyName(name);

        if(p != null && !p.isEmpty()){
            p.forEach(System.out::println);
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }
        sqlSession.close();
    }
}
