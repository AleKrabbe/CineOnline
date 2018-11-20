/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;
import java.util.LinkedList;
import model.entities.Movie;
/**
 *
 * @author palmeiira
 */
public class MovieFactory {
    public boolean update(Movie card)
    {
        return true;
    }
    public boolean remove (Movie card)
    {
        return true;
    }
    public boolean save (Movie card)
    {
        return true;
    }
    public LinkedList<Movie> search (String name)
    {
        LinkedList<Movie> alfa = new LinkedList<>();
        return alfa;
    } 
}
