public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan temperatur : ");
        double suhu = sc.nextDouble();

        if (suhu <= 20) {
            System.out.println("temperatur dingin");
        } else if (suhu <= 30) {
            System.out.println("temperatur normal");
        } else {
            System.out.println("temperatur panas");
        }
    }
}