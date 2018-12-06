package model.entities;

import java.util.LinkedList;
import java.util.List;

/**
 * Cart is a class used to gather the movies a user chooses to rent
 * A Cart's information is volatile because Carts are not stored in the database.
 * 
 * @author palmeiira
 */
public class Cart {

    private float discount;
    private Cuppon cuppon;
    private float subTotal;
    private float total;
    List<Movie> movies;
    List<Transaction> transactions;

    public Cart() {
        subTotal = 0f;
        total = 0f;
        movies = new LinkedList<>();
        transactions = new LinkedList<>();
    }

    public float getDiscount() {
        return discount;
    }

    private void calculateDiscount() {
        if (cuppon != null) {
            this.discount = this.subTotal * cuppon.getPercentage();
        } else {
            this.discount = 0f;
        }
    }

    public Cuppon getCuppon() {
        return cuppon;
    }

    public void setCuppon(Cuppon cuppon) {
        if (cuppon != null) {
            this.cuppon = cuppon;
        }
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getTotal() {
        calculateDiscount();
        return subTotal - discount;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    /**
     * 
     * @param movie
     * @return movie added to the cart] 
     * adds the movie passed as parameter to this instance of cart 
     */
    public boolean addMovie(Movie movie) {
        subTotal += movie.getPrice();
        return movies.add(movie);
    }
    /**
     * 
     * @param movie
     * @return movie removed from the car
     * removes the movie from a instance of cart
     */
    public boolean removeMovie(Movie movie) {
        subTotal -= movie.getPrice();
        return movies.remove(movie);
    }

    public void newTransaction(Card c, float price) {
        transactions.add(new Transaction(price, c));
        subTotal -= price;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return movies.toString();
    }

}
