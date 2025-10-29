package jobsheet8;

import java.util.Scanner;

public class KopiSenja09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = input.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        int totalPelanggan = 0;
        int totalItemTerjual = 0;

        // Perulangan untuk setiap cabang
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");

            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = input.nextInt();

            int totalItemCabang = 0;

            // Perulangan untuk setiap pelanggan di cabang ini
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = input.nextInt();

                totalItemCabang = totalItemCabang + item;
            }

            // Menampilkan hasil per cabang
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang + " item");

            // Penjumlahan
            totalPelanggan = totalPelanggan + jumlahPelanggan;
            totalItemTerjual = totalItemTerjual + totalItemCabang;
        }

        // Penjumlahan akhir
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItemTerjual + " item");
    }
}
