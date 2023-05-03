package Lesson11;

public class car {
    String color;
    double engine;
    int numDours;
    car(String color,double engine,int numDours){
        this.color=color;
        this.engine=engine;
        this.numDours=numDours;
    }

}
class carTest{


    void chcolor(car c1,car c2){
        String color = c1.color;
        c1.color=c2.color;
        c2.color=color;
    }
    void changeNumDours(car ch,int dourc){
        ch.numDours=dourc;
    }


    public static void main(String[] args) {
        carTest ct = new carTest();
        car c1 = new car("black",2.2,5);
        car c2 = new car("Yelow",1.6,3);
        System.out.println(c1.numDours);
        ct.changeNumDours(c2,6);
        System.out.println(c2.numDours);
        System.out.println("starii cvet : "+c1.color);
        ct.chcolor(c1,c2);
        System.out.println("novi Cvet : "+c1.color);



    }
}