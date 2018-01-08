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
import model.Ad;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Lenovo-ПК
 */
public class JsonAd {
     public static String toJSON(Ad ad)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(ad);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonAd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static String toJSON(List<Ad> ad)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String res =  mapper.writeValueAsString(ad);
            return res;
        } catch (IOException ex) {
            Logger.getLogger(JsonAd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public static Ad fromJSON(String jsonAd)
    {
        ObjectMapper mapper = new ObjectMapper();
        Ad ad;
        try {
            ad = (Ad)mapper.readValue(jsonAd,Ad.class);
            return ad;
        } catch (IOException ex) {
            Logger.getLogger(JsonAd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
