package Lesson22;

public class Student {
    StringBuilder name;

    public StringBuilder getName() {
        StringBuilder sB = new StringBuilder(name);
        return sB;
    }

    public void setName(StringBuilder name) {
        if (name.length()>3) {
            this.name = name;
        }
        else {
            System.out.println("Short Name!!!");
        }
    }

    int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course>0 && course<5){
        this.course = course;
        }
        else{
            System.out.println("Incorect Course");
        }
    }

    int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade>0 && grade<11) {
            this.grade = grade;
        }
        else{
            System.out.println("Grade Incorect");
        }
    }
    void showInfo(){
        System.out.println(getName());
        System.out.println(getCourse());
        System.out.println(getGrade());
    }
}
class testStudent{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName(new StringBuilder("Danik"));
        s.setCourse(3);
        s.setGrade(11);
        s.showInfo();
    }
}