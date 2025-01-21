// Even or Odd Number 
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("It's Even number");
        } else {
            System.out.println("It's Odd number");
        }
        sc.close();
    }

}
