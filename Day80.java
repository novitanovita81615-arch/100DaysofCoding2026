import java.util.Scanner;

public class day80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n [] = {10, 20, 30, 40, 50};

        System.out.print("indeks yang ingin diakses : ");
        int indeks = sc.nextInt();

        if (indeks >= 0 && indeks < n.length) {
            System.out.println("Nilai pada indeks " + indeks + " adalah " + n[indeks]);
        } else {
            System.out.println("Indeks tidak valid");
        }
    }
}