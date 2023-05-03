package Lesson16;

public class Methods {
    public static void eMail(String mail){
        char c1;
      for (int i=0;i<mail.length();i++) {
          c1 = mail.charAt(i);
          if (c1 == '@') {
              if (mail.substring(i + 1).equals("Yahoo.com")) {
                  System.out.println("Yahoo");
              } else if (mail.substring(i + 1).equals("Mail.ru")) {
                  System.out.println("Mail");
              } else if (mail.substring(i + 1).equals("Gmail.com")) {
                  System.out.println("Gmail");
              } else
                  System.out.println("Mail is incorect");
          }
          continue;

      }
      if (mail.contains("@"));
      else
          System.out.println("not enouth @");
    }
    public static void main(String[] args) {
        Methods.eMail("vfhvbfvh@Yahoo.com");
        Methods.eMail("vfhvbfvh@Gmail.com");
        Methods.eMail("vfhvbfvh@Mail.ru");
        Methods.eMail("dfhgthgngn");
        Methods.eMail("dfhg@thgngn");

    }
}
