import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan nilai : ");
        int nilai = sc.nextInt();
        if (nilai >= 90) {
            System.out.println("A");
        } else if (nilai >= 80) {
            System.out.println("B");
        } else if (nilai >= 70) {
            System.out.println("C");
        } else if (nilai >= 0 && nilai < 70) {
            System.out.println("D");
        } else {
            System.out.println("nilai tidak valid");
        }
    }
}