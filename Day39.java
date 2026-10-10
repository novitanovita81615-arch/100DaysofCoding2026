import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====KALKULATOR====");
        System.out.println("1.penjumlahan");
        System.out.println("2.pengurangan");
        System.out.println("3.perkalian");
        System.out.println("4.pembagian");
        System.out.print("Pilih operasi (+-*/): ");
        int pilihan = sc.nextInt();

        System.out.print("masukkan angka pertama : ");
        double a = sc.nextDouble();

        System.out.print("masukkan angka kedua : ");
        double b = sc.nextDouble();

        if (pilihan == 1) {
            System.out.println("hasil : " + (a + b));
        } else if (pilihan == 2) {
            System.out.println("hasil : " + (a - b));
        } else if (pilihan == 3) {
            System.out.println("hasil : " + (a * b));
        } else if (pilihan == 4) {
            if (b != 0) {
                System.out.println("hasil : " + (a / b));
            } else {
                System.out.println("tidak bisa membagi dengan nol"); }
        } else {
            System.out.println("pilihan tidak tersedia");
        }
    }
}