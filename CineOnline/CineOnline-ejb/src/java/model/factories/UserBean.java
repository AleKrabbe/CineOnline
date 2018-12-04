package model.factories;

import javax.ejb.Stateful;
import model.entities.User;

/**
 *
 * @author Alexandre Krabbe
 */
@Stateful
public class UserBean implements UserBeanLocal {

    private User user;

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }
    
}
