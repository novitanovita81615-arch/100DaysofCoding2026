import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka M: ");
        int M = sc.nextInt();

        System.out.print("Masukkan angka N: ");
        int N = sc.nextInt();

        if (M <= 0) {
            System.out.println("M harus lebih dari 0.");
            return;
        }

        System.out.println("Bilangan kelipatan : " + M);

        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
    }
}