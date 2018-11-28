package model.entities;

import java.util.List;

/**
 *
 * @author palmeiira
 */
public class Cart {
    
    private float discount;
    private String cuppon;
    List<Movie> movies;
    List<Transaction> transactions;

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
    
    public void newTransaction(Card c){
        transactions.add(new Transaction());
    }
    
}
