import java.util.Scanner;
public class Angka09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        // Input n 
        System.out.print("Masukkan nilai n (minimal 3): ");
        n = input.nextInt();

        if (n < 3) {
            System.out.println("Nilai n harus minimal 3!");
            return;
        }

        // Perulangan baris (outer loop)
        for (int i = 1; i <= n; i++) {
            // Perulangan kolom (inner loop)
            for (int j = 1; j <= n; j++) {
                // Kondisi untuk mencetak angka di tepi persegi
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  "); // spasi di bagian tengah
                }
            }
            System.out.println(); // pindah ke baris berikutnya
        }
    }
}
