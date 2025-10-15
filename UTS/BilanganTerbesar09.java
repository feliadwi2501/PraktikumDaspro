import java.util.Scanner;

public class BilanganTerbesar09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // input angka
        System.out.print("Masukkan angka pertama : ");
        int a = sc.nextInt();

        System.out.print("Masukkan angka kedua : ");
        int b = sc.nextInt();

        System.out.print("Masukkan angka ketiga : ");
        int c =sc.nextInt();

        // Menentukan angka trbesar
        int terbesar = a;
       
        if (b > terbesar) {
            terbesar = b;
        }
        if (c > terbesar) {
            terbesar = c;
        }
          
        // Untuk mengecek apakah ada angka yang sama besar
        if ((a == terbesar && b == terbesar && c == terbesar)) {
            System.out.println("Semua angka sama besar: " + terbesar);
        } else if ((a == terbesar && b == terbesar) || 
                    (a == terbesar && c == terbesar) || 
                    (b == terbesar && c == terbesar)) {
            System.out.println("Ada beberapa angka terbesar dengan nilai yang sama: " + terbesar);
        } else {
            System.out.println("Angka terbesar adalah: " + terbesar);
        }

    }
}


