
import java.util.Scanner;

public class PrimeFactors {

    public static void printAllPrimeFactors(int n) {
        if (n == 0 || n == 1) {
            System.out.println("No prime factors");
        }

        while (n % 2 == 0) {
            System.out.println(2);
            n = n / 2;
        }

        while (n % 3 == 0) {
            System.out.println(3);
            n = n / 3;
        }
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                System.out.println(i + 2);
                n = n / (i + 2);
            }
        }
        if (n > 3) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAllPrimeFactors(n);

    }
}
