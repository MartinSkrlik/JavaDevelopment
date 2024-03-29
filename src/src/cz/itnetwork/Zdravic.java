package cz.itnetwork;

/** Třída reprezentuje zdravič, který slouží ke zdravení uživatelů */
class Zdravic
{
    /** Text pozdravu */
    String text;

    /**
     * Pozdraví uživatele textem pozdravu a jeho jménem
     * @param  jmeno  Jméno uživatele
     * @return      Text s pozdravem
     */
    public String pozdrav(String jmeno)
    {
        return String.format("%s %s", text, jmeno);
    }
}
