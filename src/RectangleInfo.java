import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double width;
        double height;

        do {
            System.out.print("Enter width: ");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input.");
                input.next();
            }
            width = input.nextDouble();
        } while (width <= 0);

        do {
            System.out.print("Enter height: ");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input.");
                input.next();
            }
            height = input.nextDouble();
        } while (height <= 0);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}
