/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.entities.RentItem;
import model.entities.User;

/**
 *
 * @author Alexandre Krabbe
 */
@Stateless
public class RentItemFacade extends AbstractFacade<RentItem> implements RentItemFacadeLocal {

    @PersistenceContext(unitName = "CineOnlinePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RentItemFacade() {
        super(RentItem.class);
    }

    @Override
    public List<RentItem> findByOwnerId(User u) {

        Query q = em.createQuery("SELECT r FROM RentItem WHERE r.owner = :user", RentItem.class);
        q.setParameter("user", u);

        try {
            List<RentItem> r = (List<RentItem>) q.getResultList();
            return r;
        } catch (NoResultException e) {
            return null;
        }

    }

}
