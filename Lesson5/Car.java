package Lesson5;

public class Car {
    Car(String cvet, String motor) {
      color=cvet;
      engine= motor;
      System.out.println("Cvet mashini "+color+" motor "+engine);
    }
    String color;
    String engine;
}
class CarTest{
    public static void main(String[]args){
        Car car1 = new Car("Yelow","V6");

    }
}