import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pilih, anu = 0;
        do {
            System.out.print("MENU:\n1. Nasgor\n2. Naskun\n3. Nascam\n4. Nasdem (Partai)\n0. Keluar\nPilih: ");
            pilih = s.nextInt();
            switch (pilih) {
                case 1 -> anu++;
                case 2 -> anu++;
                case 3 -> anu++;
                case 4 -> anu++;
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (!(pilih ==0)&&!(pilih>4));
        System.out.println("Kamu memilih sebanyak "+anu+" kali.");
    }
}
