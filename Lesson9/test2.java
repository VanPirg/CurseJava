package Lesson9;

public class test2 {
    int a=1;
    static int b=2;
    static void abs(final int a){
        System.out.println(a);
        System.out.println(test2.b);
    }

    public static void main(String[] args) {
        abs(5);
    }
}
