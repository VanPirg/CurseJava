package Lesson15;

public class TimeB {
    static void timePR(){
        int chas=0;
        A:while (chas<6){
            int min=-1;
            B:do{
                min++;
                if(chas>1 && min%10==0){
                    break A;
                }
                int sec=0;
                C:while(sec<60){
                    if (sec*chas>min){
                        continue B;
                    }
                    System.out.println(chas+":"+min+":"+sec);
                    sec++;
                }
            }
            while(min<59);
            chas++;
        }
    }

    public static void main(String[] args) {
        timePR();
    }
}
