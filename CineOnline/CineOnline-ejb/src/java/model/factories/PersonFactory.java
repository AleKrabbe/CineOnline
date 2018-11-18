/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.factories;
import java.util.LinkedList;
import model.entities.Person;

/**
 *
 * @author palmeiira
 */
public class PersonFactory {
    public boolean update(Person card)
    {
        return true;
    }
    public boolean remove (Person card)
    {
        return true;
    }
    public boolean save (Person card)
    {
        return true;
    }
    public LinkedList<Person> search (String name)
    {
        LinkedList<Person> alfa = new LinkedList<>();
        return alfa;
    }
}
