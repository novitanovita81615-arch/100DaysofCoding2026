import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukkan sisi : ");
        int sisi = sc.nextInt();
        int luas = sisi * sisi;
        System.out.print("masukkan luas persegi : " + luas);
    }
}