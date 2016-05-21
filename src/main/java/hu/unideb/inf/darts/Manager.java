/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.darts;


/**
 *
 * @author Ak
 */
public interface Manager {

    /**
     *
     * @param playerOptions a kezdő játékos neve
     * @param player1
     * @param player2
     * @param darts
     */
    public void setPlayer(String playerOptions,User player1, User player2,Darts darts);

    /**
     *
     * @param scoreOptions kezdő pontszám értéke
     * @param darts
     */
    public void options(String scoreOptions,Darts darts);

    /**
     *
     * @param legs játszani kívánt legek száma
     * @param darts
     */
    public void setLeg(String legs,Darts darts);

    /**
     *
     * @param num az dobot pontszám
     * @param darts
     */
    public void calc(int num,Darts darts);
 
    /**
     * beállítja a végeredményt.
     * @param darts
     */
    public void setResults(Darts darts); 
}
