/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Date;
import java.util.List;
import model.Ad;
import model.Category;
import model.User;
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
public class AdControllerTest {
    
    public AdControllerTest() {
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
     * Test of getAdForUser method, of class AdController.
     */
    @Test
    public void testGetAdForUser() {
        System.out.println("getAdForUser");
        int id = 1;
        AdController instance = new AdController();
        List<User> result = instance.getAdForUser(id);
       assertTrue(result != null ); 
    }

    /**
     * Test of getAdForCategory method, of class AdController.
     */
    @Test
    public void testGetAdForCategory() {
        System.out.println("getAdForCategory");
        int id = 1;
        AdController instance = new AdController();
        List<Category> result = instance.getAdForCategory(id);
        assertTrue(result != null ); 
    }

    /**
     * Test of getAllAd method, of class AdController.
     */
    @Test
    public void testGetAllAd() {
        System.out.println("getAllAd");
        AdController instance = new AdController();
        List<Ad> result = instance.getAllAd();
        assertTrue(result != null && result.size() >= 1); 
    }

    /**
     * Test of getAdById method, of class AdController.
     */
    @Test
    public void testGetAdById() {
        System.out.println("getAdById");
        int id = 1;
        AdController instance = new AdController();
        Ad result = instance.getAdById(id);
        assertTrue(result != null && result.getId() == 1); 
    }

    /**
     * Test of insertAd method, of class AdController.
     */
    @Test
    public void testInsertAd() {
        System.out.println("insertAd");
        Date date = new Date(2018, 1, 6);
        Ad ad = new Ad(201, "Продаю диван", "asdfghjkl", 135000, "omsk", date, null, 2,5);
        AdController instance = new AdController();
        int expResult = 1;
        int result = instance.insertAd(ad);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateAd method, of class AdController.
     */
    @Test
    public void testUpdateAd() {
        System.out.println("updateAd");
        Date date = new Date(2018, 1, 6);
        Ad ad = new Ad(20, "Стол", "почти идеальное состояние", 2400, "Омск", date, null, 5,1);
        AdController instance = new AdController();
        int expResult = 1;
        int result = instance.updateAd(ad);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteAd method, of class AdController.
     */
    @Test
    public void testDeleteAd() {
        System.out.println("deleteAd");
       Date date = new Date(2018, 1, 6);
        Ad ad = new Ad(201, "Продаю диван", "asdfghjkl", 135000, "omsk", date, null, 2,5);
        AdController instance = new AdController();
        int expResult = 1;
        int result = instance.deleteAd(ad);
        assertEquals(expResult, result);
    }
    
}
