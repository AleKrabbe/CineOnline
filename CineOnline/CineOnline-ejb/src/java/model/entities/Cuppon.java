package model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Alexandre Krabbe
 */
@Entity
public class Cuppon implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "CODE", nullable = false)
    private String code;
    
    @Column(name = "PERCENTAGE", nullable = false)
    private float percentage = 0.00f;
    
    @Column(name = "DESCRIPTION")
    private String description;

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuppon)) {
            return false;
        }
        Cuppon other = (Cuppon) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.entities.Cuppon[ id=" + code + " ]";
    }
    
}
