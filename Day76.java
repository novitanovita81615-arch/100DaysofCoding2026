
import java.util.Scanner;
public class Day76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = sc.nextLine();

        String bersih = teks.trim();

        System.out.println("Teks awal: " + teks);
        System.out.println("Hasil trim: " + bersih);
        System.out.println("Hasil replace: " + bersih.replace("Java", "Golang"));
        System.out.println("Hasil substring: " + bersih.substring(0, 7));
    }
}
