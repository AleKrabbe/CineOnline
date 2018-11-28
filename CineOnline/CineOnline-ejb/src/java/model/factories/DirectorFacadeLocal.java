/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;

import java.util.List;
import javax.ejb.Local;
import model.entities.Director;

/**
 *
 * @author Alexandre Krabbe
 */
@Local
public interface DirectorFacadeLocal {

    void create(Director director);

    void edit(Director director);

    void remove(Director director);

    Director find(Object id);

    List<Director> findAll();

    List<Director> findRange(int[] range);

    int count();
    
}
