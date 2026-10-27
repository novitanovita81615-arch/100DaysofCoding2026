import java.util.Scanner;
public class Day56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan N : ");
        int N = sc.nextInt();
        //mencetak angka 1 sampai N
        for (int i = 1 ; i <= N; i++){
            System.out.print(i + " ");
        } System.out.println();
        for(int i = N; i >= 1; i--){
            System.out.print(i + " ");
        }
    }
}