package level_1;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan N: ");
        int N = input.nextInt();

        int total = 0;

        for (int i = 1; i<= N; i++) {
            total = total + i;
        }
        System.out.println("Sum = " + total);
        input.close();
    }
}
