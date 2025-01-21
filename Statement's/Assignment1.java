// Enter a Marks and Find Division / Fail
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter a Marks:");
        Scanner obj = new Scanner(System.in);
        marks = obj.nextInt();
        if (marks >= 60 && marks <= 100) {
            System.out.print("first division");
        } else if (marks >= 45 && marks <= 60) {
            System.out.print("second division");
        } else if (marks >= 33 && marks <= 45) {
            System.out.print("third division");
        } else {
            System.out.print("fail");
        }
        obj.close();
    }

}
