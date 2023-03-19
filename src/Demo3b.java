import java.util.Scanner;

public class Demo3b {
    private String name;
    private static Scanner scan = new Scanner(System.in);
    private int yob;

    public Demo3b() {
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("When were you born ");
        yob = scan.nextInt();

    }

    public void getAge() {
        int cYr;
        System.out.println("Enter Current Year: ");
        cYr = Demo3b.scan.nextInt();
        System.out.println(name + " You are " + (cYr-yob) + " Years old");
    }
    public String getName() {return name;}

    public static void main(String[] args) {
        Demo3b demo = new Demo3b();
        demo.getAge();
        System.out.println("Goodbye " + demo.getName());
    }
}

//Class variables:
/*
    always associated with access modifiers
    data should be private/protected ie limit accessibility to members of a particular class
 */


