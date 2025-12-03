// Nama : Felia Dwi Rahmawati
// NIM : 254107060016
// Kelas : SIB 1A
import java.util.Scanner;
public class Soal309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] penjualan = new int[7][4]; 

        // input data penjualan ---
        System.out.println("=== Input Data Penjualan ===");
        for (int hari = 0; hari < 7; hari++) {
            System.out.println("Hari ke-" + (hari + 1) + ": ");
            for (int produk = 0; produk < 4; produk++) {
                System.out.print("  Produk " + (char)('A' + produk) + ": ");
                penjualan[hari][produk] = sc.nextInt();
            }
        }

        int pilihan;

        // untuk menu berulang 
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Total penjualan per produk");
            System.out.println("2. Total penjualan per hari");
            System.out.println("3. Produk dengan penjualan tertinggi");
            System.out.println("4. Hari dengan total penjualan tertinggi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {

                // untuk total penjualan per produk
                case 1:
                    System.out.println("\nTotal Penjualan per Produk:");
                    for (int p = 0; p <=3; p++) { // p= produk
                        int total = 0;
                        for (int h = 0; h <=6; h++) { // h= hari
                            total += penjualan[h][p];
                        }
                        System.out.println("Produk " + (char)('A' + p) + ": " + total);//char digunakan untuk mengubah angka indeks produk menjadi huruf produk
                    }
                    break;
                
                // total penjualan per hari
                case 2:
                    System.out.println("\nTotal Penjualan per Hari:");
                    for (int h = 0; h <=6; h++) {
                        int total = 0;
                        for (int p = 0; p <=3; p++) {
                            total += penjualan[h][p];
                        }
                        System.out.println("Hari ke-" + (h + 1) + ": " + total);
                    }
                    break;

                // total penjualan tertinggi
                case 3:
                    System.out.println("\nProduk dengan Penjualan Tertinggi:");
                    int[] totalProduk = new int[4];

                    for (int p = 0; p <=3; p++) {
                        for (int h = 0; h <=6; h++) {
                            totalProduk[p] += penjualan[h][p];
                        }
                    }

                    int penjualanMaxProduk = 0;
                    for (int p = 1; p <=3; p++) {
                        if (totalProduk[p] > totalProduk[penjualanMaxProduk]) {
                            penjualanMaxProduk = p;
                        }
                    }

                    System.out.println("Produk " + (char)('A' + penjualanMaxProduk));
                    break;

                 // menentukan hari dengan total penjualan tertinggi
                case 4:
                    System.out.println("\nHari dengan Total Penjualan Tertinggi:");
                    int[] totalHari = new int[7];

                    for (int h = 0; h < 7; h++) {
                        for (int p = 0; p < 4; p++) {
                            totalHari[h] += penjualan[h][p];
                        }
                    }

                    int penjualanMaxHari = 0;
                    for (int h = 1; h < 7; h++) {
                        if (totalHari[h] > totalHari[penjualanMaxHari]) {
                            penjualanMaxHari = h;
                        }
                    }

                    System.out.println("Hari ke-" + (penjualanMaxHari + 1));
                    break;

                case 5:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5); // untuk menampilkan menu berulangsetelah user memilih menu (1–4), program kembali lagi ke menu.
    }

}


