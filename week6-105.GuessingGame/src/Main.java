
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // test your program here
        //GuessingGame game = new GuessingGame();
        //game.play(1, 4);
        // System.out.println(game.isGreaterThan(32));
        // System.out.println(game.average(3, 4));
        // System.out.println(game.average(6, 12));
        Scanner lukija = new Scanner(System.in);
        System.out.print("Kirjoita jokin sana: ");
        String sana = lukija.nextLine();
        printStars(sana.length());

    }

    public static void printStars(int times) {
        for (int i = 0; i < times; i++) {
            if (times % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print("+");
            }
        }
        System.out.println("");
    }
}
