import java.util.Scanner;

public class BonusKaryawan09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data karyawan
        System.out.print("Masukkan nilai kinerja (1-100): ");
        double kinerja = sc.nextDouble();

        System.out.print("Masukkan lama bekerja (tahun): ");
        double lama = sc.nextDouble();

        System.out.print("Masukkan gaji pokok (Rp): ");
        double gajiPokok = sc.nextDouble();

        System.out.print("Apakah memiliki sertifikasi profesional? (ya/tidak): ");
        String sertifikasi = sc.next();

        double bonus = 0;

        // perhitungan bonus
        if (kinerja < 70) {
            System.out.println("Karyawan tidak mendapatkan bonus karena nilai kinerja di bawah 70.");
        } else {       
        // Kinerja untuk 70 ke atas
        if (kinerja >= 90) {
            // Bonus tinggi untuk kinerja >= 90
            if (lama < 2) {
                bonus = 0.02 * gajiPokok;
            } else if (lama < 5) {
                bonus = 0.04 * gajiPokok;
            } else {
                bonus = 0.07 * gajiPokok;
            }
            } else {
                // Bonus normal untuk kinerja 70 - 89
            if (lama < 2) {
                bonus = 0.01 * gajiPokok;
            } else if (lama < 5) {
                bonus = 0.03 * gajiPokok;
            } else {
                bonus = 0.05 * gajiPokok;
            }
            }

            // Tambahan bonus sertifikasi
            if (sertifikasi.equalsIgnoreCase("ya")) {
                bonus += 500000;
            }

            // Tampilkan hasil akhir
            System.out.println("Total bonus yang diterima: Rp " + bonus);
        }

    }
}
