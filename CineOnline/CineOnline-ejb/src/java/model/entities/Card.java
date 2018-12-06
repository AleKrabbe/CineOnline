package model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
/**
 * Cards is a Entity that represent a User cards.
 * Alongside with an user's budget, it's used to
 * pay the rents of users.
 * 
 * @author palmeiira
 */
@Entity
public class Card implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    private String number;
    
    @Column(name = "ENDS_WITH")
    private String endsWith;
    
    @Column(name = "EXP_DATE")
    @Temporal(TemporalType.DATE)
    private Date expDate;
    
    @Column(name = "VALIDATOR")
    private int validator;
    
    @Column(name = "FLAG", nullable = false)
    private int flag;
    

    public Card() {
    }
    
    public Card(String number, Date expDate) {
        this.number = number;
        this.expDate = expDate;
    }
    
    public String getNumber() {
        return number;
    }
   /**
     * 
     * @param number
     * @return the number of the card and it's last 4 digits witch are stored into
     * endswith attribute.
     */
    public void setNumber(String number) {
        this.number = number;
        setEndsWith(number);
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public int getValidator() {
        return validator;
    }

    public void setValidator(int validator) {
        this.validator = validator;
    }

    public String getEndsWith() {
        return endsWith;
    }

    public void setEndsWith(String number) {
        this.endsWith = number;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
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
