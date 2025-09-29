import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sisi;
        double luas;

        System.out.print("Masukkan panjang sisi persegi: ");
        sisi = input.nextInt();

        System.out.println("Luas persegi adalah: " + (sisi * sisi));
    }
}