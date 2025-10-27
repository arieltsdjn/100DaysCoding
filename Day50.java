import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = s.nextInt();
        String a = (angka%2==0) ? "genap":"ganjil";
        System.out.println("angka "+angka+" adalah "+a);
    }
}
