package tahovyBoj;

public class Arena {

    private Bojovnik bojovnikA;
    private Bojovnik bojovnikB;
    private Kostka kostka;

    public Arena(Bojovnik bojovnikA, Bojovnik bojovnikB, Kostka kostka) {
        this.bojovnikA = bojovnikA;
        this.bojovnikB = bojovnikB;
        this.kostka = kostka;
    }

    private void vykresli() {
        System.out.println("-------------- Aréna -------------- \n");
        System.out.println("Zdraví bojovníků: \n");
        System.out.printf("%s %s%n", bojovnikA, bojovnikA.grafickyZivot());
        System.out.printf("%s %s%n", bojovnikB, bojovnikB.grafickyZivot());
    }

    private void vypisZpravu (String zprava) {
        System.out.println(zprava);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.err.println("Chyba, nepodařilo se uspat vlákno!");
        }
    }

    public void zapas () {
        Bojovnik bojovnikA = this.bojovnikA;
        Bojovnik bojovnikB = this.bojovnikB;
        System.out.println("Vytajte v arene sedlaci: ");
        System.out.printf("%nDnes sa stretnu tito dvaja gadzovka s vidlami, v rohu a %s a v rohu b %s%n", bojovnikA, bojovnikB);
        System.out.println("Mozme ist nato: ");
        boolean zacinaBojovnikB = (kostka.hod() <= kostka.vratPocetSten() / 2);
        if (zacinaBojovnikB) {
            bojovnikA = this.bojovnikB;
            bojovnikB = this.bojovnikA;
        }
        System.out.printf("Začínat bude bojovník %s! %nZápas může začít...%n", bojovnikA);
        while (bojovnikA.jeZivy() && bojovnikB.jeZivy()) {
            bojovnikA.utoc(bojovnikB);
            vykresli();
            vypisZpravu(bojovnikA.vratPoslednyZpravu());
            vypisZpravu(bojovnikB.vratPoslednyZpravu());
            if (bojovnikB.jeZivy()) {
                bojovnikB.utoc(bojovnikA);
                vykresli();
                vypisZpravu(bojovnikB.vratPoslednyZpravu()); // zpráva o útoku
                vypisZpravu(bojovnikA.vratPoslednyZpravu()); // zpráva o obraně
            }
            System.out.println();
        }
    }

}
