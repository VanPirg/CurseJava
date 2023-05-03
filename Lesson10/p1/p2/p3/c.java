package Lesson10.p1.p2.p3;
import Lesson10.p1.*;
import static Lesson10.p1.p2.b.count;


public class c {   //danie vladelca
  public c(String name1, String surneme1, int idPerson1, long telNum1) {
        name = name1;
        surneme = surneme1;
        idPerson = idPerson1;
        telNum = telNum1;
        System.out.println(name+" "+surneme+" "+idPerson+" "+0+telNum);

    }

    public String name;
    public String surneme;
    public int idPerson;
    public long telNum;

}
class cTest{
    public static void main(String[] args) {
        c c1 = new c("Danik","Pirogov",323493262,534731309);
        a a1 = new a(6677651,"Kia Sorento","Green");


    }
}