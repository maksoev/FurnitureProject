/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Category {
    private int id;
    private String name;
    private List<Ad> ad;

    public Category(){
        ad = new ArrayList<>();
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
        ad = new ArrayList<>();
    }
    public Category(int id, String name, List<Ad> ad) {
        this.id = id;
        this.name = name;
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Ad> getAd() {
        return ad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAd(List<Ad> ad) {
        this.ad = ad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.name);
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
        final Category other = (Category) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + '}';
    }
    
    
    
}
