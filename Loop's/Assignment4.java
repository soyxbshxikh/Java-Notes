// Addition of Odd Number and Even Number
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        int b = 0;
        int even = 0;
        int odd = 1;
        sc.close();
        for (; a > 0; a = (a / 10)) {
            b = a % 10;
            if (b % 2 == 0) {
                even = even + b;
            } else {
                odd = odd * b;
            }
        }

        System.out.println("Addition of even numbers is: " + even);
        System.out.println("Multiplication of odd numbers: " + odd);

    }
}
