package Lesson5;

public class Main {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        //ваш код
        double dc=0;
        for (double x: revenue ) {
            dc +=x;
        }
        System.out.print(dc/12);
    }

}
