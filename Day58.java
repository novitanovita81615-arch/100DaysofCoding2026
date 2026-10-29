import java.util.Scanner;
public class day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("masukkan n: ");
         int N = sc.nextInt();
         System.out.println("Angka ganjil: ");
         for(int i = N; i >= 1; i--){
            if(i % 2 != 0){
                System.out.print(i + " ");
            } 
         } System.out.println("\nAngka genap: ");
         for(int i = N; i >= 1; i--){
            if(i % 2 == 0){
                System.out.print(i + " ");
            } 
         }
         
    }
}