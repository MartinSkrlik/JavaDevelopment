import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

//public class mato {
//    public static void main (String[] args) {
//        Scanner fff = new Scanner(System.in, "Windows-1250");
//        System.out.println("Ahoj jebo");
//        System.out.println("Napis nieco: ");
//        String vstup = fff.nextLine();
//        String vystup;
//        vystup = vstup + ", " + vstup + "!";
//        System.out.println(vystup);
//    }
//}

//class mato {
//    public static void main (String[] args) {
//        Scanner ako = new Scanner(System.in, "Windows-1250");
//        String s = ako.nextLine();
//        int a = Integer.parseInt(s);
//        a = a * 2;
//        System.out.println(a);
//}}

//class mato {
//    public static void main (String[] args) {
//        Scanner ako = new Scanner(System.in, "Windows-1250");
//        System.out.println("Input your number");
//        float a = Float.parseFloat(ako.nextLine());
//        System.out.println("Input your next number");
//        float b = Float.parseFloat(ako.nextLine());
//        float sum = a + b;
//        float minus = a - b;
//        float times = a * b;
//        float divide = a / b;
//        System.out.println("sum " + sum);
//        System.out.println("minus " + minus);
//        System.out.println("times " + times);
//        System.out.println("divide " + divide);
//}}

//class mato {
//    public static void main (String[] args) {
//        Scanner ako = new Scanner (System.in, "Windows-1250");
//        System.out.println("Ahoj, jak se jmenuješ?");
//        String text = ako.nextLine();
//        System.out.println("jaky jsi?");
//        String textt = ako.nextLine();
//        String texttt = text + " je " + textt;
//        System.out.println(texttt);
//    }
//}

//class mato {
//    public static void main (String[] args) {
//        Scanner ako = new Scanner (System.in, "Windows-1250");
//        System.out.println("Zadej poloměr kruhu (cm):");
//        double a = Double.parseDouble(ako.nextLine());
//        double b = a * 3.14 * 2;
//        String result = String.format("%.4f", b);
//        System.out.println(result);
//        System.out.println("Jeho obsah je ");
//        double c = 3.14 * (a * a);
//        String jaja = String.format("%.4f", c);
//        System.out.println(jaja + " cm2");
//
//
//    }
// Trieda string a jej hlavne metody
//class mato {
//    public static void main (String[] args) {
//        String s = "Krokonosohroch";
//        System.out.println(s.startsWith("krok"));
//        System.out.println(s.endsWith("hroch"));
//        System.out.println(s.contains("nos"));
//        System.out.println(s.contains("roh"));
//        String s1 = " ";
//        String s2 = "";
//        String s3 = "slovo";
//        System.out.println(s1.isEmpty());
//        System.out.println(s2.isEmpty());
//        System.out.println(s3.isEmpty());
//      String konfig = "Fullscreen shaDows autosave";
//      konfig = konfig.toLowerCase();
//      System.out.println("Pobezi hra na fullcreenu?");
//      System.out.println(konfig.contains("autosave"));
//      System.out.println(konfig);
//        System.out.println("Zadaj cislo jebko");
//        Scanner ako = new Scanner(System.in, "Windows-1250");
//        String s = ako.nextLine();
//        System.out.println("Zadaj cislo lebo bude zle " + s);
//        System.out.println("Text po funkci trim: " + s.trim());
//        int a = Integer.parseInt(s.trim());
//        System.out.println("dfsf" + a);
//        String s = "c# je nejlepsi";
//        s = s.replace("c#", "Java");
//        System.out.println(s);
//        int a =10;
//        int b = 29;
//        int c = a + b;
//        String s = String.format("Kdyz secteme %d a %d, dostaneme %d ", a,b,c);
//        System.out.println(s);
//        System.out.println(s.length()); }
//}
// Podmienky
//class mato{
//    public static void main(String[] args){
////    if(1>5)
////        System.out.println("Pravda");
////    else
////        System.out.println("Nie je pravda");
////    System.out.println("Program zde pokracuje dal");
//    Scanner sc = new Scanner(System.in, "Windows-1250");
//    int a = Integer.parseInt(sc.nextLine());
//    if(a > 5)
//        System.out.println("Si jebo");
//    else
//        System.out.println("Nevies us");

