/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import model.Ad;
import model.User;
import org.junit.Test;
import static org.junit.Assert.*;


public class UserDALTest {
    
    public UserDALTest() {
    }
    
   
    @Test
    public void testSelectAll() {
   System.out.println("UserDal selectAll");
        UserDAL instance = new UserDAL();
        List<User> result = instance.selectAll();
        assertTrue(result != null && result.size() > 0);
    }

   
    @Test
    public void testSelectAdForUser() {
        System.out.println("UserDal selectAdForUser");
        UserDAL instance = new UserDAL();
        List<Ad> result = instance.selectAdForUser(100);
        assertTrue(result != null);
    }

   
    @Test
    public void testSelectById() {
        System.out.println("UserDal selectById");
        int id = 1;
        UserDAL instance = new UserDAL();
        User result = instance.selectById(id);
         assertTrue(result != null);
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        User user = new User(100,"Alex","alex123","qwerty123","89137320492","alex@mail.ru","NULL");
        UserDAL instance = new UserDAL();
        int expResult = 1;
        int result = instance.insert(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class UserDAL.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        User user = new User(100,"Alex","alex123","qwerty123","89137320492","alex@mail.ru","NULL");
        UserDAL instance = new UserDAL();
        int expResult = 1;
        int result = instance.update(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class UserDAL.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
       User user = new User(100,null,null,null,null,null,null);
        UserDAL instance = new UserDAL();
        int expResult = 1;
        int result = instance.delete(user);
        assertEquals(expResult, result);
    }
    
}
