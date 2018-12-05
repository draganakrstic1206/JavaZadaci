import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite ceo broj: ");
        int broj = unos.nextInt();
        unos.close();

        Random random = new Random();
        int nasumican = random.nextInt(50)+1;

        int razlika = broj-nasumican;

        if(razlika==0) {

            System.out.println("Neverovatno! Pogodili ste tacan broj!");
        }
        else if (razlika<=5){

            System.out.println("Dobar Pokusaj! Bili ste jako blizu!");
        }
        else {
            System.out.println("Vise srece sledeci put!");
        }

        System.out.println("Random/trazeni broj je: " + nasumican);

    }
}
