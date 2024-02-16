package GetSet;

public class Student {

    private String jmeno;
    private int vek;
    private boolean muz;
    private boolean plnolety;

    public Student(String jmeno, boolean muz, int vek) {
        this.setJmeno(jmeno);
        this.setMuz(muz);
        this.setVek(vek);
        setPlnolety(true);
        if (vek < 18) {
            setPlnolety(false);
        }
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public boolean isMuz() {
        return muz;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
        setPlnolety(vek >= 18);
    }

    public boolean isPlnolety() {
        return plnolety;
    }

    @Override
    public String toString() {
        String jsemPlnolety = "jsem";
        if (!isPlnolety()) {
            jsemPlnolety = "nejsem";
        }
        String pohlavi = "muz";
        if (!isMuz()) {
            pohlavi = "zena";
        }
        return String.format("Jsem %s, %s. Je mi %d let a %s plnoletý.", getJmeno(), pohlavi, getVek(), jsemPlnolety);

    }

    public void setMuz(boolean muz) {
        this.muz = muz;
    }

    public void setPlnolety(boolean plnolety) {
        this.plnolety = plnolety;
    }
}
