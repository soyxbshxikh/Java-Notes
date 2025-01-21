// Food Billing
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Food Cost");
        int a = sc.nextInt();
        System.out.println("Food Quantity");
        int b = sc.nextInt();
        System.out.println("Your Food Cost Is  = " + a);
        System.out.println("Your Food Quantity Is = " + b);
        int c = a * b;
        System.out.println("Your Total Gross = " + c);
        System.out.println("Food Total Gst = " + ((c / 100) * 6));
        int x = c;
        int y = ((c / 100) * 6);
        System.out.println("Your Total Amount = " + (x + y));
        sc.close();
    }

}
