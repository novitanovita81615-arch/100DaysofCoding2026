import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===MENU MAKANAN===");
        System.out.println("1. Nasi goreng - Rp15.000");
        System.out.println("2. Ayam geprek free esteh - Rp12.000");
        System.out.println("3. Bakso - Rp10.000");

        System.out.print("pilih menu makanan : ");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("anda memilih nasi goreng, Harga: Rp.15.000");
                break;
            case 2:
                System.out.println("anda memilih ayam geprek + es teh, Harga: Rp.12.000");
                break;
            case 3:
                System.out.println("anda memilih bakso, Harga: Rp.10.000");
                break;
            default:
                System.out.println("tidak tersedia");
        }
    }
}
