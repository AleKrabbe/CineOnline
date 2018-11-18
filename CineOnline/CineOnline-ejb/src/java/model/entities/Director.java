/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author palmeiira
 */
@Entity
public class Director implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /* Attributes */
    private Integer id;
    LinkedList<String> awards;

    public Director (){}
    
    public Director(Integer id, LinkedList<String> awards) {
        this.id = id;
        this.awards = awards;
    }  
    
    public Integer getId() {
        return id;
    }

    public LinkedList<String> getAwards() {
        return awards;
    }

    public void setAwards(LinkedList<String> awards) {
        this.awards = awards;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof Director)) {
            return false;
        }
        Director other = (Director) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Director[ id=" + id + " ]";
    }
    /* Our methods */
    boolean directed (Movie movie)
    {
        return true;
    }
}
