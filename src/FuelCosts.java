import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double gallons;
        double mpg;
        double price;

        do {
            System.out.print("Gallons in tank: ");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input.");
                input.next();
            }
            gallons = input.nextDouble();
        } while (gallons <= 0);

        do {
            System.out.print("Miles per gallon: ");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input.");
                input.next();
            }
            mpg = input.nextDouble();
        } while (mpg <= 0);

        do {
            System.out.print("Price per gallon: ");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input.");
                input.next();
            }
            price = input.nextDouble();
        } while (price <= 0);

        double cost100Miles = (100 / mpg) * price;
        double distance = gallons * mpg;

        System.out.println("Cost to drive 100 miles: $" + cost100Miles);
        System.out.println("Distance on full tank: " + distance + " miles");
    }
}
