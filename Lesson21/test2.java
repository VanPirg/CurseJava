package Lesson21;

public class test2 {                    //Inheritance
    public static void main(String[] args) {
        doctor doc = new doctor();
        doc.name="Oleg";
        teacher tech = new teacher();
        tech.name="Petr";

    }
}
class Emloyee{
    String name;
    int age;
    int expirience;
    void eat(){System.out.println("Kushat");}
    void sleep(){System.out.println("Spat");}
}
class doctor extends Emloyee{
    String specializacia;
    void lecit(){System.out.println("Lechit");}
}
class teacher extends Emloyee{
    String kolichestvoUchenikov;
    void uchit(){System.out.println("Uchit");}
}