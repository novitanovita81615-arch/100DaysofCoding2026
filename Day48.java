import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===KALKULATOR===");
        System.out.println("1. (+)");
        System.out.println("2. (-)");
        System.out.println("3. (*)");
        System.out.println("4. (/)");
        System.out.print("pilih : ");
        int pilihan = sc.nextInt();
        System.out.print("masukkan angka 1 : ");
        int a = sc.nextInt();
        System.out.print("masukkan angka 2: ");
        int b = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("hasilnya : " + (a + b));
                break;
            case 2:
                System.out.println("hasilnya : " + (a - b));
                break;
            case 3:
                System.out.println("hasilnya : " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("hasilnya : " + (a / b));
                } else {
                    System.out.println("tidak bisa membagi dengan nol");
                }
                break;
            default:
                System.out.println("pilihan tidak valid");
        }
    }
}
