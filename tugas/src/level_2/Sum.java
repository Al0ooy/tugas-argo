package level_2;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: N = ");
        int n = scanner.nextInt();

        int sum = 0;
        scanner.close();
        for (int i = 1; i <= n ; i++) {
            if (i % 2 == 0) {
                sum += i;
        }
    }
    System.out.println("Output: Sum of even numbers = " + sum);
  }
}