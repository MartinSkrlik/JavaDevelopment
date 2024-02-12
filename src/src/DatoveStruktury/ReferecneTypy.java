package DatoveStruktury;

public class ReferecneTypy {

    public static void main (String[] args) {

        int b = 56;
        int a = 28;

        Uzivatel jan = new Uzivatel("Jan Novak",28);
        Uzivatel josef = new Uzivatel("Jozef Novy",32);

        System.out.printf("a: %s%nb: %s%njan: %s%njozef: %s%n", a, b, jan, josef);
        a = b;
        jan = josef;
        System.out.printf("a: %s%nb: %s%njan: %s%njosef: %s%n%n", a, b, jan, josef);

        josef.jmeno = "John Doe";
        josef = null;
        System.out.printf("jan: %s%njosef: %s%n", jan, josef);
    }
}
