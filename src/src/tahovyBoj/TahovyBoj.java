package tahovyBoj;

public class TahovyBoj {
    public static void main(String[] args) {

        Kostka sestistrana = new Kostka(10); // v tuto chvíli se zavolá konstruktor
        Kostka desetistrana = new Kostka();
        System.out.println(sestistrana.vratPocetSten());
        System.out.println(desetistrana.vratPocetSten());
    }
}
