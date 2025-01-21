// Multi of 2 numbers
package Assignment;
import java.util.Scanner;

class AA {
    public int a, b;

    public void getdata(int x, int y) {
        a = x;
        b = y;
    }
}

class BB extends AA {
    public void show() {
        System.out.println("Result is " + (a * b));
    }
}

public class UserInputMultiTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First No: ");
        int x = sc.nextInt();
        System.out.println("Enter Second No: ");
        int y = sc.nextInt();

        BB b = new BB();
        b.getdata(x, y);
        b.show();
        sc.close();
    }
}