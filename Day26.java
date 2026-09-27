import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        //soal evaluasi 1
        Scanner sc = new Scanner(System.in);
        System.out.printf("Masukkan nama    : ");
        String nama = sc.nextLine();
        System.out.printf("Masukkan NIM     : ");
        String NIM = sc.nextLine();
        System.out.printf("Masukkan Kelas   : ");
        char kelas = sc.next().charAt(0);
        System.out.printf("Masukkan Umur    : ");
        int umur = sc.nextInt();
        sc.nextLine();
        System.out.printf("Masukkan Prodi   : ");
        String prodi = sc.nextLine();
        System.out.printf("Masukkan IPK     : ");
        double IPK = sc.nextDouble();
        System.out.printf("Status mahasiswa : ");
        boolean status = sc.nextBoolean();
        
        System.out.print("===========BIODATA MAHASISWA========");
        System.out.println();
        System.out.println("Nama             : " + nama);
        System.out.println("NIM              : " + NIM);
        System.out.println("Kelas            : " + kelas);
        System.out.println("Umur             : " + umur);
        System.out.println("Prodi            : " + prodi);
        System.out.println("IPK              : " + IPK);
        System.out.println("Status mahasiswa : " + status);
        System.out.println("====================================");
        
    }
}

        //soal evaluasi 2
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double luas_lingkaran = 3.14 * r * r;
        System.out.print(luas_lingkaran);
        
        int t = sc.nextInt();
        double luas_lingkaran2 = 3.14 * t * t;
        System.out.print(luas_lingkaran2);
    }
}   

        //soal evaluasi 3
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.print(a);
        System.out.print(b);
    }
}   