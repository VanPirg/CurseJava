package Lesson9;

public class test1 {
    static int a=2;
    void abs(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        test1 t =new test1();
        t.abs(3);
    }


}
