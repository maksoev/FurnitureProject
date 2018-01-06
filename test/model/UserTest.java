/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class UserTest {

    public UserTest() {
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
     * Test of getName method, of class User.
     */
    @Test
    public void testCreateUser() {
        System.out.println("create user");

        User user = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");

        assertEquals(user.getId(), 1);
        assertEquals(user.getName(), "pavel");
        assertEquals(user.getLogin(), "maksoev");
        assertEquals(user.getPassword(), "12345");
        assertEquals(user.getCellphone(), "555555");
        assertEquals(user.getEmail(), "maksoev@gmail.com");
        assertEquals(user.getRoot(), "admin");

        user.setId(2);
        assertEquals(user.getId(), 2);

        user.setName("pavel");
        assertEquals(user.getName(), "pavel");

        user.setLogin("maksoev");
        assertEquals(user.getLogin(), "maksoev");

        user.setPassword("12345");
        assertEquals(user.getPassword(), "12345");

        user.setCellphone("555555");
        assertEquals(user.getCellphone(), "555555");

        user.setEmail("maksoev@gmail.com");
        assertEquals(user.getEmail(), "maksoev@gmail.com");

        user.setRoot("admin");
        assertEquals(user.getRoot(), "admin");

    }

    /**
     * Test of equals method, of class User.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        
        User user1 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        User user2 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        assertTrue(user1.equals(user2));
       

        user1 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        user2 = new User(2, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        assertFalse(user1.equals(user2));

        user1 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        user2 = new User(1, "matvei", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        assertFalse(user1.equals(user2));
        
        user1 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        user2 = new User(1, "pavel", "makarevich", "12345", "555555", "maksoev@gmail.com", "admin");
        assertFalse(user1.equals(user2));
                
        user1 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        user2 = new User(1, "pavel", "maksoev", "54321", "555555", "maksoev@gmail.com", "admin");
        assertFalse(user1.equals(user2));
                
        user1 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        user2 = new User(1, "pavel", "maksoev", "12345", "000000", "maksoev@gmail.com", "admin");
        assertFalse(user1.equals(user2));
                
        user1 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        user2 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev", "admin");
        assertFalse(user1.equals(user2));
                
        user1 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "admin");
        user2 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com", "");
        assertFalse(user1.equals(user2));
        
        user1 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com",null);
        user2 = new User(1, "pavel", "maksoev", "12345", "555555", "maksoev@gmail.com",null);
        assertTrue(user1.equals(user2));
    }

}
