package jobsheet13;

import java.util.Scanner;

public class Tugas {

    public static int hitungTotalIteratif(int[] angka) {
        int total = 0;
        for (int a : angka) {
            total += a;
        }
        return total;
    }

    public static int hitungTotalRekursif(int[] angka, int n) {

        if (n < 0) {
            return 0;
        } else {
            return angka[n] + hitungTotalRekursif(angka, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int[] angka = new int[N];

        for (int i = 0; i < N; i++) {

            System.out.print("Masukkan angka ke-" + (N - i) + ": ");
            angka[i] = sc.nextInt();
        }

        int totalRekursif = hitungTotalRekursif(angka, N - 1);

        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + totalRekursif);

        sc.close();
    }
}
