// Palindrome and Not Palindrome Number
import java.util.Scanner;

public class Assignment5 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number: ");
      String reverse = "";
      String num = sc.nextLine();
      int length = num.length();
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + num.charAt(i);
      if (num.equals(reverse))

         System.out.println("It's palindrome number");
      else
         System.out.println("it's not palindrome number");
      sc.close();
   }
}
