import java.util.Scanner;
public class SIAKAD09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        if (jumlahSiswa <= 0 || jumlahMatkul <= 0) {
            System.out.println("Jumlah siswa dan mata kuliah harus > 0.");
            sc.close();
            return;
        }

        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nMasukkan nilai untuk Siswa ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahMatkul; j++) {
                while (true) {
                    System.out.print("  Nilai Mata Kuliah ke-" + (j + 1) + " (0-100): ");
                    int v = sc.nextInt();
                    if (v < 0 || v > 100) {
                        System.out.println("    Nilai tidak valid. Masukkan antara 0 dan 100.");
                    } else {
                        nilai[i][j] = v;
                        break;
                    }
                }
            }
        }

        System.out.println("\n=== Rata-rata setiap siswa ===");
        for (int i = 0; i < jumlahSiswa; i++) {
            int total = 0;
            for (int j = 0; j < jumlahMatkul; j++) {
                total += nilai[i][j];
            }
            double rataSiswa = (double) total / jumlahMatkul;
            System.out.printf("Siswa ke-%d: %.2f%n", (i + 1), rataSiswa);
        }

        System.out.println("\n=== Rata-rata setiap mata kuliah ===");
        for (int j = 0; j < jumlahMatkul; j++) {
            int total = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                total += nilai[i][j];
            }
            double rataMatkul = (double) total / jumlahSiswa;
            System.out.printf("Mata Kuliah ke-%d: %.2f%n", (j + 1), rataMatkul);
        }
    }
}
