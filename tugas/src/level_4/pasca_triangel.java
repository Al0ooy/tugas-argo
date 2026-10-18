package level_4;
import java.util.Scanner;
public class pasca_triangel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Jumlah Nilai N: ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int space = 0; space < N - i; space++) {
                System.out.print(" ");
            }
            
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

        scanner.close();
    }
}
