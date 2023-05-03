package Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public ArrayList<String> abc(String...s){
        ArrayList<String> al = new ArrayList<>();
        for (String s1:s){
            if (!al.contains(s1)){
                al.add(s1);
            }
        }
        Collections .sort(al);
        System.out.println(al);
        return al;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.abc("Privet","poka","kak dela","bay","poka","bay");
    }
}
