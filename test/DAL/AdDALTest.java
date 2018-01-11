/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.Date;
import java.util.List;
import model.Ad;
import model.Category;
import model.User;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Konstantin
 */
public class AdDALTest {
    
    public AdDALTest() {
    }
    
    

    

    /**
     * Test of selectAll method, of class AdDAL.
     */
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        AdDAL instance = new AdDAL();
        List<Ad> result = instance.selectAll();
        assertTrue(result != null && result.size() > 0);
    }

    /**
     * Test of selectById method, of class AdDAL.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 2;
        AdDAL instance = new AdDAL();
        Ad result = instance.selectById(id);
        assertTrue(result != null);
    }

    /**
     * Test of insert method, of class AdDAL.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Date date = new Date(2018, 1, 6);
        Ad ad = new Ad(200, "Продаю диван", "asdfghjkl", 135000, "omsk", date, null, 2,5);
        AdDAL instance = new AdDAL();
        int expResult = 1;
        int result = instance.insert(ad);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSelectAdForUser() {
        System.out.println("selectAdForUser");
        AdDAL instance = new AdDAL();
        List<User> result = instance.selectAdForUser(200);
        assertTrue(result != null);
    }

    /**
     * Test of selectAdForCategory method, of class AdDAL.
     */
    @Test
    public void testSelectAdForCategory() {
        System.out.println("selectAdForCategory");
        AdDAL instance = new AdDAL();
        List<Category> result = instance.selectAdForCategory(200);
        assertTrue(result != null);
    }

    /**
     * Test of update method, of class AdDAL.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Date date = new Date(2018, 2, 8);
        Ad ad = new Ad(200, "название", "описание", 1350, "city", date, null, 1,4);
        AdDAL instance = new AdDAL();
        int expResult = 1;
        int result = instance.update(ad);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class AdDAL.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Date date = new Date(2018, 1, 6);
        Ad ad = new Ad(200, "название", "описание", 1350, "city", date, null, 1,4);
        AdDAL instance = new AdDAL();
        int expResult = 1;
        int result = instance.delete(ad);
        assertEquals(expResult, result);
    }
    
}
