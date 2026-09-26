import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka r : ");
        double r = sc.nextDouble();
        double luas = 3.14 * r * r;
        System.out.print("luas lingkaran : " + luas);
    
    }
}