package StatickeNastaveni;



/**
 * Třída reprezentuje statický registr s nastavneím programu
 */
class Nastaveni {
    /**
     * Jazyk programu, hodnoty: CZ, SK, EN
     */
    private static String jazyk = "CZ";
    /**
     * Barevné schéma, hodnoty: celene, cervene, modre
     */
    private static String barevneSchema = "cervene";
    /**
     * Spuštění aplikace po startu operačního systému
     */
    private static boolean spustitPoStartu = true;

    /**
     * Vrátí jazyk programu
     *
     * @return Jazyk programu
     */
    public static String vratJazyk() {
        return jazyk;
    }

    /**
     * Vrátí barevné schéma
     *
     * @return Barevné schéma
     */
    public static String vratBarevneSchema() {
        return barevneSchema;
    }

    /**
     * Vrátí, zda se má program spustit při startu operačního systému
     *
     * @return True pokud ano, jinak False
     */
    public static boolean vratSpustitPoStartu() {
        return spustitPoStartu;
    }
}
