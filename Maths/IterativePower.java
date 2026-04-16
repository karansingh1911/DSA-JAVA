
import java.util.Scanner;

public class IterativePower {

    public static long findPower(long x, int n) {
        long result = 1;
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        while (n > 0) {
            if (n % 2 == 1) { //  set bit found = 
                result = result * x;
            }
            n = n / 2;
            x = x * x;

        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int n = sc.nextInt();
        System.out.println(findPower(x, n));

    }
}
// logic to understand:
// If the current bit is 1 → multiply into result
// Always: move to next bit (n /= 2)
// Always: move to next power (x *= x)
