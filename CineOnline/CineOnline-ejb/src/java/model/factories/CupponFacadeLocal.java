/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;

import java.util.List;
import javax.ejb.Local;
import model.entities.Cuppon;

/**
 *
 * @author Alexandre Krabbe
 */
@Local
public interface CupponFacadeLocal {

    void create(Cuppon cuppon);

    void edit(Cuppon cuppon);

    void remove(Cuppon cuppon);

    Cuppon find(Object id);

    List<Cuppon> findAll();

    List<Cuppon> findRange(int[] range);

    int count();
    
}
