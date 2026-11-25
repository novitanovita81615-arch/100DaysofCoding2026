import java.util.Scanner;

public class day85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nilai[] = new int[n];

        for (int i = 0; i < n; i++) {
            nilai[i] = sc.nextInt();
        }

        int terkecil = nilai[0];

        for (int i = 0; i < n; i++) {
            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }

        System.out.println("Nilai terkecil: " + terkecil);
    }
}