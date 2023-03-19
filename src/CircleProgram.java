import java.util.Scanner;

public class CircleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle01 circle = new Circle01();

        while (true) {
            System.out.println("--- Circle Program ---");
            System.out.println("1. Create a default circle");
            System.out.println("2. Create a user-defined circle");
            System.out.println("3. View the area of the circle");
            System.out.println("4. Reset the radius of the circle");
            System.out.println("5. View the radius of the circle");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    circle = new Circle01();
                    int radius = 0;
                    System.out.println("A default circle with radius " + radius + " has been created.");
                    break;
                case 2:
                    System.out.print("Enter the radius: ");
                    radius = sc.nextInt();
                    circle = new Circle01(radius);
                    System.out.println("A circle with radius " + radius + " has been created.");
                    break;
                case 3:
                    System.out.println("The area of the circle is " + circle.getArea());
                    break;
                case 4:
                    System.out.print("Enter the new radius: ");
                    radius = sc.nextInt();
                    circle.setRadius(radius);
                    System.out.println("The radius of the circle has been reset to " + radius + ".");
                    break;
                case 5:
                    System.out.println("The radius of the circle is " + circle.getRadius());
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }
        }
    }
}
