/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAL.UserDAL;
import java.util.List;
import model.Ad;
import model.User;

/**
 *
 * @author user
 */
    public class UserController {
    
    protected UserDAL userDAL;
    
    public UserController() {
        userDAL =  new UserDAL();
    }
    
    public List<User> getAllUser()
    {
        return userDAL.selectAll();
    }

    public List<Ad> selectAdForUser(int id)
    {
        return userDAL.selectAdForUser(id);
    }
    
    public User getUserById(int id)
    {
        return userDAL.selectById(id);
    }
    
    public int insertUser(User user)
    {
        return userDAL.insert(user);
    }
    public int updateUser(User user)
    {
        return userDAL.update(user);
    }
    
     public int deleteUser(User user)
    {
        return userDAL.delete(user);
    }
    
}
