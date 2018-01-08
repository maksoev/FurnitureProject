/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import model.Ad;
import model.User;
import model.Category;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author user
 */
public class AdDAL extends BaseDAL {
    
    public AdDAL(){
        super();
    }
    
    public List<User> selectAdForUser(int id)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        List<User> users =  session.selectList("ad.selectAdForUser", id); 
        session.close(); 
        return users;
    }
    
    public List<Category> selectAdForCategory(int id)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        List<Category> categoryes =  session.selectList("ad.selectAdForCategory", id); 
        session.close(); 
        return categoryes;
    }
    
    public List<Ad> selectAll()
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        List<Ad> ads =  session.selectList("ad.selectAll"); 
        session.close(); 
        return ads;
    }
    
    
    
    public Ad selectById(int id)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        Ad ad =  session.selectOne("ad.selectById", id); 
        session.close(); 
        return ad;
    }
    
    public int insert(Ad ad)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.insert("ad.insert", ad);
        session.commit();
        session.close(); 
        return  count;
    }
     public int update(Ad ad)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.update("ad.update", ad);
        session.commit(); 
        session.close(); 
        return  count;
    }
    public int delete(Ad ad)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.delete("ad.delete", ad);
        session.commit();
        session.close(); 
        return  count;
    }
    
}
