// Fibonacci Series 100 Number
class Assignment6 {
  public static void main(String[] args) {

    int n = 100, first = 0, second = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(first + ", ");

      int next = first + second;
      first = second;
      second = next;
    }
  }
}
