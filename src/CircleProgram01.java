import java.util.Scanner;

public class CircleProgram01 {
    private static Scanner sc = new Scanner(System.in);
    private static Circle01 circle = new Circle01();

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 6) {
            displayMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> createDefaultCircle();
                case 2 -> createUserDefinedCircle();
                case 3 -> viewAreaOfCircle();
                case 4 -> resetRadiusOfCircle();
                case 5 -> viewRadiusOfCircle();
                case 6 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("--- Circle Program ---");
        System.out.println("1. Create a default circle");
        System.out.println("2. Create a user-defined circle");
        System.out.println("3. View the area of the circle");
        System.out.println("4. Reset the radius of the circle");
        System.out.println("5. View the radius of the circle");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void createDefaultCircle() {
        circle = new Circle01(14);
        System.out.println("A default circle with radius 14.0 has been created.");
    }

    private static void createUserDefinedCircle() {
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        circle = new Circle01(radius);
        System.out.println("A circle with radius " + radius + " has been created.");
    }

    private static void viewAreaOfCircle() {
        System.out.println("The area of the circle is " + circle.getArea());
    }

    private static void resetRadiusOfCircle() {
        System.out.print("Enter the new radius: ");
        double radius = sc.nextDouble();
        circle.setRadius(radius);
        System.out.println("The radius of the circle has been reset to " + radius + ".");
    }

    private static void viewRadiusOfCircle() {
        System.out.println("The radius of the circle is " + circle.getRadius());
    }
}
