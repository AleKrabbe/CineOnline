/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RentItem entity represents a single item from a possible Rent.
 * The idea of this entity is to allow us to easily gather information
 * about a single object rented, suck as expiration date or start date.
 * 
 * @author palmeiira
 */
@Entity
public class RentItem implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "EXP_DATE")
    @Temporal(TemporalType.DATE)
    private Date expDate;
    
    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @OneToOne(fetch = FetchType.EAGER)
    private Movie movie;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private User owner;

    public RentItem() {
    }  

    public RentItem(Date expDate, Date startDate, Movie movie, User owner) {
        this.expDate = expDate;
        this.startDate = startDate;
        this.movie = movie;
        this.owner = owner;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovies(Movie movie) {
        this.movie = movie;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
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
        if (!(object instanceof RentItem)) {
            return false;
        }
        RentItem other = (RentItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.RentItem[ id=" + id + " ]";
    }
    
    /* Our methods */
    int remainingDays () 
    {
        return 1;
    }
}
