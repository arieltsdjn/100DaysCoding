import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjang;
        int lebar;

        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();

        System.out.println("Luas persegi panjang adalah: " + (panjang * lebar));
    }
}