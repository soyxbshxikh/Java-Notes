// Static variable can be accessed without creating object of class.
class Main{
  static int a = 10;
  void display()
  {
    System.out.println("I am in class B");
  }
}

public class Static1 extends Main {
  public static void main(String[] args) {
    Main b=new Main();
    b.display();
    System.out.println(Main.a);
  }
}
