package Statika;

public class Statika {

    public static void main(String[] args) {

        Uzivatel uzivatel = new Uzivatel("Martin","Heslo");
        if (uzivatel.prihlasSe("Heslo")) {
            System.out.println("spravne heslo");
        } else System.out.println("nespravne heslo");

        System.out.println(Uzivatel.minimalniDelkaHesla);
        System.out.println(Uzivatel.zvalidujHeslo("hesloViacAko6Znakov"));

        // Riesenie ulohy
        Uzivatel tomas = new Uzivatel("Tomas Marny","hesloveselo");
        System.out.printf("ID prveho uzivatela: %s%n", tomas.vratID());
        Uzivatel oli = new Uzivatel("Olí Znusinudle", "csfd1fg");
        System.out.printf("ID druheho uzivatela: %s%n", oli.vratID());
        System.out.printf("Minimální délka hesla uživatele je: %s%n", Uzivatel.vratMinimalniDelkuHesla());
        System.out.printf("Validnost hesla \"heslo\" je: %s", Uzivatel.zvalidujHeslo("heslo"));



    }


}
