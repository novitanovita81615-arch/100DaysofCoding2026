import java.util.Scanner;
public class day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int total = 0;
        while (true) {
            System.out.print("Masukkan angka: ");
            a = sc.nextInt();
            if (a < 0) {
                break;
            }
            total += a;
        }
        System.out.println("Total penjumlahan: " + total);
    }
}