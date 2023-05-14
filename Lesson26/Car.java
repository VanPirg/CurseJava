package Lesson26;

public class Car {
    public String color;
    public String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    //  *********************************** Overided Method Equals *********************************************

    public boolean equals(Object obj){
        if (obj instanceof Car){
            Car c1 = (Car)obj;
            return (color.equals(c1.color) && engine.equals(c1.engine));
        }
        else return false;
    }
    //************************************ Overided Method toString *********************************************
public String toString(){
        return "Odinakovie Mashini Cveta "+color+" I s motorom "+engine;
}
}