import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        int a,b;
        Scanner unos = new Scanner(System.in);
        unos.close();

        System.out.println("Unesite dva broja: ");

        a=unos.nextInt();
        b=unos.nextInt();

        System.out.println("s-sabiranje");
        System.out.println("o-oduzimaje");
        System.out.println("m-mnozenje");
        System.out.println("d-deljene");

        char operacija = unos.next().charAt(0);

        switch(operacija){

            case 's':
                int zbir= a+b;
                System.out.println("Izabrali ste operaciju s,vas rezultat je: "+zbir);
                break;
            case 'o':
                int razlika=a-b;
                System.out.println("Izabrali ste operaciju o,vas rezultat je: "+razlika);
                break;
            case 'm':
                int proizvod=a*b;
                System.out.println("Izabrali ste operaciju m, vas rezultat je: "+proizvod);
                break;
            case 'd':
                int kolicnik=a/b;
                System.out.println("Izabrali ste operaciju d, vas rezultat je: "+kolicnik);
                break;

            default: System.out.println("Pogresan unos!");

        }
    }
}
