/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAL.CategoryDAL;
import java.util.List;
import model.Ad;
import model.Category;

/**
 *
 * @author user
 */
public class CategoryController {
    
    protected CategoryDAL categoryDAL;
    
    public CategoryController() {
        categoryDAL =  new CategoryDAL();
    }

    public List<Ad> selectAdForCategory(int id)
    {
        return categoryDAL.selectAdForCategory(id);
    }
    
    public List<Category> getAllCategory()
    {
        return categoryDAL.selectAll();
    }
    
    public Category getCategoryById(int id)
    {
        return categoryDAL.selectById(id);
    }
    
    public int insertCategory(Category category)
    {
        return categoryDAL.insert(category);
    }
    public int updateCategory(Category category)
    {
        return categoryDAL.update(category);
    }
    
     public int deleteCategory(Category category)
    {
        return categoryDAL.delete(category);
    }
    
}
