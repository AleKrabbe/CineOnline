/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Transaction entity is used to gather all data upon the commitment of a rent.
 * Transations are related to Carts and should be instantiated by the time the rent 
 * is confirmed.
 * 
 * @author palmeiira
 */
@Entity
@Table(name = "\"TRANSACTION\"")
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "PRICE", nullable = false)
    private float price = 0.00f;
    
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Card card;
    
    public Transaction () {}
    
    public Transaction(float price, Card card) {
        this.price = price;
        this.card = card;
        java.util.Date utilDate = new java.util.Date();
        date = new Date(utilDate.getTime());
    }
    
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaction)) {
            return false;
        }
        Transaction other = (Transaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Transaction[ id=" + id + " ]";
    }
    
    /* Our methods */
    boolean charge () 
    {
        return true;
    }
    
    void cancel () 
    {
        
    }
    
}
