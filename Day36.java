import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai kamu: ");
        int nilai = input.nextInt();

        if (nilai >= 60) {
            System.out.println("Lulus");
            if (nilai >= 90) {
                System.out.println("Dengan Predikat: Istimewa");
            }
        } else {
            System.out.println("Tidak Lulus");
        }

        input.close();
    }
}