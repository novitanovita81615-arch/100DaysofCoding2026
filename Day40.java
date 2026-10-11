import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //evaluasi ke2
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int a = sc.nextInt();
        System.out.print("masukkan angka : ");
        int b = sc.nextInt();
        if ( a > b) {
            System.out.println(a - b);
        } else {
            System.out.println(b - a);
            
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //evaluasi ke5
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan huruf : ");
        char huruf = sc.next().charAt(0);
        int angka = (int) huruf;
        if (angka % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //evaluasi ke1
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int dibagi = sc.nextInt();
        System.out.print("masukkan angka : ");
        int pembagi = sc.nextInt();
        int hasil = dibagi / pembagi;
        int sisa = dibagi - (hasil * pembagi);
        System.out.println(sisa);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //evaluasi ke4
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nama : ");
        String nama = sc.nextLine();
        int jumlah = nama.length();
        int hasil = jumlah * 2;
        System.out.println(hasil);
    }
}