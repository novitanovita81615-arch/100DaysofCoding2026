import java.util.Scanner;
public class day77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan teks : ");
        String a = sc.nextLine();

        System.out.println("teks : " + a);
        System.out.println("karakter pertama : " + a.charAt(0));
        System.out.println("karakter terakhir : " + a.charAt(a.length() - 1));
        System.out.println("posisi huruf a : " + a.indexOf("a"));
        System.out.println("posisi terakhir huruf a : " + a.lastIndexOf("a"));
        System.out.println("apakah mengandung Java : " + a.contains("Java"));
        System.out.println("apakah teks kosong : " + a.isEmpty());
    }
}