//    int b = sc.nextInt();
//    if (b >= 0)
//    {
//        System.out.println("Zadal si cislo vacsie resp.rovne ako 0 ");
//        double o = Math.sqrt(b);
//        System.out.println("Odmocnina z cisla " + b +" je " + o );
//    }
//    else
//    {
//        System.out.println("Zadal si zapornu hodnotu");
//    }
//    System.out.println("Uz to zavri");
//      int a = Integer.parseInt(sc.nextLine());
//      int b = Integer.parseInt(sc.nextLine());
//      int volba = Integer.parseInt(sc.nextLine());
//      float vysledok = 0;
////      if (volba == 1)
////      {
////          vysledok = a + b;
////      }
////      else if (volba == 2)
////      {
////          vysledok = a - b;
////      }
////      else if (volba == 3)
////      {
////          vysledok = a * b;
////      }
////      else if (volba == 4)
////      {
////          vysledok = a / b;
////      }
////      if ((volba > 0) && (volba < 5))
////      {
////          System.out.println("Vysleok: " + vysledok);
////      }
////      else {
////          System.out.println("Neplatna volba");
////      }
//      switch (volba)
//      {
//          case 1:
//              vysledok = a + b;
//          break;
//          case 2:
//              vysledok = a - b;
//          break;
//          case 3:
//              vysledok = a * b;
//          break;
//          case 4:
//              vysledok = a / b;
//          break;
//      }
//    if ((volba > 0) && (volba < 5))
//    {
//        System.out.println("Vysledok " + vysledok);
//    }
//    else
//    {
//        System.out.println("Neplatna volba");
//    }
//    System.out.println("Vdaka, za pouzitie kalkulacky");
//    }}

//cykly

//class mato{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in, "Windows-1250");
//        for (int i = 1;i <= 10; i++)
//        {
//            for (int j = 1; j <= 10; j++)
//            {
//                System.out.print((i * j) + " ");
//            }
//            System.out.println();
//        }

//        int i = 1;
//        while (i <= 10)
//        {
//            System.out.println(i + " ");
//            i++;
//        }

//        System.out.println("Vitajte v kalkulacke");
//        String pokracovat = "ano";
//        while (pokracovat.equals("ano"))
//        {
//            System.out.println("Zadajte prvni cislo");
//            float a = Float.parseFloat(sc.nextLine());
//            System.out.println("Zadaj druhe cislo");
//            float b = Float.parseFloat(sc.nextLine());
//            if (a > 10)
//            {
//                System.out.println("Tvoje cislo je" + a * b);
//            }
//            if (b > 10)
//            {
//                System.out.println("Tvoje cislo je " + (a + b));
//            }
//            System.out.println("Zadaj znova ");
//            pokracovat = sc.nextLine();
//        }
//        System.out.println("Dakujem za pouzitie kalkulacky");

//        int[] pole = new int[10];
//        pole[0] = 1;
//        for (int i = 0; i < 10; i++)
//        {
//            pole[i] = i + 1;
//            System.out.println(" " + i);
//        }
//        for (int j : pole)
//        {
//            System.out.println(j + "");
//        }
//        System.out.print(pole.length);

//        String [] pole = {"mato","mato","peto","miki"};
//        Arrays.sort(pole);
//        for (String d : pole)
//        {
//            System.out.println(d + " ");
//        }
//    }}

//class mato{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in, "Windows-1250");
//        String[]simpsons={"homer","bart","lisa","march","ivan"};
//        System.out.println("Zadaj meno od simpsnov");
//        String meno = sc.nextLine();
//        Arrays.sort(simpsons);
//        int pozicia = Arrays.binarySearch(simpsons,meno);
//        if (pozicia >= 0)
//        {System.out.println("Nasiel som co som hladal");System.out.println(simpsons[pozicia]);}
//        else if (pozicia < 0)
//            System.out.println("Nic som nenasiel");
//    }}

