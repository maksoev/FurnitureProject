/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author user
 */
import DAL.AdDAL;
import java.util.List;
import model.Ad;
import model.User;
import model.Category;

/**
 *
 * @author user
 */
public class AdController {
    
     protected AdDAL adDAL;
    
    public AdController() {
        adDAL =  new AdDAL();
    }
  
    public List<User> selectAdForUser(int id)
    {
        return adDAL.selectAdForUser(id);
    }
    
    public List<Category> selectAdForCategory(int id)
    {
        return adDAL.selectAdForCategory(id);
    }
     
    public List<Ad> getAllAd()
    {
        return adDAL.selectAll();
    }
    
    public Ad getAdById(int id)
    {
        return adDAL.selectById(id);
    }
    
    public int insertAd(Ad ad)
    {
        return adDAL.insert(ad);
    }
    public int updateAd(Ad ad)
    {
        return adDAL.update(ad);
    }
    
     public int deleteAd(Ad ad)
    {
        return adDAL.delete(ad);
    }
    
}
