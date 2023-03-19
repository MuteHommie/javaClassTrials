import java.util.Scanner;

public class Demo3 {
    public  void sum(int x, int y)
    {
        int result = x + y;
        System.out.println("The sum of  "+ x + " and " + y + " is " + result);
}
    public static void product(){
//        int a, b, c;
        Scanner aa = new Scanner(System.in);
        int a = aa.nextInt();
        Scanner bb = new Scanner(System.in);
        int b = bb.nextInt();
        Scanner cc = new Scanner(System.in);
        int c = cc.nextInt();

        int result = a*b*c;

        System.out.println("Product: " + a + " * " + b + " * " + c + " = " + result);
    }
    public static void main(String[] args) {
        //Lets talk scope.
//        scope is the space within whiich a variable is accessible
//        life span =>  duration from the time a variable is created(allocated memory to when it ceases to exist.
        Scanner trial = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int value1 = trial.nextInt();
        System.out.println("Enter a second value: ");
        int value2 = trial.nextInt();
        Demo3 demo = new Demo3();
        demo.sum(value1, value2);

        // sum(5, 6); method invocation or call.- parameterized method.
//        product();
    }
}


