package model.entities;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author palmeiira
 */
public class Cart {
    
    private float discount;
    private String cuppon;
    private float subTotal;
    List<Movie> movies;
    List<Transaction> transactions;

    public Cart() {
        subTotal = 0f;
        movies = new LinkedList<>();
        transactions = new LinkedList<>();
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

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }
    
    public boolean addMovie (Movie movie) {
        subTotal += movie.getPrice();
        return movies.add(movie);
    }
    
    public boolean removeMovie (Movie movie){
        subTotal -= movie.getPrice();
        return movies.remove(movie);
    }
    
    public void newTransaction(Card c){
        transactions.add(new Transaction());
    }
    
    public List getMovies(){
        return movies;
    }

    @Override
    public String toString() {
        return movies.toString();
    }
    
}
