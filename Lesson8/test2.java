package Lesson8;

public class test2 {

    static public int umnoj(int a1,int b1,int c1){
      return a1*b1*c1;

    }
    static void delen(int a,int b){
        System.out.println("Celoe "+a/b+" Ostatok "+a%b);

    }
}
class test2t {
    public static void main(String[] args) {
        System.out.println(test2.umnoj(10,12,13));
        test2.delen(13,10);
        System.out.println(test2.umnoj(12,22,13));
        test2.delen(33,12);
    }
}