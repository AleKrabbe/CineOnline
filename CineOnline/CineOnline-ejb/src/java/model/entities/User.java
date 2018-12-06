package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * User Entity represents CineOnline's users.
 * It gathers all registration info and stores it in the database.
 * Its possible to see the usage of such info at the home screen, where we can
 * see a user's name or at the payment screen where all user's card are brought
 * to interface for users's commodity.
 * 
 * @author palmeiira
 */
@Entity
@Table(name = "USR")
public class User extends Person implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "CPF", unique = true, nullable = false)
    private String cpf;
    
    @Column(name = "USERNAME", length = 20, nullable = false, unique = true)
    private String username;
    
    @Column(name = "BDAY")
    @Temporal(TemporalType.DATE)
    private Date bDay;
    
    @Column(name = "EMAIL", length = 100, nullable = false, unique = true)
    private String email;
    
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Card> cards;
    
    public User() {
        super();
    }
    
    public User(String cpf, String username, String fname, String lname, Date bDay, String email, List<Card> cards) {
        super(fname, lname);
        this.cpf = cpf;
        this.username = username;
        this.bDay = bDay;
        this.email = email;
        this.cards = cards;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getbDay() {
        return bDay;
    }

    public void setbDay(Date bDay) {
        this.bDay = bDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
