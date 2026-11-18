import java.util.Scanner;
public class day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== buat akun ===");
        System.out.print("buat username : ");
        String user = sc.nextLine();
        System.out.print("buat password : ");
        String pass = sc.nextLine();
        System.out.println("\nakun anda berhasil dibuat!");
        System.out.println("\n=== login ===");
        String username;
        String password;
        do {
            System.out.print("username : ");
            username = sc.nextLine();

            System.out.print("password : ");
            password = sc.nextLine();

            if (!username.equals(user) || !password.equals(pass)) {
                System.out.println("username atau password salah!");
                System.out.println("silakan coba lagi!\n");
            }

        } while (!username.equals(user) || !password.equals(pass));

        System.out.println("\nlogin anda berhasil!");
    }
}