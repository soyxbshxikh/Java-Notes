// Positive Even Number and Negative Odd Number 
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0 && num % 2 == 0) {
            System.out.println("Three succeeding even numbers are: " + (num + 2) + ", " + (num + 4) + ", " + (num + 6));
        } else if (num < 0 && num % 2 != 0) {
            System.out.println("Three preceding odd numbers are: " + (num - 2) + ", " + (num - 4) + ", " + (num - 6));
        } else {
            System.out.println("Number is neither a positive even nor a negative odd.");
        }
        sc.close();
    }
}
