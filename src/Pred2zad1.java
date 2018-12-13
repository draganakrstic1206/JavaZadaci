import java.util.Scanner;
public class Pred2zad1 {




    public static void main(String[] args) {

        int a,b;
        int min,max;

        Scanner scan = new Scanner(System.in);

        System.out.println("unesite dva broja: ");

        a =scan.nextInt();
        b =scan.nextInt();

        scan.close();

        min=a;
        max=b;

        if(a>b)
        {
            min=b;
            max=a;
        }else {
            min=a;
            max=b;

        }
        int iterator =min;

        while( iterator <= max ) {
            int rezultat = iterator % 2;
            if(rezultat == 0) {
                System.out.println("broj je paran: " + iterator);
            }
            iterator++;
        }
    }

}