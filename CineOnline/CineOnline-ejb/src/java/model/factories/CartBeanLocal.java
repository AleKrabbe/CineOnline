/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;

import javax.ejb.Local;
import model.entities.Card;
import model.entities.Cart;
import model.entities.User;

/**
 *
 * @author Alexandre Krabbe
 */
@Local
public interface CartBeanLocal{
    
    public boolean addMovie(int id);
    
    public boolean removeMovie(int id);
    
    public Cart getCart(); 

    void clearCart();

    void newTransaction(Card card, float value);

    boolean finish(User user);
    
}
