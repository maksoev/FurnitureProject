/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import model.Ad;
import model.Category;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Konstantin
 */
public class CategoryControllerTest {
    
    public CategoryControllerTest() {
    }
    
  @Test
    public void testGetAllCategory() {
        System.out.println("getAllCategory");
        CategoryController instance = new CategoryController();
        List<Category> result = instance.getAllCategory();
       assertTrue(result != null && result.size() >= 1); 
    }
    /**
     * Test of getAdForCategory method, of class CategoryController.
     */
    @Test
    public void testGetAdForCategory() {
        System.out.println("getAdForCategory");
        int id = 1;
        CategoryController instance = new CategoryController();
        List<Ad> result = instance.getAdForCategory(id);
       assertTrue(result != null); 
    }

    /**
     * Test of getAllCategory method, of class CategoryController.
     */
  

    /**
     * Test of getCategoryById method, of class CategoryController.
     */
    @Test
    public void testGetCategoryById() {
        System.out.println("getCategoryById");
        int id = 1;
        CategoryController instance = new CategoryController();
        Category result = instance.getCategoryById(id);
      assertTrue(result != null && result.getId() == 1); 
    }

    /**
     * Test of insertCategory method, of class CategoryController.
     */
    @Test
    public void testInsertCategory() {
        System.out.println("insertCategory");
        Category category = new Category(20,"test");
        CategoryController instance = new CategoryController();
        int expResult = 1;
        int result = instance.insertCategory(category);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateCategory method, of class CategoryController.
     */
    @Test
    public void testUpdateCategory() {
    System.out.println("updateCategory"); 
    Category category = new Category(8, "Детская мебельEdit"); 
    CategoryController instance = new CategoryController(); 
    int expResult = 1; 
    int result = instance.updateCategory(category); 
    assertEquals(expResult, result); 
    }

    /**
     * Test of deleteCategory method, of class CategoryController.
     */
    @Test
    public void testDeleteCategory() {
           System.out.println("deleteCategory");
        Category category = new Category(20,null);
        CategoryController instance = new CategoryController();
        int expResult = 1;
        int result = instance.deleteCategory(category);
        assertEquals(expResult, result);
    }
    
}
