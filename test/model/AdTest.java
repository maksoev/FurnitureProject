/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class AdTest {

    public AdTest() {
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
     * Test of getId method, of class Ad.
     */
    @Test
    public void testCreateAd(){
    System.out.println("create ad");

        Date date = new Date(2018, 1, 6);
        User user = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        Ad ad = new Ad(1, "Продаю диван", "asdfghjkl", 135000, "omsk", date, null, user);

        assertEquals(ad.getId(), 1);
        assertEquals(ad.getName(), "Продаю диван");
        assertEquals(ad.getDescription(), "asdfghjkl");
        assertEquals(ad.getPrice(), 135000);
        assertEquals(ad.getCity(), "omsk");
        assertEquals(ad.getDatepost(), date);
        assertEquals(ad.getUser(), user);
    
    }
    
    @Test
    public void testEquals(){
        Date date1 = new Date(2018, 1, 6);
        Date date2 = new Date(2018, 1, 8);
        User user1 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        User user2 = new User(2, "pavel2", "maksoev2", "54321", "000000", "gmail.com", "user");
        
        Ad ad1 = new Ad(1, "Продаю диван", "asdfghjkl", 135000, "omsk", date1, null, user1);
        Ad ad2 = new Ad(1, "Продаю диван", "asdfghjkl", 135000, "omsk", date1, null, user1);
        assertEquals(ad1, ad2);
        
        ad1 = new Ad(1, "Продаю диван", "asdfghjkl", 135000, "omsk", date1, null, user1);
        ad2 = new Ad(2, "Продаю диван", "asdfghjkl", 135000, "omsk", date1, null, user1);
        assertFalse(ad1.equals(ad2));
        
        ad1 = new Ad(1, "Продаю диван", "asdfghjkl", 135000, "omsk", date1, null, user1);
        ad2 = new Ad(1, "Продаю кровать", "asdfghjkl", 135000, "omsk", date1, null, user1);
        assertFalse(ad1.equals(ad2));
        
        ad1 = new Ad(1, "Продаю диван", "asdfghjkl", 135000, "omsk", date1, null, user1);
        ad2 = new Ad(1, "Продаю диван", "описание", 135000, "omsk", date1, null, user1);
        assertFalse(ad1.equals(ad2));
        
        ad1 = new Ad(1, "Продаю диван", "asdfghjkl", 135000, "omsk", date1, null, user1);
        ad2 = new Ad(1, "Продаю диван", "asdfghjkl", 13500, "omsk", date1, null, user1);
        assertFalse(ad1.equals(ad2));
        
        ad1 = new Ad(1, "Продаю диван", "asdfghjkl", 135000, "omsk", date1, null, user1);
        ad2 = new Ad(1, "Продаю диван", "asdfghjkl", 135000, "moskow", date1, null, user1);
        assertFalse(ad1.equals(ad2));
        
        ad1 = new Ad(1, "Продаю диван", "asdfghjkl", 135000, "omsk", date1, null, user1);
        ad2 = new Ad(1, "Продаю диван", "asdfghjkl", 135000, "omsk", date2, null, user1);
        assertFalse(ad1.equals(ad2));
        
        ad1 = new Ad(1, "Продаю диван", "asdfghjkl", 135000, "omsk", date1, null, user1);
        ad2 = new Ad(1, "Продаю диван", "asdfghjkl", 135000, "omsk", date1, null, user2);
        assertFalse(ad1.equals(ad2));
        
    }
}

