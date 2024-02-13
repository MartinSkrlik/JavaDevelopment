package tahovyBoj;

public class Bojovnik {

    private String jmeno;
    private int zivot;
    private int maximalniZivot;
    private int utok;
    private int obrana;
    private String zprava;
    private Kostka kostka;

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

    public String grafickyZivot () {
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

    public void branSe (int uder) {
        int zraneni = uder - (obrana + kostka.hod());
        if (zraneni > 0) {
            zivot -= zraneni;
            if (zivot <= 0) {
                zivot = 0;
            }
        }
    }

    public void utoc (Bojovnik souper) {
        int uder = utok + kostka.hod();
        souper.branSe(uder);
    }

}
