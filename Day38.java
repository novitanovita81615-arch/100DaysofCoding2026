import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====LAYANAN OPERATOR====");
        System.out.println("1.Info pulsa");
        System.out.println("2.Paket internet");
        System.out.println("3.Transfer pulsa");
        System.out.println("4.Info nomor");
        System.out.print("Pilih menu : ");

        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("Pulsa Anda : Rp20.000");
        } else if (a == 2) {
            System.out.println("Anda memilih paket internet");
        } else if (a == 3) {
            System.out.println("Anda memilih transfer pulsa");
        } else if (a == 4) {
            System.out.println("Nomor anda : 0812345678910");
        } else {
            System.out.println("Pilihan tidak tersedia");
        }
    }
}
