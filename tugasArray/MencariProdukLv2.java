import java.util.Scanner;

public class MencariProdukLv2 {
    public static void main(String[] args) {
        int[] kodeProduk = {101, 105, 110, 115, 120, 125};

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kode produk yang dicari: ");
        int cari = input.nextInt();

        int indeksDitemukan = -1;
        int elemenDiperiksa = 0;

        // 1 & 4. cari kode dan hitung berapa elemen yang diperiksa
        for (int i = 0; i < kodeProduk.length; i++) {
            elemenDiperiksa++;
            if (kodeProduk[i] == cari) {
                indeksDitemukan = i;
                break; //Hentikan pencarian jika sudah ketemu
            }
        }

        // 2 & 3 Tampilkan hasil pencarian 
        if (indeksDitemukan != -1) {
            System.out.println("Produk ditemukan pada indeks ke-" + indeksDitemukan);
        } else {
            System.out.println("Produk tidak tersedia.");
        }
        System.out.println("Jumlah elemen yang diperiksa: " + elemenDiperiksa);

        input.close();
    }
}
