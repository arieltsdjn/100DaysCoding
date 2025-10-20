import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = s.nextInt();
        if (angka%3==0&&angka%5==0) System.out.println("angka "+angka+" habis dibagi 3 dan 5");
        else if (angka%3==0) System.out.println("angka "+angka+" habis dibagi 3");
        else if (angka%5==0) System.out.println("angka "+angka+" habis dibagi 5");
    }
}
