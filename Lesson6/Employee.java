package Lesson6;

public class Employee {
        Employee(String surname1,int age1){
            this(0,surname1,age1,0.0,null);
        }
        Employee(int id2,String surname2,int age2){
            this(id2,surname2,age2,0.0,null);
        }

        Employee(int id3,String surname3,int age3,double salary3,String department3){
        id=id3;
        surname=surname3;
        age=age3;
        salary=salary3;
        department=department3;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}
 class EmployeeTest {
    public static void main(String[] args) {
        Employee em = new Employee("Sidorov", 25);
        System.out.println(em.surname+" "+em.age+" "+em.department);
    }
}