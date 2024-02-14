package tahovyBoj;

public class TahovyBoj {

    public static void main(String[] args) {
        // vytvoření kostek
        Kostka sestistenna = new Kostka();
        Kostka desetistenna = new Kostka(10);

//        // hod šestistěnnou kostkou
//        System.out.println(sestistenna);
//        for (int i = 0; i < 10; i++)
//            System.out.print(sestistenna.hod() + " ");
//
//        // hod desetistěnnou kostkou
//        System.out.println("\n\n" + desetistenna);
//        for (int i = 0; i < 10; i++)
//            System.out.print(desetistenna.hod() + " ");
//
        Kostka kostka = new Kostka(10);
//        Bojovnik bojovnik = new Bojovnik("Zalgoren", 100, 20, 10, kostka);
//        System.out.printf(" %n%nBojovnik: %s%n", bojovnik);
//        System.out.printf("Nazive: %s%n", bojovnik.jeZivy());
//        System.out.printf(" %n%nGrafickyZivot: %s%n", bojovnik.grafickyZivot());
//
//        bojovnik.utoc(bojovnik);
//        System.out.printf("Zivot po utoku: %s%n", bojovnik.grafickyZivot());
//
//        Bojovnik souper = new Bojovnik("IvanGadzo",60, 18,15, kostka);
//        souper.utoc(bojovnik);
//        System.out.println(souper.vratPoslednyZpravu());
//        System.out.println(bojovnik.vratPoslednyZpravu());
//
//        System.out.printf("Život: %s%n", bojovnik.grafickyZivot());
//        System.out.println();

        // Nastavit instancie objektu
        Bojovnik ivanKandrac = new Bojovnik("IvanKandrac", 100, 20, 10, kostka);
        Bojovnik gandalf = new Mag("KennyNight", 60, 18, 15, kostka, 30, 45);
        Arena arena = new Arena(ivanKandrac, gandalf, kostka);
        // Samotny zapas
        arena.zapas();

    }





}
