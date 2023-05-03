package Lesson17;

public class STBuilder {
    public static boolean ravenstvo(StringBuilder st1, StringBuilder st2) {
        boolean result = true;
        if (st1.length() == st2.length()) {
            for (int i = 0; i < st1.length(); i++) {
                if (st1.charAt(i) != st2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else
            result = false;
        return result;
    }


    public static void main(String[] args) {
      StringBuilder s1 = new StringBuilder("hello");
      StringBuilder s2 = new StringBuilder("hell");
        System.out.println(ravenstvo(s1,s2));
    }
}