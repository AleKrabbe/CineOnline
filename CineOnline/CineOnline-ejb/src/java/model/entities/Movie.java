package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author palmeiira
 */
@Entity
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "TITLE", length = 100, nullable = false)
    private String title;
    
    @Column(name = "DURATION", nullable = false)
    private int duration;
    
    @Column(name = "RATING", columnDefinition="Decimal(1,1) default '0.0'")
    private float rating;
    
    @Column(name = "RELEASE_DATE")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    
    @OneToOne
    private Director director;
    
    @ManyToMany
    private LinkedList<Actor> cast;
    
    @OneToMany
    private LinkedList<Award> awards;
    
    @ManyToMany
    private LinkedList<Genre> genres;
    
    public Movie(){}
    
    public Movie(String title, int duration, Date releaseDate, float rating, Director director, LinkedList<Actor> cast, LinkedList<Award> awards, LinkedList<Genre> genres) {
        this.title = title;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.director = director;
        this.cast = cast;
        this.awards = awards;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public LinkedList<Actor> getCast() {
        return cast;
    }

    public void setCast(LinkedList<Actor> cast) {
        this.cast = cast;
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

    public LinkedList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(LinkedList<Genre> genres) {
        this.genres = genres;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
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
        if (!(object instanceof Movie)) {
            return false;
        }
        Movie other = (Movie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Movie[ id=" + id + " ]";
    }
    
}
