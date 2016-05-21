
/**
 * hu.unideb.inf.darts csomag magában tartalmazza a működéshez szükséges fájlokat.
 */
package hu.unideb.inf.darts.manager;

import hu.unideb.inf.darts.model.Darts;
import hu.unideb.inf.darts.model.User;
import org.slf4j.LoggerFactory;

/**
 * A játékot levezető osztály.
 * @author Ak
 */
public class ManagerImpl implements Manager {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ManagerImpl.class);
    static Darts darts = new Darts();
    public static User player1 = new User("A");
    public static User player2 = new User("B");

    private int p1Counter = 1;
    private int p2Counter = 5;
    private double op1 = 0.3;
    private double op2 = 0.2;
    private int num1 = 0, num2 = 0, num3 = 0;
    private int num4 = 0, num5 = 0, num6 = 0;
    private boolean win = false;

    private static int winner1 = 0;
    private static int winner2 = 0;
    private static int div1 = 0;
    private static int div2 = 0;
    private static int sum1 = 0;
    private static int sum2 = 0;
    private static int highScore1 = 0;
    private static int highScore2 = 0;

    @Override
    public void setPlayer(String playerOptions,User player1, User player2,Darts darts) {
        logger.info("Kezdő játékos beállítva");
        if (playerOptions.equals("Player1")) {
            darts.setPlayer1(player1);
            darts.setPlayer2(player2);
        } else {
            darts.setPlayer1(player2);
            darts.setPlayer2(player1);
        }
    }

    @Override
    public void options(String scoreOptions,Darts darts) {
        logger.info("Kezdő pontszám: "+ scoreOptions);
        darts.setGameMode(scoreOptions);
        darts.getPlayer1().setScore(Integer.parseInt(scoreOptions));
        darts.getPlayer2().setScore(Integer.parseInt(scoreOptions));
    }

    @Override
    public void setLeg(String legs,Darts darts) {
        logger.info("Legek száma: "+legs);
        darts.setLegs(Integer.parseInt(legs));
    }

    @Override
    public void calc(int num,Darts darts) {

        if (!win) {
            if (p1Counter < 4) {

                if (p1Counter == 1) {
                    num1 = num;
                }
                if (p1Counter == 2) {
                    num2 = num;
                }
                if (p1Counter == 3) {
                    num3 = num;
                }
                if (num == 0) {
                    logger.info("1.Játékos 0-t dobott");
                    /*darts.getPlayer1().setScore((darts.getPlayer1().getScore()) + num1 + num2 + num3);
                    zero();
                    p1Counter = 4;*/
                    p1Counter++;
                } else if (darts.getPlayer1().getScore() >= num) {
                    darts.getPlayer1().setScore((darts.getPlayer1().getScore()) - num);
                    sum1 = sum1 + num;
                    highScore1 = highScore1 + num;
                    p1Counter++;
                } else {
                    if (darts.getPlayer1().getScore() < num1) {
                        darts.getPlayer1().setScore((darts.getPlayer1().getScore()));
                        logger.info("1.Játékos túl dobott");
                    }
                    if (darts.getPlayer1().getScore() < num2) {
                        darts.getPlayer1().setScore((darts.getPlayer1().getScore()) + num1);
                        logger.info("1.Játékos túl dobott");
                    }
                    if (darts.getPlayer1().getScore() < num3) {
                        darts.getPlayer1().setScore((darts.getPlayer1().getScore()) + num1 + num2);
                        logger.info("1.Játékos túl dobott");
                    }
                    zero();
                    p1Counter = 4;
                }
                win = win(darts);
                div1++;
            }
            if (p2Counter < 4) {

                if (p2Counter == 1) {
                    num4 = num;
                }
                if (p2Counter == 2) {
                    num5 = num;
                }
                if (p2Counter == 3) {
                    num6 = num;
                }
                if (num == 0) {
                    logger.info("2.Játékos 0-t dobott");
                    /*darts.getPlayer2().setScore((darts.getPlayer2().getScore()) + num4 + num5 + num6);
                    zero();
                    p2Counter = 4;*/
                    p2Counter++;
                } else if (darts.getPlayer2().getScore() >= num) {
                    darts.getPlayer2().setScore((darts.getPlayer2().getScore()) - num);
                    sum2 = sum2 + num;
                    highScore2 = highScore2 + num;
                    p2Counter++;
                } else {
                    if (darts.getPlayer2().getScore() < num4) {
                        darts.getPlayer2().setScore((darts.getPlayer2().getScore()));
                        logger.info("2.Játékos túl dobott");
                    }
                    if (darts.getPlayer2().getScore() < num5) {
                        darts.getPlayer2().setScore((darts.getPlayer2().getScore()) + num4);
                        logger.info("2.Játékos túl dobott");
                    }
                    if (darts.getPlayer2().getScore() < num6) {
                        darts.getPlayer2().setScore((darts.getPlayer2().getScore()) + num4 + num5);
                        logger.info("2.Játékos túl dobott");
                    }

                    zero();
                    p2Counter = 4;
                }
                win = win(darts);
                div2++;
            }
            if (p1Counter == 4) {
                op2 = 0.3;
                op1 = 0.2;
                p2Counter = 1;
                p1Counter = 5;
                if (darts.getPlayer1().getHighScore() < highScore1) {
                    darts.getPlayer1().setHighScore(highScore1);
                }
                if (highScore1 >= 100 && highScore1 < 140) {
                    darts.getPlayer1().setCounter3(darts.getPlayer1().getCounter3() + 1);
                    logger.info("1.Játékos 100 felett dobott");
                }
                if (highScore1 >= 140 && highScore1 < 180) {
                    darts.getPlayer1().setCounter2(darts.getPlayer1().getCounter2() + 1);
                    logger.info("1.Játékos 140 felett dobott");
                }
                if (highScore1 == 180) {
                    darts.getPlayer1().setCounter1(darts.getPlayer1().getCounter1() + 1);
                    logger.info("1.Játékos 180-at dobott");
                }
                highScore1 = 0;
                highScore2 = 0;
                zero();
            }
            if (p2Counter == 4) {
                op1 = 0.3;
                op2 = 0.2;
                p1Counter = 1;
                p2Counter = 5;
                if (darts.getPlayer2().getHighScore() < highScore2) {
                    darts.getPlayer2().setHighScore(highScore2);
                }
                if (highScore2 >= 100 && highScore2 < 140) {
                    darts.getPlayer2().setCounter3(darts.getPlayer2().getCounter3() + 1);
                    logger.info("2.Játékos 100 felett dobott");
                }
                if (highScore2 >= 140 && highScore2 < 180) {
                    darts.getPlayer2().setCounter2(darts.getPlayer2().getCounter2() + 1);
                    logger.info("2.Játékos 140 felett dobott");
                }
                if (highScore2 == 180) {
                    darts.getPlayer2().setCounter1(darts.getPlayer2().getCounter1() + 1);
                    logger.info("2.Játékos 180-at dobott");
                }
                highScore1 = 0;
                highScore2 = 0;
                zero();
            }

            //win = win(darts.getPlayer1(), darts.getPlayer2());
        }
    }

    @Override
    public void setResults(Darts darts) {
        logger.info("Végeredmények beállításra kerültek");
        darts.getPlayer1().setMatches(darts.getPlayer1().getMatches() + 1);
        darts.getPlayer2().setMatches(darts.getPlayer2().getMatches() + 1);

        if (darts.getPlayer1().getAvg() > 0) {
            darts.getPlayer1().setAvg(((darts.getPlayer1().getAvg() + ((sum1 / div1) * 3)) / 2));
        } else {
            darts.getPlayer1().setAvg(((sum1 / div1)) * 3);
        }
        if (darts.getPlayer2().getAvg() > 0) {
            darts.getPlayer2().setAvg(((darts.getPlayer2().getAvg() + ((sum2 / div2) * 3)) / 2));
        } else {
            darts.getPlayer2().setAvg(((sum2 / div2)) * 3);
        }
        newGame();
    }

    private void zero() {
        num1 = 0;num2 = 0;num3 = 0;num4 = 0;num5 = 0;num6 = 0;
    }

    private void reSet() {
        logger.info("Új leg kezdődött");
        darts.setLegs(darts.getLegs() - 1);
        darts.getPlayer1().setScore(Integer.parseInt(darts.getGameMode()));
        darts.getPlayer2().setScore(Integer.parseInt(darts.getGameMode()));
    }

    private void newGame() {
        zero();
        p1Counter = 1;
        p2Counter = 5;
        div1 = 0;
        div2 = 0;
        sum1 = 0;
        sum2 = 0;
        highScore1 = 0;
        highScore2 = 0;
        win = false;
        winner1 = 0;
        winner2 = 0;
        op1 = 0.3;
        op2 = 0.2;
    }

    /**
     * Beállítja ki nyerte a leget, majd hogy ki nyerte a meccset.
     * @param darts egy darts
     * @return a meccs végét jelző értékkel.
     */
    public boolean win(Darts darts) {
        if (darts.getLegs() != 1) {
            if (darts.getPlayer1().getScore() == 0) {
                darts.getPlayer1().setWonMatches(darts.getPlayer1().getWonMatches() + 1);
                op2 = 0.3;
                op1 = 0.2;
                p1Counter = 4;
                zero();
                reSet();
                winner1++;
                logger.info("1.Játékos nyerte a leget");
            }
            if (darts.getPlayer2().getScore() == 0) {
                darts.getPlayer2().setWonMatches(darts.getPlayer2().getWonMatches() + 1);
                op1 = 0.3;
                op2 = 0.2;
                p2Counter = 4;
                zero();
                reSet();
                winner2++;
                logger.info("2.Játékos nyerte a leget");
            }
        } else {
            if (darts.getPlayer1().getScore() == 0) {
                darts.getPlayer1().setWonMatches(darts.getPlayer1().getWonMatches() + 1);
                op2 = 0.3;
                op1 = 0.2;
                p1Counter = 4;
                winner1++;
                logger.info("1.Játékos nyert");
                return true;
            }
            if (darts.getPlayer2().getScore() == 0) {
                darts.getPlayer2().setWonMatches(darts.getPlayer2().getWonMatches() + 1);
                op1 = 0.3;
                op2 = 0.2;
                p2Counter = 4;
                winner2++;
                logger.info("2.Játékos nyert");
                return true;
            }
        }
        return false;
    }

    /**
     * Meccs végét jelző értékkel tér vissza.
     * @return {@code true} vagy {@code false}
     */
    public boolean getWin() {
        return win;
    }

    /**
     * Visszaadja hogy az aktuális leget az első játékos nyerte.
     * @return {@code true} vagy {@code false}
     */
    public static int getWinner1() {
        return winner1;
    }

    /**
     * Visszaadja hogy az aktuális leget a második játékos nyerte.
     * @return {@code true} vagy {@code false}
     */
    public static int getWinner2() {
        return winner2;
    }

    /**
     * Visszaadja az adott {@code Darts}-ot.
     * @return a darts
     */
    public Darts getDarts() {
        return darts;
    }

    /**
     * Visszaadja az első négyzet átlátszóságának értékével.
     * @return egy {@code double} érték
     */
    public double getOp1() {
        return op1;
    }

    /**
     * Visszaadja a második négyzet átlátszóságának értékével.
     * @return egy {@code double} érték
     */
    public double getOp2() {
        return op2;
    }

    /**
     * Visszaad egy {@code User}-t.
     * @return a játékos
     */
    public static User getPlayer1() {
        return player1;
    }

    /**
     * Visszaad egy {@code User}-t.
     * @return a játékos
     */
    public static User getPlayer2() {
        return player2;
    }

    /**
     * Beállítja a játék végét jelző értéket.
     * @param win {@code true} vagy {@code false}
     */
    public void setWin(boolean win) {
        this.win = win;
    }
    
}
