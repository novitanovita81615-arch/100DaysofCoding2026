import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("masukkan angka : ");
        int angka = s.nextInt();
        String teks1 = String.valueOf(angka);
        System.out.print("masukkan pecahan : ");
        double pecahan = s.nextDouble();
        String teks2 = String.valueOf(pecahan);
        System.out.print("masukkan huruf : ");
        char huruf = s.next().charAt(0);
        String teks3 = String.valueOf(huruf);
        System.out.print("masukkan boolean : ");
        boolean benar = s.nextBoolean();
        String teks4 = String.valueOf(benar);

        System.out.println("hasil string : " + teks1);
        System.out.println("hasil string : " + teks2);
        System.out.println("hasil string : " + teks3);
        System.out.println("hasil string : " + teks4);
        
    }
}
