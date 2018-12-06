package model.factories;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateful;
import model.entities.Card;
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
     /**
     *
     * @return current user in case user != null or
     * new User object when user = null
     */
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

    @Override
    public Card getCardByIndex(int index) {
        User u = this.getUser();
        List<Card> cards = u.getCards();
        if (index < cards.size()) {
            return cards.get(index);
        }
        return null;
    }
    
}
