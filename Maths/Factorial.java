
import java.util.Scanner;

public class Factorial {

    // recursion: time - O(1) and space complexity - O(n)
    // public static int factorial(int n) {
    //     int fact = 0;
    //     if (n == 0 || n == 1) {
    //         return fact = 1;
    //     }
    //     fact = n * factorial(n - 1);
    //     return fact;
    // }
    // iterative method: time - O(n) and space complexity - O(1)
    public static int factorial(int n) { // iteration
        int fact = 1;
        if (n == 0 || n == 1) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));

    }
}
