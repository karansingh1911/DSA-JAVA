
import java.util.Scanner;

public class TrailingZeros {

    public static int TrailingZerosInFactorial(int n) {
        int count = 0;
        for (int i = 5; i <= n; i = i * 5) {
            count = count + (n / i);
        }
        return count;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(TrailingZerosInFactorial(n));
    }

}
