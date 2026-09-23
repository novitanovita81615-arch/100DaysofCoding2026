import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //sebelum ditukar
        System.out.print("masukkan a : ");
        int a = sc.nextInt();
        System.out.print("masukkan b : ");
        int b = sc.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        //setelah ditukar
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}