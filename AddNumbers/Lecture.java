// Add Two Numbers
import java.util.Scanner;

public class Lecture {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a;
        // a=20;
        // int b=20;
        System.out.println("Enter Value of a");
        int a = sc.nextInt();
        System.out.println("Enter Value of b");
        int b = sc.nextInt();
        // int c=a+b;
        System.out.println("Addition = " + (a + b));
        sc.close();
    }
}
