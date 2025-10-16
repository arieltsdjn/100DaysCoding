import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PILIH MENU ===");
        System.out.println("1. Pukul");
        System.out.println("2. Tendang");
        System.out.println("3. Tampar");
        System.out.print("Ketik pilihan: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih pukulan!");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih tendangan!");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih tamparan!");
        } else {
            System.out.println("Pilihan tidak tersedia!");
        }
    }
}