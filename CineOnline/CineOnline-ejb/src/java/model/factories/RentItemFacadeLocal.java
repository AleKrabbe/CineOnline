/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;

import java.util.List;
import javax.ejb.Local;
import model.entities.RentItem;
import model.entities.User;

/**
 *
 * @author Alexandre Krabbe
 */
@Local
public interface RentItemFacadeLocal {

    void create(RentItem rentItem);

    void edit(RentItem rentItem);

    void remove(RentItem rentItem);

    RentItem find(Object id);

    List<RentItem> findAll();
    
    List<RentItem> findByOwnerId(User u);

    List<RentItem> findRange(int[] range);

    int count();
    
}
