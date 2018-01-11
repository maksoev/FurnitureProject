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
        Ad ad = new Ad(25, "Продаю диван", "asdfghjkl", 135000, "omsk", date, null, 2,5);

        assertEquals(ad.getId(), 25);
        assertEquals(ad.getName(), "Продаю диван");
        assertEquals(ad.getDescription(), "asdfghjkl");
        assertEquals(ad.getPrice(), 135000);
        assertEquals(ad.getCity(), "omsk");
        assertEquals(ad.getDatepost(), date);
        assertEquals(ad.getUser_id(), 2);
        assertEquals(ad.getCategory_id(), 5);
    
    }

        
    }


