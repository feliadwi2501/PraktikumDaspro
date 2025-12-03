package jobsheet12;
import java.util.Scanner;
public class NilaiMahasiswa09 {
    public static void main(String[] args) {

    // a. Fungsi isianArray
    //Mengisi array dengan nilai input user (return array) 
    public static int[] isianArray(Scanner sc, int N) {
        int[] nilaiMhs = new int[N]; 
        System.out.println("=== Pengisian Nilai Mahasiswa ===");
        for (int i = 0; i < N; i++) {
            System.out.printf("Masukkan nilai Mahasiswa ke-: ", (i + 1));
            nilaiMhs[i] = sc.nextInt();
        }
        return nilaiMhs;
    }
    // b. Fungsi tampilArray
    // Menerima parameter array dan menampilkan seluruh nilainya 
    public static void tampilArray(int[] arrNilai) {
        System.out.println("\n=== Data Nilai Mahasiswa ===");
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.printf("Mahasiswa ke-\n", (i + 1), arrNilai[i]);
        }
    }
    // c. Fungsi hitTot
    // Menerima parameter array, menghitung total, dan mengembalikan total nilai 
    public static int hitTot(int[] arrNilai) {
        int total = 0;
        for (int nilai : arrNilai) {
            total += nilai;
        }
        return total;
    }
    // d. Fungsi main
    // Mengatur alur program 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Membaca nilai N (jumlah mahasiswa)
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int N = sc.nextInt();        
        // 2. Memanggil fungsi isianArray
        int[] dataNilai = isianArray(sc, N); 
        // 3. Memanggil fungsi tampilArray
        tampilArray(dataNilai); 
        // 4. Memanggil fungsi hitTot dan menampilkan total nilai 
        int totalSemuaNilai = hitTot(dataNilai);
        System.out.println("\n---------------------------------");
        System.out.println("Total Nilai Seluruh Mahasiswa: " + totalSemuaNilai);
        System.out.println("---------------------------------");
    }
}
}
