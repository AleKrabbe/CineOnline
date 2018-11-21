package model.entities;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author palmeiira
 */
@Entity
public class Director extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @OneToMany
    private LinkedList<Award> awards;

    public Director (){}
    
    public Director(String fname, String lname, LinkedList<Award> awards) {
        super(fname, lname);
        this.awards = awards;
    }  

    public LinkedList<Award> getAwards() {
        return awards;
    }

    public void setAwards(LinkedList<Award> awards) {
        this.awards = awards;
    }
    
    public void addAward(Award award) {
        this.awards.add(award);
    }
    
    /* Our methods */
    boolean directed (Movie movie)
    {
        return true;
    }
}
