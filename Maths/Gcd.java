
import java.util.Scanner;

public class Gcd {

    // public static int gcd(int a, int b) { // time complexity: O(max(a,b))
    //     while (a != b) {
    //         if (b > a) {
    //             b = b - a;
    //         } else {
    //             a = a - b;
    //         }
    //     }
    //     return a;
    // }
    public static int gcd(int a, int b) { // time complexity: O(min(a,b))
        //NOTE: gcd(a,b)= gcd(b,a%b)
        if (b != 0) {
            return gcd(b, b % a);
        } else {
            return a;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));

    }
}
