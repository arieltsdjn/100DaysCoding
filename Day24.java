import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jari;
        double phi;

        System.out.print("Masukkan jari-jari lingkaran: ");
        jari = input.nextInt();
        phi = 3.14;

        System.out.println("Luas lingkaran adalah: " + (phi * jari * jari));
    }
}