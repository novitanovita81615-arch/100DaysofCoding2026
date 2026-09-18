import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 10;
        System.out.print("masukkan angka : ");
        a += s.nextInt();
        System.out.println("hasil += : " + a);
        
        System.out.print("masukkan angka : ");
        a -= s.nextInt();
        System.out.println("hasil -= : " + a);
        
        System.out.print("masukkan angka : ");
        a *= s.nextInt();
        System.out.println ("hasil *= : " + a);
        
        System.out.print("masukkan angka : ");
        a /= s.nextInt();
        System.out.println("hasil /= : " + a);
        
        System.out.print("masukkan angka : ");
        a %= s.nextInt();
        System.out.println("hasil %= : " + a);
    }
}