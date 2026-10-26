import java.util.Arrays;

public class MemprediksiOutputDanMenemukanBugLv4 {
    public static void main(String[] args) {
        int[] data =  {1, 2, 3, 4, 5};
        int [] hasil = new int [data.length];

        // Menghitung berdasarkan nilai awal array
        for (int i = 0; i < data.length; i++) {
            hasil[i] = data[i] + data [data.length -1 -i];
        }

        System.out.println(Arrays.toString(hasil));
    }
}