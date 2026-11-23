import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nilai[] = new int[n];

        for (int i = 0; i < n; i++) {
            nilai[i] = sc.nextInt();
        }

        int total = 0;

        for (int i = 0; i < n; i++) {
            total = total + nilai[i];
        }

        System.out.println("Total: " + total);
    }
}