import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan angka : ");
        int a = sc.nextInt();

        String hasil = (a % 2 == 0) ? "genap" : "ganjil";
        System.out.println(hasil);
    }
}
