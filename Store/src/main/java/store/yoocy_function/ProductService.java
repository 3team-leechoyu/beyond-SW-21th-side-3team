package com.mybatis.first_function;

import com.mybatis.first_function.dto.Product;
import org.apache.ibatis.session.SqlSession;
import static com.mybatis.first_function.common.Template.getSqlSession;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ProductService {

    public List<Product> searchByName(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();
        DynamicSqlMapper dynamicSqlMapper = sqlSession.getMapper(DynamicSqlMapper.class);

        List<Product> productList = dynamicSqlMapper.searchByName(criteria);

        sqlSession.close();

        return productList;
    }

    public List<Product> searchByCategory(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();
        DynamicSqlMapper dynamicSqlMapper = sqlSession.getMapper(DynamicSqlMapper.class);

        List<Product> productList = dynamicSqlMapper.searchByCategory(criteria);

        sqlSession.close();

        return productList;
    }

    public void sortByExpirationDate(List<Product> list) {
        list.sort(Comparator.comparing(Product::getDate));
    }

    public void sortByLotStock(List<Product> list) {
        list.sort(Comparator.comparing(Product::getStock).reversed());
    }

    public void sortByLessStock(List<Product> list) {
        list.sort(Comparator.comparing(Product::getStock));
    }


    public int insertProduct(Product p) {
        SqlSession sqlSession = getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        int result = mapper.insertProduct(p);

        if(result > 0) {
            sqlSession.commit();
            System.out.println("상품이 등록되었습니다.");
        }
        else sqlSession.rollback();

        return result;
    }

    public int deleteProduct(String name) {
        SqlSession sqlSession = getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        int result = mapper.deleteProduct(name);

        if(result > 0) sqlSession.commit();
        else sqlSession.rollback();

        sqlSession.close();
        return result;
    }
}
