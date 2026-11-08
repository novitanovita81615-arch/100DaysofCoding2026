import java.util.Scanner;
public class latihaneval1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0;

        for(int i = 1; i <= N; i += 2){
            System.out.print(i + " ");
            a+= i;
        } System.out.println();
        System.out.println(a); 
    }
}
import java.util.Scanner;
public class latihaneval2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = N; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class latihaneval3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = a; i < b; i++){
            if (i % 2 == 0 && i % 3 == 0){
                System.out.print(i + " ");
                c++;
            }
        } System.out.println();
        System.out.println(c);
    } 

}