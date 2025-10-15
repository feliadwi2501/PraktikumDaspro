import java.util.Scanner;
public class Felia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");

        System.out.print("Masukkan nama mahasiswa :");
        int nama = sc.nextInt();
        System.out.print("Masukkan NIM mahasiswa :");
        int nim = sc.nextInt();

        System.out.println("---Mata kuliah 1 : Algoritma dan Pemrograman---");
        System.out.println("Masukkan nilai UTS :");
        int nilaiUts = sc.nextInt();
        System.out.println("Masukkan nilai UAS :");
        int nilaiUas = sc.nextInt();
        System.out.println("Masukkan nilai Tugas :");
        int nilaiTugas = sc.nextInt();

        //menghitung nilai akhir mata  kuliah
        double akhir1 = (uts*0.3)+(uas*0.4)+(tugas*0.3);
        String huruf1 = "";
        String status1 = "";

        //menentukan nilai huruf dan status

        if(akhir1 >=80 && akhir1 <= 100){
            huruf1 = "A";
        }else if(akhir >=73){
            huruf1 = "B+";
        }else if(akhir1 >=65){
            huruf1 = "B";
        }else if(akhir1 >=60){
            huruf1 = "C+";
        }else if(akhir1 >=50){
            huruf1 = "C";
        }else if(akhir1 >=39){
            huruf1 = "D";
        }else if(akhir1 <=0 >=39){
            huruf1 = "E";
        }

        if(akhir1 >=60){
            status1 = "LULUS";
        }else{
            status1 = "TIDAK LULUS";
        }

        System.out.println("---Mata kuliah 2 : Struktur Data---");
        System.out.println("Masukkan nilai UTS :");
        int uts = sc.nextInt();
        System.out.println("Masukkan nilai UAS :");
        int uas = sc.nextInt();
        System.out.println("Masukkan nilai Tugas :");
        int tugas = sc.nextInt();

        double akhir2 = (uts*0.3)+(uas*0.4)+(tugas*0.3);
        String huruf2 = "";
        String status2 = "";

        if(akhir2 >=80 && akhir2 <= 100){
            huruf2 = "A";
        }else if(akhir2 >=73){
            huruf2 = "B+";
        }else if(akhir2 >=65){
            huruf2 = "B";
        }else if(akhir2 >=60){
            huruf2 = "C+";
        }else if(akhir2 >=50){
            huruf2 = "C";
        }else if(akhir2 >=39){
            huruf2 = "D";
        }else if(akhir2 <=0 >=39){
            huruf2 = "E";
        }
        //hasil nilai akhir
        if(akhir2 >=60){
            status2 = "LULUS";
        }else{
            status2 = "TIDAK LULUS";
        }

        
        double rataRata = (akhir1 + akhir2)/2;
        String statusSemester = "";

        if (status.equalsIgnoreCase("LULUS")){
            if(rataRata >=70){
                statusSemester = "LULUS";
            }else{
                statusSemester = "TUDAK LULUS (rata-rata <70)";
            }
            }else{
            statusSemester = "TIDAK LULUS (ada mata kuliah tidak lulus)";
        }


    System.out.println("========== HASIL PENLAIAN AKAADEMIK ==========");
    System.out.println("Nama : " +nama);
    System.out.println("NIM : " +nim);
    System.out.println("Mata Kuliah\t\t\t\t\t\tUTS\tUAS\tTugas\t\t\tNilai Akhir\t\t\tStatus Huruf\t\t\tStatus");
    System.out.println("---------------------------------------------------------------------------------------");
        }
}