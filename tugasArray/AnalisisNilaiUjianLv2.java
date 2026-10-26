public class AnalisisNilaiUjianLv2 {
    public static void main(String[] args) {
        int[] nilai = {75, 80, 65, 90, 55, 85, 70, 95};

        // Hitung rata-rata nilai
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        double rataRata = (double) total / nilai.length;
        System.out.println("Rata-rata nilai: " + rataRata);

        // Tampilkan nilai yang lebih besar dari rata-rata
        System.out.print("Nilai di atas rata-rata: ");
        for (int n : nilai) {
            if (n > rataRata) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        // Hitung jumlah mahasiswa yang lulus dengan nilai minimal 70
        int lulus = 0;
        for (int n : nilai) {
            if (n >= 70) {
                lulus++;
            }
        }
        System.out.println("Jumlah mahasiswalullus: " + lulus);

        // Tampilkan persentase mahasiswa yang lulus
        double persentaseLulus = ((double) lulus / nilai.length) * 100;
        System.out.println("Persentase kelulusan: " + persentaseLulus + "%");
    }
}
