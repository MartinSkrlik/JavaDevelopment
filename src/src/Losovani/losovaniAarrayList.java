package Losovani;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class losovaniAarrayList {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in, "Windows-1250");
        Losovac losovac = new Losovac();
        System.out.println("Welcome to the lottery");
        String volba = "0";
        while (!volba.equals("3")) {
            // vypis moznosti
            System.out.println("1 - Losovat další číslo");
            System.out.println("2 - Vypsat čísla");
            System.out.println("3 - Konec");
            volba = scanner.nextLine().trim();
            System.out.println();
            // reakcia na volbu
            switch (volba)
            {
                case "1":
                    System.out.printf("Padlo cislo %s%n", losovac.losuj());
                    break;
                case "2":
                    System.out.printf("Padla cisla %s%n", losovac.vypis());
                    break;
                case "3":
                    System.out.println("Dekuji za pouziti programu");
                    break;
                default:
                    System.out.println("Neplatna volba, zadaj znova");
                    break;
            }
        }

        // Priklad na arrayList
        ArrayList<String> polozky = new ArrayList<String>();
        polozky.add("nohavice");
        System.out.printf("Vypis polozky %s%n", polozky.get(0));
        polozky.set(0,"rukavice");
        System.out.printf("Vypis polozky %s%n", polozky.get(0));

        // Priklad na arrayList
        String[] pole = {"jedna", "dva", "tri"};
        ArrayList<String> polozku = new ArrayList<String>(Arrays.asList(pole));
        System.out.printf("vypis prvu polozku %s%n", polozku.get(2));










    }

}


