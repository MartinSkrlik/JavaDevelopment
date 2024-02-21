package DiarArrayObjekty;

import com.sun.source.tree.WhileLoopTree;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Diar {

    private Databaza databaza;
    private Scanner scanner = new Scanner(System.in, "Windows-1250");

    public Diar() {
        databaza = new Databaza();
    }

    public static final DateTimeFormatter FORMAT_DATA = DateTimeFormatter.ofPattern("d.M.y. H:mm");
    public static final DateTimeFormatter FORMAT_DATA_BEZ_CASU = DateTimeFormatter.ofPattern("d.M.y");

    private LocalDateTime naparsujDatumCas() {
        System.out.println("Zadejte datum a cas ve tvaru [ " + LocalDateTime.now().format(FORMAT_DATA) + " ]: "  );
        while(true) {
            try {
                return LocalDateTime.parse(scanner.nextLine(), FORMAT_DATA);
            } catch (Exception ex) {
                System.out.println("Nesprávně zadáno, zadejte prosím znovu.");
            }
        }
    }

    private LocalDateTime naparsujDatum() {
        System.out.println("Zadejte datum ve tvaru [" + LocalDate.now().format(FORMAT_DATA_BEZ_CASU) + "]:");
        while (true) {
            try {
                return LocalDate.parse(scanner.nextLine(), FORMAT_DATA_BEZ_CASU).atStartOfDay();
            } catch (Exception ex) {
                System.out.println("Nesprávně zadáno, zadejte prosím znovu.");
            }
        }
    }

    public void vypisZaznamy(LocalDateTime den) {
        ArrayList<Zaznam> zaznamy = databaza.najdiZaznam(den, false);
        for (Zaznam zaznam : zaznamy) {
            System.out.println(zaznam);
        }

    }

    public void pridajZaznam() {
        LocalDateTime datumCas = naparsujDatumCas();
        System.out.println("Zadejte text záznamu:");
        String text = scanner.nextLine();
        databaza.pridajZaznam(datumCas, text);
    }

    public void vyhledejZaznamy() {
        // Zadání data uživatelem
        LocalDateTime datumCas = naparsujDatum();
        // Vyhledání záznamů
        ArrayList<Zaznam> zaznamy = databaza.najdiZaznam(datumCas, false);
        // Výpis záznamů
        if (zaznamy.size() > 0) {
            System.out.println("Nalezeny tyto záznamy: ");
            for (Zaznam zaznam : zaznamy) {
                System.out.println(zaznam);
            }
        } else {
            System.out.println("Nebyly nalezeny žádné záznamy.");
        }
    }

    public void vymazZaznamy() {
        System.out.println("Budou vymazány záznamy v daný den a hodinu");
        LocalDateTime datumCas = naparsujDatumCas();
        databaza.vymazZaznamy(datumCas);
    }

    public void vypisUvodniObrazovku() {
        System.out.println();
        System.out.println();
        System.out.println("Vítejte v diáři!");
        LocalDateTime dnes = LocalDateTime.now();
        System.out.printf("Dnes je: %s%n", FORMAT_DATA.format(dnes));
        System.out.println();
        // výpis hlavní obrazovky
        System.out.println("Dnes:\n-----");
        vypisZaznamy(dnes);
        System.out.println();
        System.out.println("Zítra:\n------");
        LocalDateTime zitra = LocalDateTime.now().plusDays(1);
        vypisZaznamy(zitra);
        System.out.println();
    }


}
