package Lesson21;
public class test1 {
}
class Chelovek {                    //Encapsulation
    final String pol;

    public Chelovek(String pol) {
        this.pol = pol;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private StringBuilder surname;

    public StringBuilder getSurname() {
        StringBuilder sB = new StringBuilder(surname);
        return sB;
    }

    public void setSurname(StringBuilder surname) {
        this.surname = surname;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100)
            this.age = age;
    }

    private int ves;

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        if (ves > 0)
            this.ves = ves;
    }
    private boolean clever;

    public boolean isClever() {
        return clever;
    }

    public void setClever(boolean clever) {
        this.clever = clever;
    }

    public static void main(String[] args) {
        Chelovek ch= new Chelovek("Male");
        ch.setAge(38);
        ch.setVes(90);
        ch.setClever(true);
        ch.setName("Vanya");
        ch.setSurname(new StringBuilder("Pirogov"));
        System.out.println("Imya Studenta : "+ch.getName());
        System.out.println("Familiya Studenta : "+ch.getSurname());
        System.out.println("Vozrast Studenta : "+ch.getAge());
        System.out.println("Ves Studenta : "+ch.getVes());
        System.out.println("Student Umnii : "+ch.isClever());

    }
}