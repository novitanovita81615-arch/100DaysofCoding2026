import java.util.Scanner;
public class day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int N = sc.nextInt();
        int hasil= 1;
        for (int i = 1; i <= N; i++) {
            hasil = hasil * i;
        }
        System.out.println("hasil perkalian : " + hasil);
    }
}