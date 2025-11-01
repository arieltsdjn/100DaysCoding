import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Batas atas: ");
        int atas = s.nextInt();
        System.out.print("Batas bawah: ");
        int bawah = s.nextInt();
        System.out.print("Angka: ");
        int angka = s.nextInt();
        if (angka>=atas&&angka<=bawah) {
            System.out.println("YAYAYAYA");
        } else {
            System.out.println("NONONONO");
        }
    }
}
