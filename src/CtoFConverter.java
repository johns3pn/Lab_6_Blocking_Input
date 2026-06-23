import java.util.Scanner;

public class CtoFConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius;
        boolean valid;

        do {
            System.out.print("Enter temperature in Celsius: ");

            if (input.hasNextDouble()) {
                celsius = input.nextDouble();

                double fahrenheit = (celsius * 9.0 / 5.0) + 32;

                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
                valid = false;
            }

        } while (!valid);

        input.close();
    }
}
