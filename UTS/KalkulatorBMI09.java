import java.util.Scanner;

public class KalkulatorBMI09 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //input tb dan bb
        System.out.print("Masukkan berat badan (kg) : ");
        double berat = sc.nextDouble(); 

        System.out.print("Masukkan tinggi badan (cm) : ");
        double tinggi = sc.nextDouble()/100; //mengubah satuan tinggi cm menjadi meter

        if (berat <= 0 || tinggi <= 0) {
                System.out.println("Berat dan tinggi badan harus lebih dari 0!");
            }else{
              
                double bmi = berat / (tinggi * tinggi);
                String kategori, risiko;
        
        // untukmpemilihan kategori dan resiko
        if ( bmi < 18.5) {
            kategori = "Kurang berat badan (Underweight)";
            risiko = "Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh.";
        } else if (bmi < 25) {
            kategori = "Berat badan normal (Normal weight)";
            risiko = "Risiko kesehatan relatif rendah.";
        } else if (bmi < 30) {
            kategori = "Kelebihan berat badan (Overweight)";
            risiko = "Meningkatnya risiko penyakit jantung, diabetes, dan tekanan darah tinggi.";
        } else {
            kategori = "Obesitas (Obese)";
            risiko = "Risiko tinggi penyakit jantung, diabetes, masalah pernapasan, dan kanker.";
        } 
        // untuk menghitung kategori dan resiko
        System.out.println("Nilai BMI : "+ bmi);
        System.out.println("Kategori: "+ kategori);
        System.out.println("Risiko Kesehatan: "+ risiko);

     
    }
}  
}
