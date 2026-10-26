public class PersediaanBarangLv1 {
    public static void main(String[] args) {
        int[] stock = {12, 8, 15, 6};

        // Tampilkan stok produk pertama dan terakhir
        System.out.println("Stock pertama: " + stock[0]);
        System.out.println("stock terakhir: " + stock[stock.length - 1]);

        // Ubah stok produk kedua menjadi 10
        stock[1] = 10;

        // Tampilkan seluruh stok setelah perubahan 
        System.out.print("Stok setelah perubahan: ");
        for (int s : stock) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Analisis stock[4] dijelaskan di bawah ini
    }
}