//class mato{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in, "Windows-1250");
//        System.out.println("Spocitat priemer znamok");
//        int pocet = Integer.parseInt(sc.nextLine());
//        int[] cisla = new int[pocet];
//        for (int i  = 0; i < pocet; i++)
//        {System.out.println("mainlocal "+ i +" cislo:  " );}
//
//    }}

//class mato{
//    public static void main(String[] args) { // textovy retazec
//        String ako = "sdfsd"; // textovy retazec
//        System.out.println(ako.charAt(2)); // metoda na vypisanie znaku retazca cez index
//        System.out.println(ako.indexOf('f')); // metoda na vypisanie indexu konkretneho pismena v retazci
//        String hill = "Mount Everest";
//        hill = hill.toLowerCase();
//        int numberofvowel = 0;
//        int numberofconsonant = 0;
//        String vowels = "aeiouyáéěíóúůý";
//        String consonants = "bcčdďfghjklmnpqrřsštťvwxzž";
//        for (char c : hill.toCharArray()) {
//            if (vowels.contains(String.valueOf(c))) {numberofvowel++;}
//            else if (consonants.contains(String.valueOf(c))) {numberofconsonant++;}
//        }
//        System.out.printf("Samohlasky: %d\n", numberofvowel);
//        System.out.printf("Spoluhlasky: %d\n", numberofconsonant);
//        System.out.printf("Nepismenkove znaky: %d\n", hill.length() - (numberofconsonant + numberofvowel));
//    }}

//class mato{
//    public static void main(String[] args) { // sifrovanie sprav, kod ascii, char znaky
//        String s = "zebra";
//        System.out.printf("\nPůvodní zpráva: %s", s);
//        String zprava = "";
//        int posun = 1;
//        for (char c : s.toCharArray()) {
//        int i = (int)c;
//        if (i > (int)'z') {
//            i -= 26;
//        }
//        i += posun;
//        char znak = (char)i;
//        zprava += znak;
//        }
//        System.out.printf("\nZašifrovaná zpráva: %s\n", zprava);
//        System.out.printf("aka" + "," + " aka");
//    }
//}

//class mato{
//    public static void main(String[] args) { // split,join metody pre pracu s retazcami
//        String s = ".-.. . --- -. .- .-. -.. ---";
//        // Retazec s dekodovanou spravou
//        String zprava = "";
//        // vzorove polia
//        String abecedniZnaky = "abcdefghijklmnopqrstuvwxyz";
//        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
//                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
//                "...-", ".--", "-..-", "-.--", "--.."};
//        // rozbitie znakov
//        String[] znaky = s.split(" ");
//        // iterovanie cez pole znakov
//        for (String morzeovznak : znaky ) {
//            char abecedniZnak = '?';
//
//            int index = -1;
//            for (int i = 0; i < morseovyZnaky.length ;i++) {
//                if (morseovyZnaky[i].equals(morzeovznak))
//                    index = i;
//            }
//
//            if (index >= 0) {
//                abecedniZnak = abecedniZnaky.charAt(index);
//            }
//            zprava += abecedniZnak;
//        }
//    System.out.printf("Dekodovana zprava:  %s\n", zprava);
//    String ako = String.join("->", morseovyZnaky[1], morseovyZnaky[2]); // join methods
//    System.out.println(ako);
//    System.out.println("sfsdfsdfd\nsdfsdfsdf"); // \n - odriadkovanie
//    System.out.println("dfsdfsdf\tdsfsdfsdf");
//    }
//}

