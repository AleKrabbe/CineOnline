package model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * This entity represents a Director.
 * It's used as the director label displayed on the movie page
 * TODO: Search by Director.
 * 
 * @author palmeiira
 */
@Entity
public class Director extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @OneToMany(fetch = FetchType.EAGER)
    private List<Award> awards;

    public Director (){}
    
    public Director(String fname, String lname, List<Award> awards) {
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
    
    /* Our methods */
    boolean directed (Movie movie)
    {
        return true;
    }

}
