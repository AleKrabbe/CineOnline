package model.factories;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import model.entities.Cart;
import model.entities.Movie;

/**
 *
 * @author Alexandre Krabbe
 */
@Stateful
public class CartBean implements CartBeanLocal {

    @EJB
    private MovieFacadeLocal movieEJB;
    
    private Cart sessionCart;  

    public CartBean() {
        sessionCart = new Cart();
    }
    
    @Override
    public boolean addMovie(int id) {
        Movie movie = movieEJB.find(id);
        return sessionCart.addMovie(movie);
    }

    @Override
    public Cart getCart() {
        return sessionCart;
    }  

    @Override
    public boolean removeMovie(int id) {
        return sessionCart.removeMovie(movieEJB.find(id));
    }
    
}
