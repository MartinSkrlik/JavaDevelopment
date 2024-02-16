package StatickeNastaveni;

/**
 * Reprezentuje kalendář se záznamy
 */
class Kalendar {
    /**
     * Slouží pro test viditelnosti, metoda vrátí všechna nastavení celého programu
     *
     * @return Textový řetězec s nastavením celého programu
     */
    public String vratNastaveni() {
        String nastaveni = "";
        nastaveni += String.format("Jazyk: %s%n", Nastaveni.vratJazyk());
        nastaveni += String.format("Barevné schéma: %s%n", Nastaveni.vratBarevneSchema());
        nastaveni += String.format("Spustit po startu: %s%n", Nastaveni.vratSpustitPoStartu());
        return nastaveni;
    }
}
