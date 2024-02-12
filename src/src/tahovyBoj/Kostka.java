package tahovyBoj;
import java.util.Random;

/**
 * Třída reprezentuje hrací kostku
 */
public class Kostka {
    /**
     * Generátor náhodných čísel
     */
    private Random random;
    /**
     * Počet stěn kostky
     */
    private int pocetSten;

    public Kostka(int aPocetSten)
    {
        pocetSten = aPocetSten;
        random = new Random();
    }

    public Kostka() {
        pocetSten = 6;
        random = new Random();
    }

    public int vratPocetSten()
    {
        return pocetSten;
    }

}