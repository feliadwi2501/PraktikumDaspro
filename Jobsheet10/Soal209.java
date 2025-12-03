// Nama : Felia Dwi Rahmawati
// NIM : 254107060016
// Kelas : SIB 1A
import java.util.Scanner;
public class Soal209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input jumlah kota dan jumlah hari
        System.out.print("Masukkan jumlah kota: ");
        int k = sc.nextInt();

        System.out.print("Masukkan jumlah hari: ");
        int h = sc.nextInt();

        // deklarasi array 2D
        double[][] suhu = new double[k][h];

        // input data suhu per kota per hari
        System.out.println("\n--- Input Data Suhu ---");
        for (int i = 0; i < k; i++) {
            System.out.println("Kota " + (i + 1) + ":");
            for (int j = 0; j < h; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                suhu[i][j] = sc.nextDouble();
            }
        }

        double[] rataKota = new double[k]; // menyimpan rata-rata settiap kota

        System.out.println("\n=== HASIL PER KOTA ===");
        
        // untuk menghitung max, min, dan rata-rata per kota dengan menggunakan loop bersarang
        for (int i = 0; i < k; i++) {
            double max = suhu[i][0];  // kota
            double min = suhu[i][0];
            double total = 0;

            for (int j = 0; j < h; j++) {
                double nilai = suhu[i][j]; // hari
                total += nilai;

                if (nilai > max) max = nilai;
                if (nilai < min) min = nilai;
            }

            double rata = total / h;
            rataKota[i] = rata;

            System.out.println("\nKota " + (i + 1) + ":");
            System.out.println("  Suhu maksimum : " + max);
            System.out.println("  Suhu minimum  : " + min);
            System.out.println("  Rata-rata     : " + rata);
        }

        // menentukan kota dengan rata-rata suhu tertinggi dan terendah
        int suhuMax = 0, suhuMin = 0;
        for (int i = 1; i < k; i++) {
            if (rataKota[i] > rataKota[suhuMax]) suhuMax = i;
            if (rataKota[i] < rataKota[suhuMin]) suhuMin = i;
        }

        System.out.println("\n=== PERBANDINGAN ANTAR KOTA ===");
        System.out.println("Kota dengan rata-rata suhu tertinggi : Kota " + (suhuMax + 1));
        System.out.println("Kota dengan rata-rata suhu terendah  : Kota " + (suhuMin + 1));

    }

}
