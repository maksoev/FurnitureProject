/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import model.Ad;
import model.Category;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author user
 */
public class CategoryDAL extends BaseDAL {
    
    public CategoryDAL(){
        super();
    }
    
    public List<Ad> selectAdForCategory(int id)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        List<Ad> ads =  session.selectList("category.selectAdForCategory", id); 
        session.close(); 
        return ads;
    }
    
    public List<Category> selectAll()
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        List<Category> categoryes =  session.selectList("category.selectAll"); 
        session.close(); 
        return categoryes;
    }
    
    
    
    public Category selectById(int id)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        Category category =  session.selectOne("category.selectById", id); 
        session.close(); 
        return category;
    }
    
    public int insert(Category category)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.insert("category.insert", category);
        session.commit();
        session.close(); 
        return  count;
    }
     public int update(Category category)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.update("category.update", category);
        session.commit(); 
        session.close(); 
        return  count;
    }
    public int delete(Category category)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.delete("category.delete", category);
        session.commit();
        session.close(); 
        return  count;
    }
}
