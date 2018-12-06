/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.entities.Cuppon;

/**
 *
 * @author Alexandre Krabbe
 */
@Stateless
public class CupponFacade extends AbstractFacade<Cuppon> implements CupponFacadeLocal {

    @PersistenceContext(unitName = "CineOnlinePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CupponFacade() {
        super(Cuppon.class);
    }
    
}
