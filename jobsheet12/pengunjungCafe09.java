package jobsheet12;

public class pengunjungCafe09 {

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Pengunjung:");

        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {

        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
