/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.entities.Director;

/**
 *
 * @author Alexandre Krabbe
 */
@Stateless
public class DirectorFacade extends AbstractFacade<Director> implements DirectorFacadeLocal {

    @PersistenceContext(unitName = "CineOnlinePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DirectorFacade() {
        super(Director.class);
    }
    
}
