import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // soal 1 evaluasi
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        if (Y > X) {
            X = X + 1;
        }

        if (Z > X) {
            X = X + 2;
        }

        if (Y < X) {
            X = X - 1;
        }

        if (Z < X) {
            X = X - 2;
        }

        System.out.println(X);


        // soal 2 evaluasi
        double N = sc.nextDouble();

        if (N % 1 == 0) {
            if (N % 2 == 0) {
                System.out.println("Bulat Genap");
            } else {
                System.out.println("Bulat Ganjil");
            }
        } else {
            System.out.println("Pecahan");
        }

        if (N > 0) {
            System.out.println("Positif");
        } else if (N < 0) {
            System.out.println("Negatif");
        }

        if (N >= 0 && N % 1 == 0) {
            System.out.println("Natural/Cacah");
        }


        // soal 3 evaluasi
        int batas = sc.nextInt();

        for (int i = 1; i <= batas; i++) {
            if (i % 3 == 0 && i % 4 != 0) {
                System.out.print(i + " ");
            } else if (i % 4 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
