// Nama : Felia Dwi Rahmawati
// NIM : 254107060016
// Kelas : SIB 1A
import java.util.Scanner;
public class Soal109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

         // untuk menyimpan nilai
        int[] nilai = new int[n];

        //  menginput nilai mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        // menghitung rata-rata, jumlah lulus dan tidak lulus
        int total = 0;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < n; i++) {
            total += nilai[i];

            if (nilai[i] >= 60) { // input nilai >=60
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        double rataRata = total / n;

        // menampilkan hasil
        System.out.println("\n=== Hasil ===");
        
        System.out.println("Seluruh nilai mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nRata-rata nilai: " + rataRata);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

        
    }
    
}
