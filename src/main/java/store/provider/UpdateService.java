package store.provider;

import org.apache.ibatis.session.SqlSession;
import store.model.dto.Selling;

import static store.model.dto.Template.getSqlSession;

public class UpdateService {
    public void updateprice(String name,int price){
        SqlSession sqlSession = getSqlSession();
        UpdateMapper mapper = sqlSession.getMapper(UpdateMapper.class);
        int result = mapper.updatePrice(name,price);
        if(result > 0) {
            sqlSession.commit();
            System.out.println("메뉴 수정 완료");
        } else {
            sqlSession.rollback();
            System.out.println("메뉴 수정 실패");
        }
        sqlSession.close();

    }

    public void updatecategory(String name, String category) {
        SqlSession sqlSession = getSqlSession();
        UpdateMapper mapper = sqlSession.getMapper(UpdateMapper.class);
        int result = mapper.updateCategory(name,category);
        if(result > 0) {
            sqlSession.commit();
            System.out.println("메뉴 수정 완료");
        } else {
            sqlSession.rollback();
            System.out.println("메뉴 수정 실패");
        }
        sqlSession.close();
    }

    public void updateStock(Selling selling){
        SqlSession sqlSession = getSqlSession();
        UpdateMapper mapper = sqlSession.getMapper(UpdateMapper.class);
        int result = mapper.updateStock(selling);
        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
            System.out.println("재고 수정 실패");
        }
        sqlSession.close();

    }

}
