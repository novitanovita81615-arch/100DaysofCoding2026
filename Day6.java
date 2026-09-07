public class Main {
    public static void main(String[] args) {
        
        char garismiring = '\\';
        char petik = '\'';
        char huruf = 'C';
        char baris = '\n';
        char tab = '\t';
        
        boolean a = (2 > 3);
        boolean b = (2 < 3);
        boolean c = (2 < 2);
        boolean d = (2 >= 2);
        boolean e = (3 <= 3);
        
        System.out.println("petik :" + petik);
        System.out.println("huruf ;" + huruf);
        System.out.println("garismiring :" + garismiring);
        System.out.println("belajar" + baris + "ngoding");
        System.out.println("belajar" + tab + "ngoding");
        
        System.out.println("2 > 3 :" + a);
        System.out.println("2 < 3 :" + b);
        System.out.println("2 < 2 :" + c);
        System.out.println("2 >= 2 :" + d);
        System.out.println("3 <= 3 :" + e);
        
        // char → menyimpan satu karakter, termasuk karakter hasil escape sequence.
        // boolean → menyimpan true/false, termasuk hasil dari perbandingan.
        
    }
}