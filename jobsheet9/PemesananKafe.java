import java.util.Scanner;

public class PemesananKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = Integer.parseInt(sc.nextLine()); 

        String[] namaPesanan = new String[jumlah];
        double[] hargaPesanan = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = Double.parseDouble(sc.nextLine());
        }

        double total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += hargaPesanan[i];
        }

        System.out.println("\n=== Daftar Pesanan Kafe ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d. %s - Rp %.2f%n", (i + 1), namaPesanan[i], hargaPesanan[i]);
        }

        System.out.printf("\nTotal biaya yang harus dibayar: Rp %.2f%n", total);

    }
}
