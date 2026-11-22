import java.util.Scanner;
public class eval1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.printf("Perkenalkan saya" + " " + a + "," + " " + "dari prodi" + " " + b);
    }
}

public class eval2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println("Hello, World!");
        }
    }
}

import java.util.Scanner;

public class eval3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        for(int i = 1; i <= b; i++){
            System.out.println(a);
        }
    }
}