public class Main {
    public static void main(String[] args) {

        // continue
        System.out.println("Contoh continue:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        // break
        System.out.println("Contoh break:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        // return
        System.out.println("Contoh return:");

        tampilkanAngka();

        System.out.println("Program selesai");
    }

    static void tampilkanAngka() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("Selesai");
    }
}