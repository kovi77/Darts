/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.darts;

import java.util.ArrayList;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Ak
 */
public class Login {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Login.class);
    private Reader r = new Reader();
    private ManagerImpl m = new ManagerImpl();
    private static Users users = new Users();
    private String invalidName = "";
    private boolean ch1 = false;
    private boolean ch2 = false;
    private boolean check1 = false;
    User player1 = m.getPlayer1();
    User player2 = m.getPlayer2();

    /**
     *
     * @param name1 Egy felhasználó név
     * @param name2 Egy másik felhasználó név
     */
    public void login(String name1, String name2) {
        ch1 = false;
        ch2 = false;
        users.setUsers(new ArrayList<>());
        users.setUsers(r.users.getUsers());
        if (!name1.equals(name2) && (!name1.isEmpty() && !name2.isEmpty())) {
            for (User user : users.getUsers()) {
                if (user.getName().equals(name1)) {
                    player1.setName(user.getName());
                    player1.setAvg(user.getAvg());
                    player1.setHighScore(user.getHighScore());
                    player1.setMatches(user.getMatches());
                    player1.setCounter1(user.getCounter1());
                    player1.setCounter2(user.getCounter2());
                    player1.setCounter3(user.getCounter3());
                    player1.setWonMatches(user.getWonMatches());
                    ch1 = true;
                    logger.info("Regisztált játékos");
                }
            }
            for (User user : users.getUsers()) {
                if (user.getName().equals(name2)) {
                    player2.setName(user.getName());
                    player2.setAvg(user.getAvg());
                    player2.setHighScore(user.getHighScore());
                    player2.setMatches(user.getMatches());
                    player2.setCounter1(user.getCounter1());
                    player2.setCounter2(user.getCounter2());
                    player2.setCounter3(user.getCounter3());
                    player2.setWonMatches(user.getWonMatches());
                    ch2 = true;
                    logger.info("Regisztált játékos");
                }
            }
            invalidName = "";
            check1 = ch2 && ch1;
            if (!ch1) {
                invalidName = "Player 1 not registered";
                logger.warn("Első játékos nem regisztált");
            }
            if (!ch2) {
                invalidName = "Player 2 not registered";
                logger.warn("Második játékos nem regisztált");
            }
            if (!ch1 && !ch2) {
                invalidName = "Non-registered players";
                logger.warn("Nem regisztált játékosok");
            }
        } else {
            invalidName = "Invalid Name";
            logger.warn("Hibás bejelentkezési próba");
        }

    }

    /**
     *
     * @return nem érvényes név esetén ezzel tér vissza
     */
    public String getInvalidName() {
        return invalidName;
    }

    /**
     *
     * @return check1
     */
    public boolean isCheck1() {
        return check1;
    }
}
