import java.util.Scanner;
public class day87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nilai[] = new int[n];
        for (int i = 0; i < n; i++) {
            nilai[i] = sc.nextInt();
        }
        System.out.println("Array awal:");
        for (int i = 0; i < n; i++) {
            System.out.println(nilai[i]);
        }

        System.out.print("Masukkan indeks yang ingin diubah : ");
        int indeks = sc.nextInt();

        System.out.print("Masukkan nilai baru : ");
        int baru = sc.nextInt();

        nilai[indeks] = baru;

        System.out.println("Array setelah diubah : ");
        for (int i = 0; i < n; i++) {
            System.out.println(nilai[i]);
        }
    }
}