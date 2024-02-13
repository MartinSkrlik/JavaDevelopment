package tahovyBoj;

public class TahovyBoj {

    public static void main(String[] args) {
        // vytvoření kostek
        Kostka sestistenna = new Kostka();
        Kostka desetistenna = new Kostka(10);

        // hod šestistěnnou kostkou
        System.out.println(sestistenna);
        for (int i = 0; i < 10; i++)
            System.out.print(sestistenna.hod() + " ");

        // hod desetistěnnou kostkou
        System.out.println("\n\n" + desetistenna);
        for (int i = 0; i < 10; i++)
            System.out.print(desetistenna.hod() + " ");

        Kostka kostka = new Kostka(10);
        Bojovnik bojovnik = new Bojovnik("Zalgoren", 100, 20, 10, kostka);
        System.out.printf(" %n%nBojovnik: %s%n", bojovnik);
        System.out.printf("Nazive: %s%n", bojovnik.jeZivy());
        System.out.printf("GrafickyZivot: %s%n", bojovnik.grafickyZivot());

        bojovnik.utoc(bojovnik);
        System.out.printf("Zivot po utoku: %s%n ", bojovnik.grafickyZivot());

    }
}
