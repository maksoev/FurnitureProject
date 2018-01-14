/* 
* To change this license header, choose License Headers in Project Properties. 
* To change this template file, choose Tools | Templates 
* and open the template in the editor. 
*/ 
package controllers; 

import java.util.List; 
import model.Ad; 
import model.User; 
import org.junit.Test; 
import static org.junit.Assert.*; 

/** 
* 
* @author Konstantin 
*/ 
public class UserControllerTest { 

public UserControllerTest() { 
} 

@Test 
public void testGetAllUser() { 
System.out.println("getAllUser"); 
UserController instance = new UserController(); 
List<User> result = instance.getAllUser(); 
assertTrue(result != null && result.size() >= 1); 
} 

/** 
* Test of getAdForUser method, of class UserController. 
*/ 
@Test 
public void testGetAdForUser() { 
System.out.println("getAdForUser"); 
int id = 1; 
UserController instance = new UserController(); 
List<Ad> result = instance.getAdForUser(id); 
assertTrue(result != null ); 
} 

/** 
* Test of getUserById method, of class UserController. 
*/ 
@Test 
public void testGetUserById() { 
System.out.println("getUserById"); 
int id = 1; 
UserController instance = new UserController(); 
User result = instance.getUserById(id); 
assertTrue(result != null && result.getId() == 1); 
} 

/** 
* Test of insertUser method, of class UserController. 
*/ 
@Test 
public void testInsertUser() { 
System.out.println("insertUser"); 
User user = new User(100, "Alex", "alex123", "qwerty123", "89137320492", "alex@mail.ru", "user"); 
UserController instance = new UserController(); 
int expResult = 1; 
int result = instance.insertUser(user); 
assertEquals(expResult, result); 
} 

/** 
* Test of updateUser method, of class UserController. 
*/ 
@Test 
public void testUpdateUser() { 
System.out.println("updateUser"); 
User user = new User(10, "Frogedit", "Frog", "Frog123", "86584696574", "Frog@mail.ru", "user"); 
UserController instance = new UserController(); 
int expResult = 1; 
int result = instance.updateUser(user); 
assertEquals(expResult, result); 
} 

 
@Test 
public void testDeleteUser() { 
System.out.println("deleteUser"); 
User user = new User(100, null, null, null, null, null, null); 
UserController instance = new UserController(); 
int expResult = 1; 
int result = instance.deleteUser(user); 
assertEquals(expResult, result); 
} 
}
