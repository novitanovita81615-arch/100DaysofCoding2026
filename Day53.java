import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan angka batas : ");
        int batas = sc.nextInt();

        int a = 1;

        do {
            System.out.println(a);
            a++;
        } while (a <= batas);
    }
}
