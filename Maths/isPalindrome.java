
import java.util.Scanner;

public class isPalindrome {

    public static boolean isPali(int n) {
        int temp = n, reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return (reverse == n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPali(n));

    }
}
