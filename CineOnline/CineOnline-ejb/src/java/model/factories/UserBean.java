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

    public UserBean() {
        user = null;
    }
    
    @Override
    public User getUser() {
        if (user == null) {
            return new User();
        }
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }
    
}
