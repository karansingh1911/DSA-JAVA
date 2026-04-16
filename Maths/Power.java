
import java.util.Scanner;

public class Power {

    public static long calculatePower(long x, int n) {

        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        long temp = calculatePower(x, n / 2);

        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * x;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int n = sc.nextInt();
        System.out.println(calculatePower(x, n));

    }
}
