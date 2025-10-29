package jobsheet8;

public class Kuadrat09 {
    public static void main(String[] args) {
        int n, i, j, jumlah;

        // Outer loop untuk n dari 1 sampai 5
        for (n = 1; n <= 5; n++) {
            jumlah = 0;
            System.out.print("n = " + n + " -> jumlah kuadrat = ");

            // Inner loop untuk menghitung jumlah kuadrat dari 1 sampai n
            for (i = 1; i <= n; i++) {
                jumlah += i * i; // tambahkan kuadrat ke total
                
                // tampilkan proses penjumlahan
                System.out.print(i * i);
                if (i < n) {
                    System.out.print(" + ");
                }
            }

            // tampilkan hasil total
            System.out.println(" = " + jumlah);
        }
    }
}
