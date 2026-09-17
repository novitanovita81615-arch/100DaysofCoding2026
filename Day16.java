import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner modulus = new Scanner(System.in);
        System.out.print("masukkan angka1 : ");
        int angka1 = modulus.nextInt();
        System.out.print("masukkan angka2 : ");
        int angka2 = modulus.nextInt();
        
        System.out.print("sisa bagi : ");
        int hasil = angka1 % angka2;
        System.out.print(hasil);
        
    }
}