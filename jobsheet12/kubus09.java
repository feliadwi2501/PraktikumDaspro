package jobsheet12;
import java.util.Scanner;
public class kubus09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, L, vol;

        System.out.print("Masukkan sisi:");
        s = input.nextInt();

        L = s * s * s;
        System.out.println("Luas permukaan kubus adalah: " + L);
        vol = 6 * s * s * s;
        System.out.println("Volume kubus adalah: " + vol);

        input.close();
    }
}
