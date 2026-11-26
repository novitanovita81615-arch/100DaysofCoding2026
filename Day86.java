import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nilai[] = new int[n];

        for (int i = 0; i < n; i++) {
            nilai[i] = sc.nextInt();
        }

        int cari = sc.nextInt();
        boolean a = false;

        for (int i = 0; i < n; i++) {
            if (nilai[i] == cari) {
                a = true;
                break;
            }
        }

        if (a) {
            System.out.println("Angka ditemukan");
        } else {
            System.out.println("Angka tidak ditemukan");
        }
    }
}