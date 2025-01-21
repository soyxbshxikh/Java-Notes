// 3 Out Of 1 or 2 Greater Number or all are Equal Numbers
import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is greater than b and c");
        } else if (b > a && b > c) {
            System.out.println("b is greater than a and c");
        } else if (c > a && c > b) {
            System.out.println("c is greater than a and b");
        } else if (a > c && b > c) {
            System.out.println("a and b is greater than c");
        } else if (b > a && c > a) {
            System.out.println("b and c is greater than a");
        } else if (a > b && c > b) {
            System.out.println("a and c is greater than b");
        } else {
            System.out.println("all a,b,c are equal");
        }
        sc.close();
    }

}
