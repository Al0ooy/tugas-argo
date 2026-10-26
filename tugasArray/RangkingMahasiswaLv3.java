public class RangkingMahasiswaLv3 {
    public static void main(String[] args) {
        int[] nilai = {78, 90, 65, 90, 85, 72, 95, 85};
        int n = nilai.length;

        // 1. Mengurutkan nilai dari tertinggi dari tertinggi ke terendah
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nilai[j] < nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.println("=== SISTEM RANGKING MAHASISWA ===");

        System.out.println("Urutan nilai: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();

        // 2. Menampilkan tiga nilai tertinggi yang berbeda
        System.out.println("\nTiga nilai tertinggi yang berbeda:");

        int jumlahUnik = 0;
        int nilaiSebelumnya = -1;

        for (int i = 0; i < n && jumlahUnik < 3; i++ ) {
            if (nilai[i] != nilaiSebelumnya) {
                System.out.println((jumlahUnik + 1) + ". " + nilai[i]);
                nilaiSebelumnya = nilai[i];
                jumlahUnik++;
            }
        }

        // 3. Menentukan peringkat setiap mahasiswa
        System.out.println("\nPeringkat setiap mahasiswa:");

        int peringkat = 1;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nilai[i] != nilai[i - 1]) {
                peringkat = i + 1;
            }

            System.out.println(
                "Nilai " + nilai[i] + " = Peringkat " + peringkat 
            );
        }
    }
}
