import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mu: ");
        String nama = input.nextLine();
        System.out.print("Masukkan umur mu: ");
        int umur = input.nextInt();
        input.nextLine();
        System.out.print("Tulis hobi mu: ");
        String hobi = input.nextLine();
        System.out.println("\nPerkenalkan nama saya " + nama + ", umur saya " + umur + " tahun, " + "dan hobi saya adalah " + hobi + ".");
        input.close();
    }
}