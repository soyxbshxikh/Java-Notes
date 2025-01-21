// Login Form no:- 3
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserName");
        String user = sc.nextLine();
        System.out.println("Enter password");
        String pass = sc.nextLine();

        if (user.equals("soyab") && pass.equals("shaikh")) {
            System.out.println("Login successFul");
        } else {
            System.out.println("Login Failed");
        }
        sc.close();

    }
}
