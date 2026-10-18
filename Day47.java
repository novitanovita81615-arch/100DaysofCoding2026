import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan angka hari 1-7: ");
        int hari = sc.nextInt();

        switch (hari) {
            case 1:
                System.out.println("senin");
                break;
            case 2:
                System.out.println("selasa");
                break;
            case 3:
                System.out.println("rabu");
                break;
            case 4:
                System.out.println("kamis");
                break;
            case 5:
                System.out.println("jumat");
                break;
            case 6:
                System.out.println("sabtu");
                break;
            case 7:
                System.out.println("minggu");
                break;
            default:
                System.out.println("angka hari tidak valid");
        }
    }
}
