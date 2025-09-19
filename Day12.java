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

        System.out.print("Masukkan IPK kamu: ");
        double ipk = input.nextDouble();
        input.nextLine();

        System.out.print("Hobi kamu apa aja? ");
        String hobi = input.nextLine();

        // Tampilan biodata rapi
        System.out.println("\n===================================");
        System.out.println("           BIODATA KAMU            ");
        System.out.println("===================================");

        System.out.printf("%-15s : %s%n", "Nama Panjang", namaPanjang);
        System.out.printf("%-15s : %s%n", "Nama Panggilan", namaPanggilan);
        System.out.printf("%-15s : %s%n", "Asal", asal);
        System.out.printf("%-15s : %d tahun%n", "Umur", umur);
        System.out.printf("%-15s : %s%n", "NIM", nim);
        System.out.printf("%-15s : %s%n", "Fakultas", fakultas);
        System.out.printf("%-15s : %s%n", "Program Studi", prodi);
        System.out.printf("%-15s : %.2f%n", "IPK", ipk);
        System.out.printf("%-15s : %s%n", "Hobi", hobi);

        System.out.println("===================================");
        System.out.println("Terima kasih sudah mengisi biodatanya ehehehe");
    }
}