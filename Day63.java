import java.util.Scanner;
public class day63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai m : ");
        int M = in.nextInt();
        System.out.print("masukkan nilai n : ");
        int N = in.nextInt();
        int hasil = 1;
        for (int i = 1; i <= N; i++) {
            hasil = hasil * M;
        }
        System.out.println("Hasil " + M + " pangkat " + N + " adalah: " + hasil);
    }
}