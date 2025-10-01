import java.util.Scanner;
public class layananwifi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tipe user (dosen/mahasiswa): ");
        String userType = input.nextLine();
        System.out.print("Masukkan julah SKS : ");
        int sks = input.nextInt();

        if(userType.equalsIgnoreCase("dosen")){
            System.out.println("Akses wifi diberikan (dosen)");
        } else if (userType.equalsIgnoreCase("mahasiswa")){
            if (sks>12) {
                System.out.println("Akses wifi diberikan (mahasiswa)");

            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            } 
        } else {
            System.out.println("Akses ditolak, userType tidak dikenali");
        }
        }
    }
    
