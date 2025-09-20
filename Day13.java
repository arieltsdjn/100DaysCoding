import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double harga;
        int jumlah;
        double total;

        System.out.print("Masukkan harga barang: ");
        harga = input.nextDouble();

        System.out.print("Masukkan jumlah barang: ");
        jumlah = input.nextInt();

        total = harga * jumlah;

        System.out.printf("\nDetail Belanja:\n");
        System.out.printf("Harga satuan : Rp%.2f\n", harga);
        System.out.printf("Jumlah barang: %d\n", jumlah);
        System.out.printf("Total harga  : Rp%.2f\n", total);

        input.close();
    }
}