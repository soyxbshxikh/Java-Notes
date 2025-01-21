// Login Form no:- 2
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String pass = sc.nextLine();

        if (!user.equals("soyab") && !pass.equals("shaikh")) {
            System.out.println("UserName and Password are incorrect");
        } else {
            if (user.equals("soyab")) {
                if (pass.equals("shaikh")) {
                    System.out.println("Login Successful");
                } else {
                    System.out.println("password incorrect");
                }
            } else {
                System.out.println("Username is incorrect");
            }
        }
        sc.close();
    }

}
