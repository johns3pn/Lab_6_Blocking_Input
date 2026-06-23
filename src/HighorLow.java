import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1;

        int guess;

        do {
            System.out.print("Guess a number between 1 and 10: ");

            while (!input.hasNextInt()) {
                System.out.println("Invalid input.");
                input.next();
            }

            guess = input.nextInt();

        } while (guess < 1 || guess > 10);

        System.out.println("Random number: " + randomNumber);

        if (guess == randomNumber) {
            System.out.println("On the money!");
        } else if (guess > randomNumber) {
            System.out.println("Too High!");
        } else {
            System.out.println("Too Low!");
        }
    }
}
