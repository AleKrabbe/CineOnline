/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;

import java.util.List;
import javax.ejb.Local;
import model.entities.Card;

/**
 *
 * @author Alexandre Krabbe
 */
@Local
public interface CardFacadeLocal {

    void create(Card card);

    void edit(Card card);

    void remove(Card card);

    Card find(Object id);

    List<Card> findAll();

    List<Card> findRange(int[] range);

    int count();
    
}
