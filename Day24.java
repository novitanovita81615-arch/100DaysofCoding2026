import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukkan panjang : ");
        int panjang = sc.nextInt();
        System.out.print("masukkan lebar : ");
        int lebar = sc.nextInt();
        int luaspersegi = panjang * lebar;
        System.out.print("Luas persegi panjang : " + luaspersegi);
    }
}