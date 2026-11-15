import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan teks pertama: ");
        String a = sc.nextLine();

        System.out.print("Masukkan teks kedua: ");
        String b = sc.nextLine();

        System.out.print("Masukkan kata yang dicari: ");
        String cari = sc.nextLine();

        System.out.println();
        System.out.println("Apakah teks sama: " + a.equals(b));
        System.out.println("Apakah teks sama (abaikan huruf besar/kecil): " + a.equalsIgnoreCase(b));
        System.out.println("Apakah kata ditemukan: " + a.contains(cari));
        System.out.println("Apakah kata kosong: " + cari.isEmpty());
    }
}
