import java.util.Scanner;
public class day69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan panjang baris : ");
        int a = sc.nextInt();
        System.out.print("masukkan jumlah kolom : ");
        int b = sc.nextInt();
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= b; j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
        
    } 
}