import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan a : ");
        int a = sc.nextInt();

        System.out.print("masukkan b : ");
        int b = sc.nextInt();

        System.out.println("a <= b : " + (a <= b));
        System.out.println("a >= b : " + (a >= b));
    }
}