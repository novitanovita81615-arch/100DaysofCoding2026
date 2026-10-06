import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan usia : ");
        int usia = sc.nextInt();

        if (usia >= 13) {
            if (usia >= 60) {
                System.out.println("Lansia");
            } else if (usia >= 20) {
                System.out.println("Dewasa");
            } else {
                System.out.println("Remaja"); }
            } else {
                System.out.println("Anak-anak"); }
    }
}