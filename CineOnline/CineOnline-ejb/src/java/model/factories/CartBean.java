package model.factories;

import java.util.Calendar;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import model.entities.Card;
import model.entities.Cart;
import model.entities.Movie;
import model.entities.RentItem;
import model.entities.User;

/**
 *
 * @author Alexandre Krabbe
 */
@Stateful
public class CartBean implements CartBeanLocal {

    @EJB
    private RentItemFacadeLocal rentItemFacade;

    @EJB
    private MovieFacadeLocal movieEJB;

    private Cart sessionCart;

    public CartBean() {
        sessionCart = new Cart();
    }
     /**
     *
     * @param id
     * @return the movie added to the cart
     * This method uses it's parameter do find the movie and then calls Cart's 
     * addMovie() so it can be added.
     */
    @Override
    public boolean addMovie(int id) {
        Movie movie = movieEJB.find(id);
        return sessionCart.addMovie(movie);
    }

    @Override
    public Cart getCart() {
        return sessionCart;
    }
    /**
     *
     * @param id
     * @return the movie removed from the cart
     * This method uses it's parameter do find the movie and then calls Cart's 
     * removeMovie() so it can be removed.
     */
    @Override
    public boolean removeMovie(int id) {
        return sessionCart.removeMovie(movieEJB.find(id));
    }

    @Override
    public void clearCart() {
        sessionCart = new Cart();
    }

    @Override
    public void newTransaction(Card card, float value) {
        sessionCart.newTransaction(card, value);
    }

    @Override
    public boolean finish(User user) {
        if (sessionCart.getTotal() <= 0) {
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DAY_OF_YEAR, 2);
            Date expDate = c.getTime();
            for (Movie m : sessionCart.getMovies()) {
                RentItem rentItem = new RentItem(expDate, new Date(), m, user);
                rentItemFacade.create(rentItem);
            }
            clearCart();
            return true;
        }
        return false;
    }

}
