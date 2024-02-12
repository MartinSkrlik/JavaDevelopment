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
    }
}
