/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.darts.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A {@code User}-ek adatszerkezetét reprezentáló osztály.
 * @author Ak
 */
@XmlRootElement(name = "users")
@XmlAccessorType(XmlAccessType.FIELD)
public class Users {

    @XmlElement(name = "user")
    private List<User> users = null;

    /**
     * Üres konstruktor a {@code User} objektumhoz.
     */
    public Users() {
    }

    /**
     * Visszaadja a {@code User}-et egy listában.
     * @return felhasználók
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Beállítja a listát.
     * @param users felhasználókat tartalmazó lista
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }
}
