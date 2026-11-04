import java.util.Scanner;
public class day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int n = sc.nextInt();
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }
        //Hasil faktorial dari n
        System.out.println(hasil);
    }
}