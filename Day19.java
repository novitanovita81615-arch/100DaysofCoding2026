import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //long ke int
        System.out.print("masukkan angka : ");
        long a = sc.nextLong();
        int b = (int) a;

        //double ke int
        System.out.print("masukkan angka : ");
        double c = sc.nextDouble();
        int d = (int) c;

        System.out.println("long ke int : " + b);
        System.out.println("double ke int : " + d);
    }
}