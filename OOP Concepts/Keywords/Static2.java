// Static method can be accessed without creating an object of a class.
class Main
{
  static int a = 10;
  static void display()
  {
    System.out.println("I am in class B");
  }
}
public class Static2 extends Main {
  public static void main(String[] args) {
    Main.display();
    System.out.println(Main.a);
  }
}
