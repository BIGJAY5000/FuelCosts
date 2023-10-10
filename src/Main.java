import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //variables
        double gallons = 0;
        double efficiency = 0;
        double gasCost = 0;
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;

        do {
            System.out.println("Enter the current number of gallons of gasoline in your car");
            if (scan.hasNextDouble()) {
                gallons = scan.nextDouble();
                scan.nextLine();
                if (gallons < 0) {
                    System.out.println("You have entered an invalid value, Please try again");
                }
                if (gallons >= 0) {
                    done1 = true;
                }
            }
            else {
                System.out.println("You have entered an invalid value, Please try again");
                scan.nextLine();
            }
        } while (!done1);
        do {
            System.out.println("Please enter the fuel efficiency in MPG");
            if (scan.hasNextDouble()) {
            efficiency = scan.nextDouble();
                 scan.nextLine();
                if (efficiency < 0) {
                    System.out.println("You have entered an invalid value, Please try again");
                }
                if (efficiency > 0) {
                    done2 = true;
                }
            }
            else {
                System.out.println("You have entered an invalid value, Please try again");
                scan.nextLine();
            }
        } while (!done2);
        do {
            System.out.println("Enter the current price for 1 gallon of gas");
            if (scan.hasNextDouble()) {
                gasCost = scan.nextDouble();
                scan.nextLine();
                if (gasCost < 0) {
                    System.out.println("You have entered an invalid value, Please try again");
                }
                if (gasCost > 0) {
                    done3 = true;
                }
            }
            else {
                System.out.println("You have entered an invalid value, Please try again");
                scan.nextLine();
            }
        } while (!done3);
        System.out.printf("\n %-25s%5.2f", "Cost Per 100 miles in $:", (gasCost/efficiency) * 100);
        System.out.printf("\n %-25s%5.2f", "Distance Left in miles:", (gallons * efficiency));
    }
}
