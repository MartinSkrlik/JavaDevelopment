package DiarArrayObjekty;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Databaza {

    private ArrayList<Zaznam> zaznamy;

    public Databaza() {
        zaznamy = new ArrayList<>();
    }

    public void pridani(LocalDateTime datumCas, String text) {
        zaznamy.add(new Zaznam(datumCas, text));
    }

    public ArrayList<Zaznam> najdiZaznam(LocalDateTime datumCas, boolean dleCasu) {
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for (Zaznam zaznam : zaznamy) {
            if ((dleCasu && zaznam.getDatumCas().equals(datumCas)) || (!dleCasu && zaznam.getDatumCas().toLocalDate().equals(datumCas.toLocalDate()))) {
                nalezene.add(zaznam);
            }
        }
        return nalezene;
    }

    public void vymazZaznamy(LocalDateTime datum) {
        ArrayList<Zaznam> nalezeno = najdiZaznam(datum, true);
        for (Zaznam zaznam : nalezeno) {
            zaznamy.remove(zaznam);
        }
    }





}
