
import java.util.Scanner;

public class AllDivisors {

    public static void printAllDivisors(int n) {
        int i;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }

        }
        for (int j = (i - 1); j >= 1; j--) {
            if (n % j == 0) {
                if (j != n / j) {
                    System.out.println(n / j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAllDivisors(n);

    }
}
