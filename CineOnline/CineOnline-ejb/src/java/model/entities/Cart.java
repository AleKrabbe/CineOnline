/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.LinkedList;

/**
 *
 * @author palmeiira
 */
public class Cart {
    private float discount;
    private String cuppon;
    LinkedList<Movie> movies;

    public Cart(float discount, String cuppon) {
        this.discount = discount;
        this.cuppon = cuppon;
    }
    
    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getCuppon() {
        return cuppon;
    }

    public void setCuppon(String cuppon) {
        this.cuppon = cuppon;
    }
    
    public boolean addMovie (Movie movie) {
        return true;
    }
    public boolean removeMovie (Movie movie){
        return true;
    }
}
