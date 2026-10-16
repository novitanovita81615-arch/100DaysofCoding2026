import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===LAYANAN OPERATOR===");
        System.out.println("1. info pulsa");
        System.out.println("2. paket internet");
        System.out.println("3. transfer pulsa");

        System.out.print("pilih menu : ");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("sisa pulsa anda : Rp5.000");
                break;
            case 2:
                System.out.println("anda memilih paket internet");
                break;
            case 3:
                System.out.println("anda memilih transfer pulsa");
                break;
            default:
                System.out.println("pilihan tidak tersedia");
        }
    }
}
