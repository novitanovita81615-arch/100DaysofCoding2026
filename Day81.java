import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah elemen : ");
        int n = sc.nextInt();
        int nilai[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        System.out.println("Isi array:");
        for (int i = 0; i < n; i++) {
            System.out.println(nilai[i]);
        }
    }
}