import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan angka : ");
        int nilai = sc.nextInt();

        if (nilai >= 75) {
            System.out.print("lulus");
        } else {
            System.out.print("Tidak lulus");
        }
    }
}