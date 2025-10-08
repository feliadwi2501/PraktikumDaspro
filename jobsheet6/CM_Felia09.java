import java.util.Scanner;

public class CM1_Felia09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");

        System.out.print("Masukkan nama mahasiswa : ");
        String nama = sc.nextLine(); // nama pakai String

        System.out.print("Masukkan NIM mahasiswa : ");
        String nim = sc.nextLine(); // NIM juga String biar bisa huruf/angka

        // ===================== Mata Kuliah 1 =====================
        System.out.println("\n--- Mata kuliah 1 : Algoritma dan Pemrograman ---");
        System.out.print("Masukkan nilai UTS : ");
        double uts1 = sc.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        double uas1 = sc.nextDouble();
        System.out.print("Masukkan nilai Tugas : ");
        double tugas1 = sc.nextDouble();

        double akhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        String huruf1;
        String status1;

        if (akhir1 >= 80 && akhir1 <= 100) huruf1 = "A";
        else if (akhir1 >= 73) huruf1 = "B+";
        else if (akhir1 >= 65) huruf1 = "B";
        else if (akhir1 >= 60) huruf1 = "C+";
        else if (akhir1 >= 50) huruf1 = "C";
        else if (akhir1 >= 39) huruf1 = "D";
        else huruf1 = "E";

        if (akhir1 >= 60) status1 = "LULUS";
        else status1 = "TIDAK LULUS";

        // ===================== Mata Kuliah 2 =====================
        System.out.println("\n--- Mata kuliah 2 : Struktur Data ---");
        System.out.print("Masukkan nilai UTS : ");
        double uts2 = sc.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        double uas2 = sc.nextDouble();
        System.out.print("Masukkan nilai Tugas : ");
        double tugas2 = sc.nextDouble();

        double akhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        String huruf2;
        String status2;

        if (akhir2 >= 80 && akhir2 <= 100) huruf2 = "A";
        else if (akhir2 >= 73) huruf2 = "B+";
        else if (akhir2 >= 65) huruf2 = "B";
        else if (akhir2 >= 60) huruf2 = "C+";
        else if (akhir2 >= 50) huruf2 = "C";
        else if (akhir2 >= 39) huruf2 = "D";
        else huruf2 = "E";

        if (akhir2 >= 60) status2 = "LULUS";
        else status2 = "TIDAK LULUS";

        // ===================== Hitung Rata-rata & Status Semester =====================
        double rataRata = (akhir1 + akhir2) / 2;
        String statusSemester;

        if (status1.equalsIgnoreCase("LULUS") && status2.equalsIgnoreCase("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS SEMESTER";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Ada mata kuliah tidak lulus)";
        }

        // ===================== OUTPUT =====================
        System.out.println("\n========== HASIL PENILAIAN AKADEMIK ==========");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-25s %-6s %-6s %-6s %-10s %-8s %-15s\n",
                          "Mata Kuliah", "UTS", "UAS", "Tugas", "Akhir", "Huruf", "Status");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-25s %-6.1f %-6.1f %-6.1f %-10.2f %-8s %-15s\n",
                          "Algoritma & Pemrograman", uts1, uas1, tugas1, akhir1, huruf1, status1);
        System.out.printf("%-25s %-6.1f %-6.1f %-6.1f %-10.2f %-8s %-15s\n",
                          "Struktur Data", uts2, uas2, tugas2, akhir2, huruf2, status2);
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir : %.2f\n", rataRata);
        System.out.println("Status Semester       : " + statusSemester);

        sc.close();
    }
}
