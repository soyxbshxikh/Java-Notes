// Final keyword is used to make a variable constant and private
final class Main{
  void display()
  {
    System.out.println("Hello World");
  }
}  
public class Final3 extends Main {
  public static void main(String[] args) {
    Final3 obj = new Final3();
    obj.display();

    
  }
}
