package Statika;

public class Uzivatel {

    private String jmeno;
    private String heslo;
    private boolean prihlaseny;
    private int id;
    public static int minimalniDelkaHesla = 6;
    private static int dalsiId = 1;

    public Uzivatel(String jmeno, String heslo) {
        this.jmeno = jmeno;
        this.heslo = heslo;
        prihlaseny = false;
        id = dalsiId;
        dalsiId++;
    }

    public boolean prihlasSe(String zadaneHeslo) {
        if (zadaneHeslo.equals(heslo)) { // kontrola hesla
            prihlaseny = true;
            return true;
        }
        return false;   // hesla nesuhlasia
    }

    public static boolean zvalidujHeslo(String heslo) {
        return heslo.length() >= minimalniDelkaHesla;
    }

    public static int vratMinimalniDelkuHesla() {
        return minimalniDelkaHesla;
    }

    public int vratID() {
        return id;
    }


}
