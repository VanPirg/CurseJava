package Lesson3;

public class Program
{
    public static void main(String[] args) {
        Country c = new Country();
        c.name = "France";
        c.capital = "Paris";
        System.out.println("Lesson3.Country:  " + c.name);
        System.out.println("Capital:  " + c.capital);
    }


}
class Country{
    //change the code below
    public   String name;
    public String capital;
}