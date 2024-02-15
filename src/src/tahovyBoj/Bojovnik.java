package tahovyBoj;

public class Bojovnik {

    protected String jmeno;
    protected int zivot;
    protected int maximalniZivot;
    protected int utok;
    protected int obrana;
    private String zprava;
    protected Kostka kostka;

    public Bojovnik (String jmeno, int zivot, int utok, int obrana, Kostka kostka) {
        this.jmeno = jmeno;
        this.zivot = zivot;
        this.maximalniZivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.zprava = zprava;
        this.kostka = kostka;
    }

    @Override
    public String toString() {
        return jmeno;
    }

//    public boolean jeZivy() {
//        if (zivot > 1) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public boolean jeZivy() {
        return (zivot > 1);
    }

    protected String grafickyUkazatel (int aktualni, int maximalni) {
        String grafickyZivot = "[";
        int celkom = 20;
        double pocetDilku = Math.round(((double) zivot / maximalniZivot) * celkom);
        if ((pocetDilku == 0) & (jeZivy())) {
            pocetDilku = 1;
        }
        for (int i = 0; i < pocetDilku; i++) {
            grafickyZivot += "#";
        }
        for (int i = 0; i < celkom - pocetDilku; i++) {
            grafickyZivot += " ";
        }
        grafickyZivot += "]";
        return grafickyZivot;
    }

    protected String grafickyZivot () {
        return grafickyUkazatel(zivot, maximalniZivot);
    }

    public void branSe (int uder) {
        int zraneni = uder - (obrana + kostka.hod());
        if (zraneni > 0) {
            zivot -= zraneni;
            zprava = String.format("%s utrpěl poškození %s hp", jmeno, zraneni);
            if (zivot <= 0) {
                zivot = 0;
                zprava += " a zemřel";
            } else {
                zprava = String.format("%s odrazil útok", jmeno);
            }
            nastavZpravu(zprava);
        }
    }

    public void utoc (Bojovnik souper) {
        int uder = utok + kostka.hod();
        nastavZpravu(String.format("%s útočí s úderem za %s hp", jmeno, uder));
        souper.branSe(uder);
    }

    protected void nastavZpravu (String zprava) {
        this.zprava = zprava;
    }

    public String vratPoslednyZpravu () {
        return zprava;
    }

}
