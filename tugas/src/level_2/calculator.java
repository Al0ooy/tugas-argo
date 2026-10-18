package level_2;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input N: ");
        int n = scanner.nextInt();

        long factorial = 1;
        scanner.close();
        for (int i = 1; i<= n; i++) {
            factorial *= i;
        }

        System.out.println("output: " + n + "! = " + factorial);
    }
}
