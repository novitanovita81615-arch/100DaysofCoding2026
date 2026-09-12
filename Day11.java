import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nama 
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan nama : ");
        String nama = s.nextLine();
        // umur
        System.out.print("masukkan usia : ");
        int umur = s.nextInt();
        // tinggi
        System.out.print("masukkan tinggi : ");
        double tinggi = s.nextDouble();
        
        System.out.printf("Nama saya %s, umur saya %d tahun, dan tinggi badan saya %.2f cm", nama, umur, tinggi);
    }
}