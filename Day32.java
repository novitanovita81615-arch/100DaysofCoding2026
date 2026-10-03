import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Latihan: Mengkombinasikan berbagai operator.
        
        System.out.print("masukkan angka : ");
        int a = sc.nextInt();
        System.out.print("masukkan angka : ");
        int b = sc.nextInt();
        
        //Operator Increment dan Decrement (++, --)
        a++;
        System.out.println("setelah a++ : " + a);
        ++a;
        System.out.println("setelah ++a : " + a);
        a--;
        System.out.println("setelah a-- : " + a);
        --a;
        System.out.println("setelah --a : " + a);
        
        //Operator Perbandingan == dan !=
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        
        //Operator Perbandingan < dan >.
        System.out.println("a < b : " + (a < b));
        System.out.println("a > b : " + (a > b));
        
        //Operator Perbandingan <= dan >=.
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a >= b : " + (a >= b));
        
        //Operator Logika AND (&&), OR (||), dan NOT (!).
        System.out.println("a && b : " +(a < b && a > 10));
        System.out.println("a || b : " +(a < b || a > 10));
        System.out.println("!a : " + !(a < b));
    }
}