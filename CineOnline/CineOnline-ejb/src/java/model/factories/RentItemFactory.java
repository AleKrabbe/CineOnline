/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;
import java.util.LinkedList;
import model.entities.RentItem;
/**
 *
 * @author palmeiira
 */
public class RentItemFactory {
    public boolean update(RentItem card)
    {
        return true;
    }
    public boolean remove (RentItem card)
    {
        return true;
    }
    public boolean save (RentItem card)
    {
        return true;
    }
    public LinkedList<RentItem> search (String name)
    {
        LinkedList<RentItem> alfa = new LinkedList<>();
        return alfa;
    }
}
