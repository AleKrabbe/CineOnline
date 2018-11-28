/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.entities.Award;

/**
 *
 * @author Alexandre Krabbe
 */
@Stateless
public class AwardFacade extends AbstractFacade<Award> implements AwardFacadeLocal {

    @PersistenceContext(unitName = "CineOnlinePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AwardFacade() {
        super(Award.class);
    }
    
}
