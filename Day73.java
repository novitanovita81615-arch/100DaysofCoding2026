import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. halo");
            System.out.println("2. Tampilkan Nama");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Halo, welcome!");
                    break;

                case 2:
                    System.out.println("nama saya Novita, salam kenal!");
                    break;

                case 3:
                    System.out.println("Terimakasih");
                    break;

                default:
                    System.out.println("tidak valid");
            }

        } while (pilihan != 3);
    }
}
