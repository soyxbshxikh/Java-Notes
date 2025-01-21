// 5 Prime Numbers in array
public class Assignment3 {
    public static void main(String[] args) {
        int[] PrimeNumbers = new int[5];
        int c = 0;
        int n = 2;

        while (c < 5) {
            boolean Prime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if ((n % i) == 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime) {
                PrimeNumbers[c] = n;
                c++;
            }
            n++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(PrimeNumbers[i]);
        }
    }
}
