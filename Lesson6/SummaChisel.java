package Lesson6;

public class SummaChisel {
        int summa(int a,int b,int c,int d){
          return a+b+c+d;

        }
        int summa(int a,int b,int c) {
            return summa(a, b, c,0);
        }
        int summa(int a,int b){
            return summa(a,b,0,0);

        }
        int summa(int a){
        return summa(a,0,0,0);

        }
        int summa(){
        return 0;

        }
}
 class SummaChiselTest{
    public static void main(String[] args) {
        SummaChisel s = new SummaChisel();
        int summa1 = s.summa(1,2,3,12);
        System.out.println(summa1);

    }
}