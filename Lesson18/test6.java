package Lesson18;
import java.util.Arrays;

public class test6 {
    public static int[] sortirovka(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] sortedArr = test6.sortirovka(arr);
        System.out.println(Arrays.toString(sortedArr));


    }
}