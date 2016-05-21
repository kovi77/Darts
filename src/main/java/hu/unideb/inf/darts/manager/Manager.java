/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.darts.manager;

import hu.unideb.inf.darts.model.Darts;
import hu.unideb.inf.darts.model.User;


/**
 *  {@code ManagerImpl} osztály interfésze.
 * @author Ak
 */
public interface Manager {

    /**
     * Beállítja a {@code Darts} kezdő {@code User}-ét.
     * @param playerOptions a kezdő játékos neve
     * @param player1 egy játékos
     * @param player2 egy játékos
     * @param darts egy darts
     */
    public void setPlayer(String playerOptions,User player1, User player2,Darts darts);

    /**
     * Beállítja a {@code Darts} kezdőpont számát.
     * @param scoreOptions kezdő pontszám értéke
     * @param darts egy darts
     */
    public void options(String scoreOptions,Darts darts);

    /**
     * Beállítja hány legből álljon egy {@code Darts}.
     * @param legs legek száma
     * @param darts egy darts
     */
    public void setLeg(String legs,Darts darts);

    /**
     * Beállítja az aktuális {@code User} pontszámát, levezeti a játék menetét.
     * @param num egy pontszám
     * @param darts egy darts
     */
    public void calc(int num,Darts darts);
 
    /**
     * Beállítja a végeredményt.
     * @param darts egy darts
     */
    public void setResults(Darts darts); 
}
