import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("== Program Biodata by Ariel ==\n");
        System.out.print("Kenalan yok! Siapa nama panjangmu? ");
        String namaPanjang = input.nextLine();
        System.out.print("Kalau nama panggilanmu siapa? ");
        String namaPanggilan = input.nextLine();
        System.out.print("Kamu berasal dari mana? ");
        String asal = input.nextLine();
        System.out.print("Berapa umur kamu? ");
        int umur = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan NIM kamu: ");
        String nim = input.nextLine();
        System.out.print("Kamu dari fakultas apa? ");
        String fakultas = input.nextLine();
        System.out.print("Sekarang kamu kuliah di prodi apa? ");
        String prodi = input.nextLine();
        System.out.print("Hobi kamu apa aja? ");
        String hobi = input.nextLine();

        System.out.println("\n=== BIODATA KAMU ===");
        System.out.println("Halo " + namaPanggilan + "! Berikut biodatamu:");
        System.out.println("Nama Panjang   : " + namaPanjang);
        System.out.println("Nama Panggilan : " + namaPanggilan);
        System.out.println("Asal           : " + asal);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("NIM            : " + nim);
        System.out.println("Fakultas       : " + fakultas);
        System.out.println("Program Studi  : " + prodi);
        System.out.println("Hobi           : " + hobi);

        System.out.println("\nTerima kasih sudah mengisi biodata! ehehehe");
    }
}