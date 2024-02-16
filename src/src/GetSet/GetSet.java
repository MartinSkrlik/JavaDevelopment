package GetSet;

public class GetSet {

    public static void main(String[] args) {

        Student student = new Student("Pavel Hora", true, 20);
        student.setVek(15);
//        student.muz = true;
        System.out.println(student);
    }
}

