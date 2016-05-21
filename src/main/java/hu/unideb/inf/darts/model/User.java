
package hu.unideb.inf.darts.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Egy felhasználót reprezentáló osztály.
 * @author Ak
 */
@XmlRootElement(name = "user")
@XmlAccessorType (XmlAccessType.FIELD)
public class User {

    private String name;
    private int matches;
    private int score;
    private double avg;
    private double highScore;
    private int counter1; //180
    private int counter2; //140+
    private int counter3; //100+
    private int wonMatches = 0;

    /**
     * Paraméter nélküli kontstruktor {@code User} objektumhoz.
     */
    public User() {
    }

    /**
     * Konstruktor a {@code User} objektumhoz.
     * @param name egy játékos neve
     */
    public User(String name) {
        this.name = name;
        this.matches = 0;
        this.score = 0;
        this.avg = 0;
        this.highScore = 0;
        this.counter1 = 0;
        this.counter2 = 0;
        this.counter3 = 0;
        this.wonMatches = 0;
    }

    /**
     * Konstruktor a {@code User} objektumhoz.
     * @param name egy játékos neve
     * @param matches egy játszott meccsek száma
     * @param score egy aktuális pontszáma
     * @param avg egy játékos átlaga
     * @param highScore egy játékos legmagasabb pontszáma
     * @param counter1 egy játékos által dobott 180-ak darabszáma
     * @param counter2 egy játékos által dobott 140 feletti pontok darabszáma
     * @param counter3 egy játékos által dobott 100 feletti pontok darabszáma
     * @param wonMatches egy játékos által nyert legek száma
     */
    public User(String name, int matches, int score, double avg, double highScore, int counter1, int counter2, int counter3,int wonMatches) {
        this.name = name;
        this.matches = matches;
        this.score = score;
        this.avg = avg;
        this.highScore = highScore;
        this.counter1 = counter1;
        this.counter2 = counter2;
        this.counter3 = counter3;
        this.wonMatches = wonMatches;
    }

    /**
     * Visszaadja a nyert legek számát.
     * @return darabszáma
     */
    public int getWonMatches() {
        return wonMatches;
    }

    /**
     * Beállítja a nyert legek számát.
     * @param wonMatches darabszáma
     */
    public void setWonMatches(int wonMatches) {
        this.wonMatches = wonMatches;
    }

    /**
     * Visszaadja a játékos nevét.
     * @return név
     */
    public String getName() {
        return name;
    }

    /**
     * Beállítja a játékos nevét.
     * @param name  név
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Visszaadja a {@code User} által játszott meccsek darabszámát.
     * @return darabszáma
     */
    public int getMatches() {
        return matches;
    }

    /**
     * Beállítja a {@code User} által játszott meccsek darabszámát.
     * @param matches darabszáma
     */
    public void setMatches(int matches) {
        this.matches = matches;
    }

    /**
     * Visszaadja a játékos aktuális pontszámát.
     * @return pontszám
     */
    public int getScore() {
        return score;
    }

    /**
     * Beállítja a játékos aktuális pontszámát.
     * @param score pontszám
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Visszaadja a {@code User} átlagát.
     * @return átlag {@code double}
     */
    public double getAvg() {
        return avg;
    }

    /**
     * Beállítja a {@code User} átlagát.
     * @param avg átlag {@code double}
     */
    public void setAvg(double avg) {
        this.avg = avg;
    }

    /**
     * Visszaadja a {@code User} legmagasabb dobását.
     * @return érték
     */
    public double getHighScore() {
        return highScore;
    }

    /**
     * Beállítja a {@code User} legmagasabb dobását.
     * @param highScore érték
     */
    public void setHighScore(double highScore) {
        this.highScore = highScore;
    }

    /**
     * Visszaadja a {@code User} által dobott 180-ak számát.
     * @return darabszáma
     */
    public int getCounter1() {
        return counter1;
    }

     /**
     * Beállítja a {@code User} által dobott 180-ak számát.
     * @param counter1 darabszám
     */
    public void setCounter1(int counter1) {
        this.counter1 = counter1;
    }

     /**
     * Visszaadja a {@code User} által 140 felett dobot értékek darabszámát.
     * @return darabszáma
     */
    public int getCounter2() {
        return counter2;
    }

    /**
     * Beállítja a játékos {@code User} dobot 140 feletti értékek darabszámát.
     * @param counter2 140 feletti dobás érték darabszáma
     */
    public void setCounter2(int counter2) {
        this.counter2 = counter2;
    }

    /**
     * Visszaadja a {@code User} által 100 felett dobot értékek darabszámát.
     * @return darabszáma
     */
    public int getCounter3() {
        return counter3;
    }

    /**
     * Beállítja a {@code User} álatal dobot 100 feletti értékek darabszámát.
     * @param counter3 darabsám
     */
    public void setCounter3(int counter3) {
        this.counter3 = counter3;
    }

}
