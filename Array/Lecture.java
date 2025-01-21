// Number of Length
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        // int a[]={1,2,3,4,5};
        // System.out.println(a[2]);

        // int a[]={1,2,3,4,5,6,7,8,9,10};
        // for (int i = 0; i < a.length; i++) {
        // System.out.println(a[i]);
        // }

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Output");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);

        }
        sc.close();
    }

}