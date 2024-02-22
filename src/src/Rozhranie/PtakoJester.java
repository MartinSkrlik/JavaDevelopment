package Rozhranie;

public class PtakoJester implements PtakInterface, JesterInterface {


    @Override
    public void plazSe() {
        System.out.println("Plazím se...");
    }

    @Override
    public void pipni() {
        System.out.println("♫ ♫♫ ♫ ♫ ♫♫");
    }

    @Override
    public void dychej() {
        System.out.println("Dycham....");
    }
}
