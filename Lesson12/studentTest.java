package Lesson12;
class  TestStudent{
   public static void method1(student st1,student st2){
       if(st1.name.equals(st2.name) && st1.course==st2.course && st1.grade==st2.grade)
           System.out.println("Studenti Odinakovie");

       else
           System.out.println("Studenti ne odinakovie");
   }

  public static void method2(student st1,student st2){
      if(st1.name.equals(st2.name)) {
          if (st1.grade == st2.grade) {
              if (st1.course == st2.course)
                  System.out.println("Y studentov odinakovie kursi imena i ocenki");
              else
                  System.out.println("Y studentov odinakovie imena ocenki no raznie kursi");
          }
          else if (st1.course == st2.course)
                  System.out.println("Y studentov odinakovie imena kursi no ocenki raznie");
           else
              System.out.println("Y studentov odinakovie imena raznie kursi raznie ocenki");

      }
      else if (st1.grade==st2.grade && st1.course==st2.course)
          System.out.println("Y studentov  ne odinakovie imena odinakovie ocenki odinakovie kursi");
      else if (st1.grade==st2.grade && st1.course!=st2.course)
              System.out.println("Y studentov  ne odinakovie imena odinakovie ocenki raznie kursi");
      else if (st1.grade!=st2.grade && st1.course==st2.course)
          System.out.println("Y studentov  ne odinakovie imena odinakovie kursi raznie ocenki");
      else
          System.out.println("Y studentov  ne odinakovie imena ne odinakovie kursi raznie ocenki");

  }
    public static void main(String[] args) {
        student st1 = new student("Ivan",4,9.7);
        student st2 = new student("Igor",4,9.7);
        method1(st1,st2);
        method2(st1,st2);
    }
}