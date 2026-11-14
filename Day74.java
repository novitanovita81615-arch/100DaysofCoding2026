
import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan teks : ");
        String t = sc.nextLine();
        System.out.println("Jumlah karakter: " + t.length());
        System.out.println("Huruf kapital: " + t.toUpperCase());
        System.out.println("Huruf kecil: " + t. toLowerCase());
    }
}
