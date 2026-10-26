public class RataRataLv4 {
    public static void main(String[] args) {
        int[] scores = {90, 70, 90, 60};
        int total = 0;

        //Menghitung total nilai
        for(int i = 0; i<scores.length; i++) {
            total += scores[i];
        }

        //Menghitung double agar hasil desimal tidak terpotong
        double average = (double) total/scores.length;

        System.out.println("Rata-rata: " + average);
    }
}
