/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
/**
 *
 * @author user
 */
public class Ad {
    private int id;
    private String name;
    private String description;
    private int price;
    private String city;
    private Date datepost;
    private byte[] image;
    private User user;
    
    public Ad() {
    }

    public Ad(int id, String name, String description, int price, String city, Date datepost, byte[] image, User user) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.city = city;
        this.datepost = datepost;
        this.image = image;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String getCity() {
        return city;
    }

    public Date getDatepost() {
        return datepost;
    }

    public byte[] getImage() {
        return image;
    }

    public User getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDatepost(Date datepost) {
        this.datepost = datepost;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.user);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ad other = (Ad) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.datepost, other.datepost)) {
            return false;
        }
        if (!Arrays.equals(this.image, other.image)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ad{" + "id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", city=" + city + ", datepost=" + datepost + ", image=" + image + ", user=" + user + '}';
    }
     
    
}
