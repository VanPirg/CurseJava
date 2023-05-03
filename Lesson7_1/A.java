package Lesson7_1;

public class A {
 public A(int a1,int b1){
     a = a1;
     b = b1;
 int c = a1 + b1;
     System.out.println(c);
 }
 int a;
 int b;
// int c;
 /* public   int c(int a1,int b1){
     int  c1 =  a1 + b1;
     System.out.println(c1);
     return c1;


   }*/
 }
    class B {
        public static void main(String[] args) {

            A obj = new A(12,13);
//            obj.c(10,15);
 //         System.out.println(obj.b);
        }
    }
