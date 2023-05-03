package Lesson4;

public class Student {
    Student(int id1,String name1,String surname1,int studyYear1,double everegeMatem1,double everegeEconom1,double everegeForenL1){
        id=id1;
        name=name1;
        surname=surname1;
        studyYear=studyYear1;
        everegeMatem=everegeMatem1;
        everegeEconom=everegeEconom1;
        everegeForenL=everegeForenL1;
    }
    int id;
    String name;
    String surname;
    int studyYear;
    double everegeMatem;
    double everegeEconom;
    double everegeForenL;
}
class StudentTest{
    double ever(Student st){
        double result = (st.everegeMatem+st.everegeEconom+st.everegeForenL)/3;
        System.out.println(st.name+" "+st.surname+" "+" Srednya ocenka "+result);
        return result;
    }
    public static  void main(String[] args) {
        Student stud1 = new Student(1, "Yulia", "Kovlev", 4, 78, 90, 83);
        Student stud2 = new Student(2, "Nikol", "Pirogov", 3, 82, 75, 92);
        Student stud3 = new Student(3, "Daniel", "Pirogov", 2, 98, 89, 77);
        StudentTest stest = new StudentTest();
        stest.ever(stud1);
        stest.ever(stud2);
        stest.ever(stud3);
    }
}

