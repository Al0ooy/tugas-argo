package level_1;
import java.util.Scanner;

public class countdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input N: ");
        int N = input.nextInt();
        
        for (int i = N; i>= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("Start!");

        input.close();
    }
}