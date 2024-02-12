package DatoveStruktury;

public class Uzivatel {

    public int vek;
    public String jmeno;

    public Uzivatel (String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }

    @Override
    public String toString () {
        return jmeno;
    }
}
