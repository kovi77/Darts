
package hu.unideb.inf.darts.model;
/**
 * Egy {@code Darts} jatákot reprezentáló osztály.
 * @author Ak
 */
public class Darts {

    private String gameMode;
    private User p1;
    private User p2;
    private int legs;

    /**
     * Paraméter nélküli kontstruktor {@code Darts} objektumhoz.
     */
    public Darts() {
        this.p1 = null;
        this.p2 = null;
        this.gameMode = null;
        this.legs = 0;
    }

    /**
     * Konstruktor {@code Darts} objektumhoz.
     * @param p1 az első felhasználó ami egy {@code User} objektum
     * @param p2 a második felhasználó ami egy {@code User} objektum
     * @param gameMode egy játák mód
     * @param legs legek darabszáma
     */
    public Darts( User p1, User p2, String gameMode, int legs) {
        this.p1 = p1;
        this.p2 = p2;
        this.gameMode = gameMode;
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Darts{" + " gameMode=" + gameMode + ", player1=" + p1.getName() + ", player2=" + p2.getName() + ", legs=" + legs + '}';
    }

    /**
     * Visszaadja a legek darabszámát.
     * @return legek darabszáma
     */
    public int getLegs() {
        return legs;
    }

    /**
     * Beállítja a {@code Darts}-hoz a legek darabszámát.
     * @param legs legek darabszáma
     */
    public void setLegs(int legs) {
        this.legs = legs;
    }

    /**
     * Visszaadja az első {@code User}-t.
     * @return az első felhasználó
     */
    public User getPlayer1() {
        return p1;
    }

    /**
     * Beállítja az első {@code Darts} {@code User}-ét.
     * @param p1 egy felhasználó
     */
    public void setPlayer1(User p1) {
        this.p1 = p1;
    }

    /**
     * Visszaadja a második {@code User}-t.
     * @return a második felhasználó
     */
    public User getPlayer2() {
        return p2;
    }

    /**
     * Beállítja a második {@code Darts} {@code User}-ét.
     * @param p2 egy felhasználó
     */
    public void setPlayer2(User p2) {
        this.p2 = p2;
    }

    /**
     * Visszaadja a {@code Darts} játék típusát.
     * @return a jázék típusa
     */
    public String getGameMode() {
        return gameMode;
    }

    /**
     * Beállítja a {@code Darts} játék típusát.
     * @param gameMode egy játék típus
     */
    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }
}
