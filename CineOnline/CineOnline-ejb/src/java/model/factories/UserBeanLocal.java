/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;

import javax.ejb.Local;
import model.entities.User;

/**
 *
 * @author Alexandre Krabbe
 */
@Local
public interface UserBeanLocal {

    public void setUser(User user);

    public User getUser();
    
}
