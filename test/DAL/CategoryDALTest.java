/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import model.Ad;
import model.Category;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Konstantin
 */
public class CategoryDALTest {
    
    public CategoryDALTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of selectAdForCategory method, of class CategoryDAL.
     */
    @Test
    public void testSelectAdForCategory() {
        System.out.println("selectAdForCategory");
        int id = 0;
        CategoryDAL instance = new CategoryDAL();
        List<Ad> result = instance.selectAdForCategory(id);
        assertTrue(result != null);
    }

    /**
     * Test of selectAll method, of class CategoryDAL.
     */
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        CategoryDAL instance = new CategoryDAL();
        List<Category> result = instance.selectAll();
        assertTrue(result != null && result.size() > 0);
    }

    /**
     * Test of selectById method, of class CategoryDAL.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 1;
        CategoryDAL instance = new CategoryDAL();
        Category result = instance.selectById(id);
           assertTrue(result != null);
    }

    /**
     * Test of insert method, of class CategoryDAL.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Category category = new Category(20,"test");
        CategoryDAL instance = new CategoryDAL();
        int expResult = 1;
        int result = instance.insert(category);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class CategoryDAL.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Category category = new Category(20,"test");
        CategoryDAL instance = new CategoryDAL();
        int expResult = 1;
        int result = instance.update(category);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class CategoryDAL.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Category category = new Category(20,null);
        CategoryDAL instance = new CategoryDAL();
        int expResult = 1;
        int result = instance.delete(category);
        assertEquals(expResult, result);
    }
    
}
