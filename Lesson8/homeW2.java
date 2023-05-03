package Lesson8;

public class homeW2 {
   public static final double pi = 3.14;
  public  double ploshad(double x){
        return pi*x*x;
    }
   public static double dlinaOk(double x){
      return 2*pi*x;
  }
  void info(double x){
      System.out.println("Radius: "+x);
      System.out.println("ploshad: "+ploshad(x));
      System.out.println("Dlina okruj.: "+dlinaOk(x));
  }
}
class TestHomeW{
    public static void main(String[] args) {
        homeW2 h1 = new homeW2();
        System.out.println("PLOSHAD : "+h1.ploshad(15));
        System.out.println("Dlina ok: "+homeW2.dlinaOk(15));
        h1.info(15);

    }
}