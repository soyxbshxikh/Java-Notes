// Final keyword is used to make a method constant
class Main{
  final void display()
  {
    System.out.println("I am in class B");
  }
}
public class Final2 extends Main {
  // void display()
  // {
  //   System.out.println("I am in class A");
  // }
  public static void main(String[] args) {
    Final2 f = new Final2();
    f.display();

  }
  
}
