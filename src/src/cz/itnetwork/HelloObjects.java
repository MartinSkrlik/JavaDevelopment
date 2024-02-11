package cz.itnetwork;

//public class HelloObjects {
//
//    public static void main(String[] args) {
//        cz.itnetwork.Zdravic zdravic = new cz.itnetwork.Zdravic();
//        zdravic.text = "Ahoj uživateli";
//        System.out.println(zdravic.pozdrav("Karel"));
//        System.out.println(zdravic.pozdrav("Petr"));
//        zdravic.text = "Vítám tě tu programátore";
//        System.out.println(zdravic.pozdrav("Richard"));
//    }
//}

public class HelloObjects
{
    public static void main(String[] args) {

        Zdravic zdravic = new Zdravic();
        zdravic.pozdrav();
    }
}