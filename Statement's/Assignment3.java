// Login Form no:- 1
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String user = sc.nextLine();
        System.out.print("Enter your password: ");
        String pass = sc.nextLine();

        if (!"soyab".equals(user) && !"shaikh".equals(pass)) {

            System.out.println("You entered a invalid username and password");

        } else if (!"soyab".equals(user)) {
            System.out.println("You entered a invalid username");
        } else if (!"shaikh".equals(pass)) {
            System.out.println("You entered a invalid password");
        }

        else {
            System.out.println("Login Successfully");
        }
        sc.close();
    }
}
