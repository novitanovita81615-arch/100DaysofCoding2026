import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka batas : ");
        int a = sc.nextInt();
        int b = 0;
        while (b <= a) {
            System.out.println(b);
            b++;
        }
    }
}