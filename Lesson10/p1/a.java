package Lesson10.p1;
import static Lesson10.p1.p2.b.*;

 public class a{

  public a(int licensCar1,String markCar1,String colrCar1){ // dannie mashini
        licensCar = licensCar1;
        markCar = markCar1;
        colrCar = colrCar1;
        count ++;

      System.out.println("Nomer Auto : "+licensCar);
      System.out.println("marka Auto : "+markCar);
      System.out.println("Cvet Auto : "+colrCar);
      System.out.println("Id Auto : "+count);
      System.out.println("*****************************************************************************");
  }
    public  int licensCar;
    public String markCar;
    public String colrCar;
 }

 class aTest {
    public static void main(String[] args) {
       a a1 = new a(6677651,"Kia Sorento","Green");
       a a2 = new a(9755643,"Ford Mondeu","White");
       a a3 = new a(5544789,"Rexton","Grey");
       System.out.println(a2.markCar);
    }
}