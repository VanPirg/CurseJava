package Lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;
    double popolnSheta(double plus) {
            balance += plus;
            System.out.println(balance);
            return balance;
    }
    double minusSheta(double minus){
            balance -= minus;
            System.out.println(balance);
            return balance;
    }

}
  class BankAccountTest{
   public static void main(String[] args) {


      BankAccount MyAccount = new BankAccount();
      BankAccount YourAccount = new BankAccount();
      BankAccount HisAccount = new BankAccount();

      MyAccount.id = 1;
      MyAccount.name = "Zaur";
      MyAccount.balance = 200.4;

      YourAccount.id = 2;
      YourAccount.name = "Danik";
      YourAccount.balance = 567.9;

      HisAccount.id = 3;
      HisAccount.name = "Nikol";
      HisAccount.balance = 598.3;

    System.out.println(MyAccount.balance);
    MyAccount.balance = MyAccount.popolnSheta(400);
    MyAccount.balance = MyAccount.minusSheta(567);



   }
}
