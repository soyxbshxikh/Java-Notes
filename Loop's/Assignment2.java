// Sum of Digits
import java.util.Scanner;

class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = input.nextLong();

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        System.out.println("The sum of the digits is " + sum);
        input.close();
    }
}
