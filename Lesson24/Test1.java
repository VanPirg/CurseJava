package Lesson24;
class Test1{
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("yuppi");
        System.out.println(mechenosec.name);
        mechenosec.swim();
        mechenosec.eat();
        mechenosec.sleep();
        Speakable sp = new Pingvin("Освальд");
        sp.speak();
        Animal an = new Lev("Mufasa");
        System.out.println(an.name);
        an.eat();
        an.sleep();
        Mammal mammal = new Lev("Simba");
        System.out.println(mammal.name);
        mammal.run();
        mammal.eat();
        mammal.speak();
        mammal.sleep();
    }
}
abstract class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal{
    public Fish(String name) {
        super(name);
    }

    @Override
    void eat(){}

    @Override
    void sleep() {
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
    }
    abstract   void swim();
}
abstract class Bird extends Animal implements Speakable{
    @Override
    public void speak() {
        System.out.println(name+" sings");
    }

    public Bird(String name) {
        super(name);
    }
    abstract void fly();
}
abstract class Mammal extends Animal implements Speakable {

    public Mammal(String name) {
        super(name);
    }
    abstract void run();
}
interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }

}
class Mechenosec extends Fish{
    public Mechenosec(String name) {
        super(name);
    }
    @Override
    void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }

    @Override
    void eat() {
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!");
    }
}
class Pingvin extends Bird{
    public Pingvin(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    @Override
    void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }

    @Override
    void fly() {
        System.out.println("Pingvini ne umeyut letat!");
    }

    @Override
    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }
}
class Lev extends Mammal{
    public Lev(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Lev-eto ne samaya bistraya koshka!");
    }

    @Override
    void eat() {
        System.out.println("Lev, kak lyuboy xishnik, lyubit myaso!");
    }

    @Override
    void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit!");
    }

}