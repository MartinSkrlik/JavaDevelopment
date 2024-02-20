package DiarArrayObjekty;

import com.sun.source.tree.WhileLoopTree;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Diar {

    private Databaza databaza;
    private Scanner scanner = new Scanner(System.in, "Windows-1250");

    public Diar() {
        databaza = new Databaza();
    }

//    private LocalDateTime naparsujDatumCas() {
//        System.out.println("Zadejte datum a cas ve tvaru [ " + LocalDateTime.now().format(FORMAT_DATA) + " ]: "  );
//        while(true) {
//            try {
//                return LocalDateTime.parse(scanner.nextLine(), FORMAT_DATA);
//            } catch (Exception ex) {
//                System.out.println("Nesprávně zadáno, zadejte prosím znovu.");
//            }
//        }
//    }
//
//    private LocalDateTime naparsujDatum() {
//        System.out.println("Zadejte datum ve tvaru [" + LocalDate.now().format(FORMAT_DATA_BEZ_CASU) + "]:");
//        while (true) {
//            try {
//                return LocalDate.parse(scanner.nextLine(), FORMAT_DATA_BEZ_CASU).atStartOfDay();
//            } catch (Exception ex) {
//                System.out.println("Nesprávně zadáno, zadejte prosím znovu.");
//            }
//        }
//    }
}
