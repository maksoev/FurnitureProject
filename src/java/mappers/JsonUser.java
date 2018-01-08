/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Lenovo-ПК
 */
public class JsonUser {
        public static String toJSON(User user)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(user);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static String toJSON(List<User> users)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(users);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static User fromJSON(String jsonUser)
    {
        ObjectMapper mapper = new ObjectMapper();
        User user;
        try {
            user = (User)mapper.readValue(jsonUser,User.class);
            return user;
        } catch (IOException ex) {
            Logger.getLogger(JsonUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;

    }
}
