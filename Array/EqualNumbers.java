import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Equal numbers in the array: ");
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
