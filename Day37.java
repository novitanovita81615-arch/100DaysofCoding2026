import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = sc.nextInt();
        if (angka > 0) {
            System.out.println("bilangan positif");
        } else if (angka < 0) {
            System.out.println("bilangan negatif");
        } else {
            System.out.println("bilangan nol"); }
    }
}