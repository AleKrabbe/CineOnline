package model.entities;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * This entity represents an Actor.
 * It's used as a part of the cast of an movie displayed on the movie page
 * TODO: Search by actor.
 * 
 * @author palmeiira
 */
@Entity
public class Actor extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @OneToMany(fetch = FetchType.EAGER)
    private List<Award> awards;

    public Actor() {
        awards = new LinkedList<>();
    }

    public Actor(String fname, String lname, List<Award> awards) {
        super(fname, lname);
        this.awards = awards;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }
    
    public void addAward(Award award) {
        this.awards.add(award);
    }
    
    /* Our Methods */
    boolean acted (Movie movei)
    {
        return true;
    }

}
