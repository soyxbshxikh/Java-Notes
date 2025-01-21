// 2 No Calculator
package Assignment;
import java.util.Scanner;

class AA {
  public int a, b;
  public char operater;

  public void getdata(int x, int y, char z) {
    a = x;
    b = y;
    operater = z;
  }

  public int result = 0;

  public void checkOperator(char operator, int x, int y) {
    switch (operator) {
      case '+':
        result = x + y;
        break;
      case '-':
        result = x - y;
        break;
      case '*':
        result = x * y;
        break;
      case '/':
        result = x / y;
        break;
      default:
        System.out.println("Invalid Operator!");
    }
  }

}

class BB extends AA {

  public void show() {

    System.out.println("Result is " + result);
  }
}

public class UserInputCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter First No: ");
    int x = sc.nextInt();
    System.out.println("Enter Second No: ");
    int y = sc.nextInt();
    System.out.println("Enter operater No:(+,-,*,/) ");
    char z = sc.next().charAt(0);

    BB b = new BB();
    b.checkOperator(z, x, y);
    b.getdata(x, y, z);
    b.show();
    sc.close();
  }
}