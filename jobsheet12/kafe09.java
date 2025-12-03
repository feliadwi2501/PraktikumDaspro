package jobsheet12;

import java.util.Scanner;

public class kafe09 {
    public static void main(String[] args) {
        
    
    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {

        int[] harga = {15000, 20000, 22000, 12000, 10000, 18000};

        int total = harga[pilihanMenu - 1] * banyakItem;

        // Promo
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% diterapkan!");
            total = total / 2;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% diterapkan!");
            total = total - (total * 30 / 100);
        } else {
            System.out.println("Kode promo tidak valid atau tidak ada promo.");
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu();

        System.out.print("Berapa jenis menu yang ingin Anda pesan? ");
        int jumlahPesanan = sc.nextInt();

        System.out.print("Masukkan kode promo (DISKON50/DISKON30 atau - untuk tidak memakai): ");
        String kodePromo = sc.next();

        int totalKeseluruhan = 0;

        for (int i = 1; i <= jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + i);

            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            int totalPerMenu = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalPerMenu;

            System.out.println("Total untuk menu ini: Rp" + totalPerMenu);
        }

        System.out.println("\n==============================");
        System.out.println("TOTAL KESELURUHAN PESANAN: Rp" + totalKeseluruhan);
        System.out.println("==============================");
    }
    }
    }
