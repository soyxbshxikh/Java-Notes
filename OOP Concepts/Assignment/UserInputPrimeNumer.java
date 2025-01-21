// Enter 5 Number and Check Prime Number 
package Assignment;
import java.util.Scanner;

class PrimeChecker {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class UserInputPrimeNumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter Five Numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Prime Numbers Are:");
        for (int i = 0; i < 5; i++) {
            if (PrimeChecker.isPrime(numbers[i])) {
                System.out.println(numbers[i]);
            }
        }
        sc.close();
    }
}
