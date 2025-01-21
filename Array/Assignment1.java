// Add a Five Numbers
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Output");
        for (int i = 0; i < 5; i++) {
            sum = sum + a[i];
        }
        sc.close();
        System.out.println("Sum :"+sum);
    }

}
