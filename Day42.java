import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan gaji pokok : Rp.");
        double gaji = sc.nextDouble();

        System.out.print("masukkan potongan : Rp.");
        double potongan = sc.nextDouble();
        
        System.out.print("masukkan tunjangan : Rp.");
        double tunjangan = sc.nextDouble();

        double gajibersih = gaji + tunjangan - potongan;
        
        System.out.println("gaji bersih : Rp." + gajibersih);
    }
}