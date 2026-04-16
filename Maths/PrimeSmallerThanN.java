
import java.util.Arrays;
import java.util.Scanner;

public class PrimeSmallerThanN { // time complexity:  nloglog(n)

    public static void findPrimeNumbersSmallerThanN(int n) {
        boolean array[] = new boolean[n + 1];
        Arrays.fill(array, true);

        // just for logic and structure consistency : add-on
        array[0] = false;
        array[1] = false;

        for (int i = 2; i <= n / i; i += 1) {
            if (array[i]) {
                for (int j = i * i; j <= n; j += i) { // j=i*i is better than 2i logic
                    array[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (array[i]) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findPrimeNumbersSmallerThanN(n);

    }
}
