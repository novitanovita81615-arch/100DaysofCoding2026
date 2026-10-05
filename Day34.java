import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan usia : ");
        int usia = sc.nextInt();

        if (usia <= 13) {
            System.out.println("Anak-anak");
        } else if (usia <= 18) {
            System.out.println("Remaja");
        } else if (usia <= 60) {
            System.out.println("Dewasa");
        } else {
            System.out.println("Lansia");
        }
    }
}