package level_4;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner imputan = new Scanner(System.in);
        System.err.print("imputan nilai N: ");
        int N = imputan.nextInt();
        System.out.print("output: ");
        imputan.close();
        for (int i=2; i<=N; i++) {
            Boolean isPrime = true;
            for (int c=2; c * c <=i; c++) {
                if (1 % c == 0) {
                    isPrime = false;
                    break;
                }
            }
        if (isPrime) {
            System.out.println(i+" ");

        }
        
        }
        System.out.println();
    }
}
