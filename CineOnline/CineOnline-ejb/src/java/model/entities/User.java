package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author palmeiira
 */
@Entity
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
    
    @ManyToMany
    private LinkedList<Card> cards;
    
    public User() {}
    
    public User(String cpf, String username, String fname, String lname, Date bDay, String email, LinkedList<Card> cards) {
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

    public LinkedList<Card> getCards() {
        return cards;
    }

    public void setCards(LinkedList<Card> cards) {
        this.cards = cards;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
