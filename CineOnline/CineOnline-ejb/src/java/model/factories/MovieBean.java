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
    /**
     * 
     * @param movieId 
     * This method use it's parameter to fetch a movie on the database and then
     * sets the movie object as this movie from the database.
     */
    @Override
    public void setMovie(int movieId) {
        this.movie = movieFacade.find(movieId);
    }
    
}
