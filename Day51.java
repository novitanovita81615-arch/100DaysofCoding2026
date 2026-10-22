import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka batas : ");
        int a = sc.nextInt();

        for (int b = 0; b <= a; b++) {
            System.out.println(b);
        }
    }
}