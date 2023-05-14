package Lesson26;

import java.util.ArrayList;

class Test1{
    public static void main(String[] args) {
        Car c1 = new Car("red","V6");
        Car c2 = new Car("white","V8");
        Car c3 = new Car("red","V6");
        Car c4 = new Car("green","V8");
        Car c5 = new Car("white","V8");
        Car c6 = new Car("green","V6");


        ArrayList<Car> List = new ArrayList<>();
        ArrayList<Car> List1 = new ArrayList<>();

        List.add(c1);
        List.add(c2);
        List.add(c3);
        List.add(c4);
        List.add(c5);
        List.add(c6);

        for (int i=0;i < List.size();i++) {
            for (int j = i+1; j < List.size(); j++) {
                if (List.get(i).equals(List.get(j))) {
                    List1.add(List.get(j));
                }
            }
        }
        for (int i=0;i< List1.size();i++) {
            System.out.println("mashina pod nomerom "+(i+1));
            System.out.println(List1.get(i));
        }

    }
}
