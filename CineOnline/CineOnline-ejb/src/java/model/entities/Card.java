package model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author palmeiira
 */
@Entity
public class Card implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    private String number;
    
    @Column(name = "EXP_DATE")
    @Temporal(TemporalType.DATE)
    private Date expDate;

    public Card() {
    }
    
    public Card(String number, Date expDate) {
        this.number = number;
        this.expDate = expDate;
    }
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (number != null ? number.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Card)) {
            return false;
        }
        Card other = (Card) object;
        if ((this.number == null && other.number != null) || (this.number != null && !this.number.equals(other.number))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Card[ id=" + number + " ]";
    }
    
}
