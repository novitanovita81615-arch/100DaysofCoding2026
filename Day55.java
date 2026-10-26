import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan batas: ");
        int a = sc.nextInt();

        // Menghentikan method main jika batas tidak sesuai.
        if (a <= 0 || a > 100) {
            System.out.println("Tidak sesuai.");
            return;
        }

        // Menampilkan angka genap dan melewati angka ganjil.
        for (int i = 1; i <= a; i++) {

            if (i % 2 != 0) {
                continue;
            }

            // Menghentikan perulangan saat mencapai angka 20.
            if (i == 20) {
                break;
            }

            System.out.print(i + " ");
        }
    }
}