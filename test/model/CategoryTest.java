/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class CategoryTest {

    public CategoryTest() {
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
     * Test of getId method, of class Category.
     */
    @Test
    public void TestCreateCategory() {
        System.out.println("create category");

        Date date = new java.sql.Date(2017, 1, 6);
        User user = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        Ad ad1 = new Ad(1, "Продаю диван", "asdfghjkl", 10000, "omsk", date, null, user);
        Ad ad2 = new Ad(2, "Продаю кровать", "Описание", 13500, "moscow", date, null, user);
        Ad ad3 = new Ad(3, "Продаю гараж", "Текст", 135000, "isilkul", date, null, user);

        ArrayList<Ad> adArrayList = new ArrayList<>();
        adArrayList.add(ad1);
        adArrayList.add(ad2);
        adArrayList.add(ad3);

        Category category = new Category(1, "Кровати", adArrayList);

        assertEquals(category.getAd().size(), adArrayList.size());
        assertEquals(category.getId(), 1);
        assertEquals(category.getName(), "Кровати");
        assertEquals(category.getAd().get(2), adArrayList.get(2));
        assertTrue(category.getAd().containsAll(adArrayList));
        
    }
    
    @Test
    public void TestEquals(){
        System.out.println("test equals");
        
        Date date = new java.sql.Date(2017, 1, 6);
        User user = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        Ad ad1 = new Ad(1, "Продаю диван", "asdfghjkl", 10000, "omsk", date, null, user);
        Ad ad2 = new Ad(2, "Продаю кровать", "Описание", 13500, "moscow", date, null, user);
        Ad ad3 = new Ad(3, "Продаю гараж", "Текст", 135000, "isilkul", date, null, user);

        ArrayList<Ad> adArrayList1 = new ArrayList<>();
        adArrayList1.add(ad2);
        adArrayList1.add(ad3);
        adArrayList1.add(ad1);

        ArrayList<Ad> adArrayList2 = new ArrayList<>();
        adArrayList2.add(ad3);
        adArrayList2.add(ad2);
        adArrayList2.add(ad1);
        
        Category category1 = new  Category(1, "Кровати", adArrayList1);
        Category category2 = new Category(1, "Кровати", adArrayList2);
        
        assertTrue(category1.equals(category2));
        
    }
}
