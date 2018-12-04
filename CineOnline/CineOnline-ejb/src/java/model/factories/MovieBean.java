package model.factories;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import model.entities.Movie;

/**
 *
 * @author Alexandre Krabbe
 */
@Stateless
public class MovieBean implements MovieBeanLocal {

    @EJB
    private MovieFacadeLocal movieFacade;
    
    private Movie movie;

    public MovieBean() {
    }

    public MovieBean(Movie movie) {
        this.movie = movie;
    }

    @Override
    public Movie getMovie() {
        return movie;
    }

    @Override
    public void setMovie(int movieId) {
        this.movie = movieFacade.find(movieId);
    }
    
}
