// Enter Two Number and Choose Operator (+,-,*,/) 
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First No: ");
        int a = sc.nextInt();
        System.out.println("Enter Second No: ");
        int b = sc.nextInt();
        System.out.println("Enter Your Operator: ");
        String btn = sc.next();
        switch (btn) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            default:
                System.out.println("Enter valid input");
                break;
        }
        sc.close();

    }

}
