package Lesson6;

public class Student1 {

    Student1(int id1, String name1, String surname1, String course1, int studyYear1) {
        id = id1;
        name = name1;
        surname = surname1;
        course = course1;
        studyYear = studyYear1;
    }
    Student1(int id2, String name2, String surname2, String course2) {
        this(id2, name2, surname2, course2, 0);
    }

    Student1() {
        this(0, null, null, null, 0);
    }



    int id;
    String name;
    String surname;
    String course;
    int studyYear;

}

class Student1Test{
    public static void main(String[] args) {

        Student1 st1= new Student1();
        System.out.println(st1.id+" "+st1.name);
        Student1 st2= new Student1(1,"Ivan","Petrov","it",5);
        System.out.println(st2.id+" "+st2.name+" "+st2.course);
        Student1 st3= new Student1(2,"Anastasya","Kovlev","parichmaher",3);
        System.out.println(st3.id+" "+st3.name+" "+st3.surname+" "+st3.course+" "+st3.studyYear);
    }
}