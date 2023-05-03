package Lesson4;

public class Employee {
    Employee(int id1,String surname1,double salary1,String department1) {
        id = id1;
        surname = surname1;
        salary = salary1;
        department = department1;
    }
        double zarplataX2 () {
            salary *= 2;
            System.out.println(surname + " Vasha zarplata teper " + salary);
            return salary;
        }

    int id;
    String surname;
    double salary;
    String department;

}
class EmployeeTest{
    public static void main(String[] args){
        Employee Emp1 = new Employee(1,"Kovlev",8000,"darom");
        Emp1.zarplataX2();
        Employee Emp2 = new Employee(2,"Pirogov",12000,"darom");
        Emp2.zarplataX2();
    }
}
