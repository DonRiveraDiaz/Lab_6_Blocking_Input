import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        boolean done = false;
        String trash;

        // Input: gallons
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!done);
        done = false;

        // Input: MPG
        do {
            System.out.print("Enter the fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!done);
        done = false;

        // Input: Price per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!done);

        // Calculations
        double costPer100Miles = (100 / mpg) * pricePerGallon;
        double distance = gallons * mpg;

        // Output
        System.out.println("Cost to drive 100 miles: $" + costPer100Miles);
        System.out.println("Distance car can go with a full tank: " + distance + " miles");

        in.close();
    }
}