class mato{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
//        System.out.println("Zadejte číslo k zdvojnásobení:");
//        String hodnota = scanner.nextLine();
//        double cislo = Double.parseDouble(scanner.nextLine());
//        int cislo = Integer.parseInt(hodnota);
//        cislo = cislo * 2;
//        System.out.println(cislo);
//        double cislo2 = Double.parseDouble(scanner.nextLine());
//        double times = cislo * cislo2;
//        float divide = (float) (cislo / cislo2);
//        double sum  = cislo + cislo2;
//        double substract = cislo - cislo2;
//        System.out.println("sucet " + String.valueOf(sum));
//        System.out.println("odcitanie " + substract);
//        System.out.println("nasobenie " + times);
//        System.out.println("delenie " + divide);
//        boolean nepravda = false;
//        boolean vyraz = (15 < 5);
//        System.out.println(nepravda);
//        System.out.println(vyraz);
//        String mato = "bjez do pice";
//        System.out.println(mato);
//        String vstup = "Krokonosohroch";
//        System.out.println(vstup.isEmpty());
//        System.out.println(vstup.endsWith("hroch"));
//        System.out.println(vstup.contains("nos"));
//        System.out.println(vstup.contains("roh"));
//        vstup = vstup.toUpperCase();
//        System.out.println(vstup);
//        String mato = scanner.next();
//        System.out.println("vypis " + mato.trim());
//        double cislo = Double.parseDouble(mato.trim());
//        System.out.println("vypis " + cislo) ;
//        String veta = "C# je najlepsi";
//        veta = veta.replaceAll("najlepsi","najhorsi");
//        System.out.println(veta);
//        int a = 10;
//        int b = 20;
//        int soucet = a + b;
//        int ako = a;
//        String veta = String.format("Když sečteme %d a %d, dostaneme %d", a, b, ako);
//        System.out.println(veta);
//        String jmeno = scanner.nextLine();
//        System.out.printf("Délka vašeho jména je: %d", jmeno.length());
//        String martin = scanner.nextLine();
//        System.out.printf("tu mas: %d", martin.length());
//        if (15 > 5)
//            System.out.println("Pravda");
//        System.out.println("Program zde pokračuje dál");
//        int cislo = Integer.parseInt(scanner.nextLine());
//        if ((cislo >= 5 && cislo <=5) && (cislo > 5 && cislo <5)) {System.out.println("cislo je vacsie");
//        double odmocnina = Math.sqrt(cislo);
//        System.out.println("cislo " +cislo+ " zaklad " + odmocnina);}
//        else {System.out.println("else");}

//        System.out.println("Vitaj v kalkulacke gadzo");
//        System.out.println("Zadaj cislo");
//        double a = Double.parseDouble(scanner.nextLine());
//        System.out.println("Zadaj druhe cislo");
//        double b = Double.parseDouble(scanner.nextLine());
//        System.out.println("1 - sčítání");
//        System.out.println("2 - odčítání");
//        System.out.println("3 - násobení");
//        System.out.println("4 - dělení");
//        int volba = Integer.parseInt(scanner.nextLine());
//        double vysledok = 0;
//        if (volba == 1) {vysledok = a + b;}
//        else if (volba == 2) {vysledok = a - b;}
//        else if (volba == 3) {vysledok = a * b;}
//        else if (volba == 4) {vysledok = a / b;}
//        if ((volba > 0) && (volba <5)) {
//                System.out.println("Tvoj vyjebany vysledok je " + vysledok);
//        } else {System.out.println("Zadaj znova jebo");}
//        System.out.println();
//        System.out.println("Děkuji za použití kalkulačky.");

//        System.out.println("Vitaj v kalkulacke gadzo");
//        System.out.println("Zadaj cislo");
//        double a = Double.parseDouble(scanner.nextLine());
//        System.out.println("Zadaj druhe cislo");
//        double b = Double.parseDouble(scanner.nextLine());
//        System.out.println("1 - sčítání");
//        System.out.println("2 - odčítání");
//        System.out.println("3 - násobení");
//        System.out.println("4 - dělení");
//        int volba = Integer.parseInt(scanner.nextLine());
//        double vysledok = 0;
//        switch(volba) {
//            case 1:
//                vysledok = a + b;
//                break;
//            case 2:
//                vysledok = a - b;
//                break;
//            case 3:
//                vysledok = a * b;
//                break;
//            case 4:
//                vysledok = a / b;
//                break;
//            default:
//                vysledok = 6;
//        }
//        if ((volba > 0) && (volba <6)) {
//            System.out.println("Tvoj vyjebany vysledok je " + vysledok);
//        } else {System.out.println("Zadaj znova jebo");}
//        System.out.println();
//        System.out.println("Děkuji za použití kalkulačky.");

//        for (int i = 0; i < 3; i++){
//            System.out.println("Knock knock knock");
//        }
//        System.out.println("Penny");

//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//        }

//        int i = 1;
//        while (i <= 10) {
//            System.out.println("hej no");
//            i++;
//        }

//        System.out.println("Vitaj v kalkulacke gadzo");
//        String pokracovat = "ano";
//        while (pokracovat.equals("ano")) {
//            System.out.println("Zadaj cislo");
//            double a = Double.parseDouble(scanner.nextLine());
//            System.out.println("Zadaj druhe cislo");
//            double b = Double.parseDouble(scanner.nextLine());
//            System.out.println("1 - sčítání");
//            System.out.println("2 - odčítání");
//            System.out.println("3 - násobení");
//            System.out.println("4 - dělení");
//            int volba = Integer.parseInt(scanner.nextLine());
//            double vysledok = 0;
//            switch (volba) {
//                case 1:
//                    vysledok = a + b;
//                    break;
//                case 2:
//                    vysledok = a - b;
//                    break;
//                case 3:
//                    vysledok = a * b;
//                    break;
//                case 4:
//                    vysledok = a / b;
//                    break;
//                default:
//                    vysledok = 6;
//            }
//            if ((volba > 0) && (volba < 6)) {
//                System.out.println("Tvoj vyjebany vysledok je " + vysledok);
//            } else {
//                System.out.println("Konec");
//            }
//            System.out.println();
//            System.out.println("Zadaj ci check pkracovat znova [ano/nie]");
//            pokracovat = scanner.nextLine();
//            System.out.println("Děkuji za použití kalkulačky.");

//            int[] pole = new int[10];
//            for (int i = 0; i < pole.length ; i++) {
//            pole[i] = i + 1;
//            System.out.print(pole[i] + " ");
//            }

//        int[] pole = new int[10];
//        for (int i = 0; i < pole.length ; i++) {
//            pole[i] = i + 1;
//        }
//        for (int policko : pole) {
//            System.out.println("Vypis cisla " + policko);
//        }

//        String[] simpsons = {"Igor", "Alojz", "Kakko"};
//        Arrays.sort(simpsons);
//        for (String meno : simpsons){
//            System.out.println(meno);
//        }

//        System.out.println("Ahoj, spočítám ti průměr známek. Kolik známek zadáš?");
//        int pocet = Integer.parseInt(scanner.nextLine());
//        int [] znamky = new int[pocet];
//        for (int i = 0; i < pocet; i++) {
//            System.out.printf("Zadejte %d. číslo:%n", i + 1);
//            znamky[i] = Integer.parseInt(scanner.nextLine());
//        }
//        int sucet = 0;
//        for (int cislo: znamky) {
//            sucet += cislo;
//        }
//        double vysledok = sucet / (double)znamky.length;
//        System.out.printf("Tvoj vysledok je: %5f", vysledok  );

//        String java = "java";
//        System.out.println(java);
//        System.out.println(java.indexOf('v'));

//        String hora = "Mount Everest";
//        System.out.println(hora);
//        hora = hora.toLowerCase();
//        int pocetSamohlasek = 0;
//        int pocetSouhlasek = 0;
//        String samohlasky = "aeiouyáéěíóúůý";
//        String souhlasky = "bcčdďfghjklmnpqrřsštťvwxzž";
//        for (char znak : hora.toCharArray()) {
//            if (samohlasky.contains(String.valueOf(znak))) {
//                pocetSamohlasek++;
//            } else if (souhlasky.contains(String.valueOf(znak)))
//                pocetSouhlasek++;
//            }
//        System.out.printf("Samohlasky %d, %n", pocetSamohlasek);
//        System.out.printf("Spoluhlasky %d, %n", pocetSouhlasek);
//        System.out.printf("Nepisomne znaky %d, %n", hora.length() - (pocetSamohlasek + pocetSouhlasek));

//        char znak;
//        int hodnotaAsci;
//        znak = 'a';
//        System.out.println("");
//        hodnotaAsci = (int)znak;
//        System.out.printf("Znak na asci kod %d%n", hodnotaAsci);
//        hodnotaAsci = 97;
//        znak = (char)hodnotaAsci;
//        System.out.printf("Kod na znak %c", znak);

//        String povodnaSprava = "juliusgalusceasar";
//        System.out.printf("povodna sprava %s%n", povodnaSprava);
//        String zasifrovanaSprava = "";
//        int posun = 1;
//        for (char znak : povodnaSprava.toCharArray()){
//            int ascii = (int)znak;
//            if (ascii > (int)'z') {
//                ascii =-26;
//            }
//            znak = (char)ascii;
//            zasifrovanaSprava += znak;
//            System.out.printf("Vypis vsetko znaky: %s%n", zasifrovanaSprava);
//        }

//        System.out.println("Wolfgang Amadeus Mozarrt".substring(9,16));
//        System.out.println("Mozart".compareTo("Mozarte"));

//        String sifrovanaSprava = ".-.. . --- -. .- .-. -.. ---";
//        System.out.printf("Puvodni zprava: %s%n ", sifrovanaSprava);
//        String desifrovanaSprava = "";
//        String abeceda = "abcdefghijklmnopqrstuvwxyz";
//        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
//                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
//                "...-", ".--", "-..-", "-.--", "--.."};
//        String[] znaky = sifrovanaSprava.split(" ");
//        for (String morseuvZnak : znaky) {
//            char abecedniZnak = '?';
//            int index = -1;
//        for (int i = 0; i < morseovyZnaky.length; i++) {
//            if (morseovyZnaky[i].equals(morseuvZnak))
//                index = i;
//        }
//        if (index >= 0) {
//            abecedniZnak = abeceda.charAt(index);
//        }
//        desifrovanaSprava += abecedniZnak;
//        }
//        System.out.printf("Dekodovana zprava: %s%n ", desifrovanaSprava);

//        System.out.println("Prvni radka\ndruha radka");
//        System.out.println("Toto je zpětné lomítko: \\");
//        System.out.println("Toto je uvozovka: \"");

//        boolean muz = true;
//        String nasePohlavy = "";
//        if (muz) {
//            nasePohlavy = "muz";}
//        else {nasePohlavy = "zena";}
//        System.out.printf("Zase pohlavy %s%n",nasePohlavy);

//        boolean muz = true;
//        String nasePohlavy = (muz) ? "mdsfsdfuz" : "zdsfsdfna";
//        System.out.println(nasePohlavy);

//        int vek = 4;
//        int  ako =(vek >= 4) ? 12 : 34;
//        System.out.println(ako);

//        String smajlik = ":(";
//        String nalada = (smajlik.equals(":)")) ? "veselý" : (smajlik.equals(":(")) ? "smutný" : "neznámý";
//        System.out.println(nalada);

//        int mesic = 2;
//        switch (mesic) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Je první čtvrtletí.");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Je druhé čtvrtletí.");
//                break;
//            case 7:
//            case 8:
//            case 9:
//                System.out.println("Je třetí čtvrtletí.");
//                break;
//            case 10:
//            case 11:
//            case 12:
//                System.out.println("Je čtvrté čtvrtletí.");
//                break;
//        }

//        int mesic = 11;
//        switch (mesic) {
//            case 1, 2, 3 -> System.out.println("Je první čtvrtletí.");
//            case 4, 5, 6 -> System.out.println("Je druhé čtvrtletí.");
//            case 7, 8, 9 -> System.out.println("Je třetí čtvrtletí.");
//            case 10, 11, 12 -> System.out.println("Je čtvrté čtvrtletí.");
//        }

//        System.out.println("Vítejte v kalkulačce");
//        String pokracovat;
//        do {
//            System.out.println("Zadejte první číslo:");
//            double a = Double.parseDouble(scanner.nextLine());
//            System.out.println("Zadejte druhé číslo:");
//            double b = Double.parseDouble(scanner.nextLine());
//            System.out.println("Zvolte si operaci:");
//            System.out.println("1 - sčítání");
//            System.out.println("2 - odčítání");
//            System.out.println("3 - násobení");
//            System.out.println("4 - dělení");
//            int volba = Integer.parseInt(scanner.nextLine());
//            double vysledek = 0;
//            switch (volba) {
//                case 1:
//                    vysledek = a + b;
//                    break;
//                case 2:
//                    vysledek = a - b;
//                    break;
//                case 3:
//                    vysledek = a * b;
//                    break;
//                case 4:
//                    vysledek = a / b;
//                    break;
//            }
//            if ((volba > 0) && (volba < 5)) {
//                System.out.println("Výsledek: " + vysledek);
//            } else {
//                System.out.println("Neplatná volba");
//            }
//            System.out.println("Přejete si zadat další příklad? [ano/ne]");
//            pokracovat = scanner.nextLine();
//        } while (pokracovat.equals("ano"));
//        System.out.println("Děkuji za použití kalkulačky.");

//        String[] ovocie = {"Jabkla","Hrusky","Medicekkkkkdd","Osol"};
//        int hledanyIndex = -1;
//        for (int i = 0; i < ovocie.length; i++) {
//            if (ovocie[i].length() > 10) {
//                hledanyIndex = i;
//                break;
//            }
//        }
//        if (hledanyIndex >= 0) {
//            System.out.println("Prve slovo so znakmi viac ako 6 je " + ovocie[hledanyIndex]);
//        }

//        String retazec = "10,50,ab10cd,30,9";
//        String[] polozky = retazec.split(",");
//        int sucet = 0;
//        for (String polozka : polozky) {
//            if (!polozka.matches("\\d+"))
//                continue;
//        int cislo = Integer.parseInt(polozka);
//        sucet += cislo;
//        }
//        System.out.println("Vsetky cisla " + sucet);

//        for (int i = 0; i < 10; System.out.print(i++));

//        System.out.println("Pí: " + Math.min(7,8));
//        System.out.println("e: " + Math.max(7,9));
//        System.out.println("Pí: " + Math.round(1.45567788));
//        System.out.println("e: " + Math.ceil(4545.68687868));
//        System.out.println("e: " + Math.floor(4545.68687868));
//        System.out.println("Pí: " + Math.abs(1.45567788));
//        System.out.println("e: " + Math.signum(-555.7777));
//        System.out.println("Pí: " + Math.sin(1.45567788));
//        System.out.println("e: " + Math.cos(4545.68687868));
//        System.out.println("e: " + Math.tan(4545.68687868));
//        System.out.println("Pí: " + Math.acos(1.45567788));
//        System.out.println("e: " + Math.asin(4545.68687868));
//        System.out.println("e: " + Math.atan(4545.68687868));
//        System.out.println("Pí: " + Math.pow(1.45567788,7));
//        System.out.println("e: " + Math.sqrt(4545.68687868));
//        System.out.println("e: " + Math.exp(4545.68687868));
//        System.out.println("e: " + Math.log(4545.68687868));
//        System.out.println("e: " + Math.log10(4545.68687868));
//        System.out.println(Math.pow(8,(1.0/3.0)));

//        int a = 5 / 2;
//        double b = 5 / 2;
//        double c = 5.0 / 2;
//        double d = 5 / 2.0;
//        double e = 5.0 / 2.0;
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(11 % 2); // Vypíše 1


//        System.out.println();

    }
}
