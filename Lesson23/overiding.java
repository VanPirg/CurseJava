package Lesson23;
public class overiding {
    public static void main(String[] args) {
        Emloyee e = new Emloyee();
        Emloyee e1= new teacher();
        e1.eat();
        e.eat();
    }
}
class Emloyee{
    String name;
    int age;
    int expirience;
    void eat(){System.out.println("Kushaet rabotnik");}
    void sleep(){System.out.println("Spat");}
}
class teacher extends Emloyee {
    String kolichestvoUchenikov;
    void uchit(){System.out.println("Uchit");}
    @Override
    void eat(){System.out.println("Kushaet uchitel");}

}