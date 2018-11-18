/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;
import java.util.LinkedList;
import model.entities.Card;
/**
 *
 * @author palmeiira
 */
public class CardFactory {
    public boolean update(Card card)
    {
        return true;
    }
    public boolean remove (Card card)
    {
        return true;
    }
    public boolean save (Card card)
    {
        return true;
    }
    public LinkedList<Card> search (String name)
    {
        LinkedList<Card> alfa = new LinkedList<>();
        return alfa;
    }    
}
