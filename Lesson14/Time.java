package Lesson14;

public class Time {
    public static   void Time() {
        A:
        for (int chas = 0; chas < 6; chas++) {

            B:
            for (int min = 0; min <= 59; min++) {
                if (chas > 1 && min % 10 == 0) {
                    break A;
                }
                C:
                for (int sec = 0; sec <= 59; sec++) {
                    if (sec * chas > min) {
                        continue B;
                    }
                    System.out.println(chas + ":" + min + ":" + sec);

                }

            }


        }
    }
    public static void main(String[] args) {
        Time.Time();
    }
}
