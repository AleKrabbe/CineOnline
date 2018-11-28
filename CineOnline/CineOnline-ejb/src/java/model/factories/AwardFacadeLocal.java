/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;

import java.util.List;
import javax.ejb.Local;
import model.entities.Award;

/**
 *
 * @author Alexandre Krabbe
 */
@Local
public interface AwardFacadeLocal {

    void create(Award award);

    void edit(Award award);

    void remove(Award award);

    Award find(Object id);

    List<Award> findAll();

    List<Award> findRange(int[] range);

    int count();
    
}
