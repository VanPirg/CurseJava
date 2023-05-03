package Lesson3;

public class Shirut {
    int cenaPereezda;
    int kvartA;
    int razn;
    int raznica(int cenaPereezda,int kvartA,int kvartB) {
        this.cenaPereezda = cenaPereezda;
        this.kvartA = kvartA;

        if (kvartA > kvartB) {
            razn = kvartA - kvartB;
            razn = razn * 12;
            System.out.println("переезд стоит : " + cenaPereezda);
            System.out.println("разница между квартирами : " + razn);
        } else
            System.out.println("новая квартира дороже чем старая");
        if (razn <= cenaPereezda) {
            System.out.println("Не выгодно переежать");
        } else
            System.out.println("выгодно переежать");
        return razn;
    }

    public static void main(String[] args) {
        Shirut sh= new Shirut();
        sh.raznica(3000,4100,3800);
    }
}