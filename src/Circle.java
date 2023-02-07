import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();

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
                    circle = new Circle();
                    System.out.println("A default circle with radius 1.0 has been created.");
                    break;
                case 2:
                    System.out.print("Enter the radius: ");
                    double radius = sc.nextDouble();
                    circle = new Circle(radius);
                    System.out.println("A circle with radius " + radius + " has been created.");
                    break;
                case 3:
                    System.out.println("The area of the circle is " + circle.getArea());
                    break;
                case 4:
                    System.out.print("Enter the new radius: ");
                    radius = sc.nextDouble();
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
