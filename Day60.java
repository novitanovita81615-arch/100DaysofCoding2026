import java.util.Scanner;
public class day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }
        System.out.println("jumlah: " + sum);
    }
}