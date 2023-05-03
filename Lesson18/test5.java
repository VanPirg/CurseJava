package Lesson18;
import java.util.Arrays;
public class test5 {

    public static void maxMin(double[] array){
        double max = array[0];
        double min = array[0];
        for (int i=1;i<array.length;i++){
            if (max<array[i]){
                max = array[i];
            }
            if (min>array[i]){
                min = array[i];
            }
        }
        System.out.println("maximalnii element: "+max);
        System.out.println("Minimalnii element: "+min);
    }
    public static void main(String[] args) {
        double array1[]={1,9.9,3,-8.45,0,5.34,4,1};
        maxMin(array1);
    }

}
