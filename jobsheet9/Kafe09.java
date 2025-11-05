import java.util.Scanner;

public class Kafe09 {
    public static void main(String[] args) {
        
        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappucino", 
            "Chocolate Ice"
        };

        Scanner input = new Scanner(System.in);

        System.out.println("=== Daftar Menu Kafe ===");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("\nMasukkan nama makanan yang ingin Anda cari: ");
        String cari = input.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {  
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println(" Makanan \"" + cari + "\" tersedia di menu.");
        } else {
            System.out.println(" Maaf, makanan \"" + cari + "\" tidak tersedia di menu.");
        }

    }
}
