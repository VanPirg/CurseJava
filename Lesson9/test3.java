package Lesson9;

public class test3 {
    int a = 1;
    static int b = 2;

    void abs(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(test3.b);
    }

    public static void main(String[] args) {


        test3 t = new test3();
        t.abs(4);
    }
}
