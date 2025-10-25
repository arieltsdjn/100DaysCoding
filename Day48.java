import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.println("=== Kalkulator Ariel ===");
        System.out.print("masukkan angka pertama: ");
        angka1 = input.nextDouble();

        System.out.print("masukkan operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("masukkan angka kedua: ");
        angka2 = input.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("hasil: " + hasil);
                } else {
                    System.out.println("pembagian dengan nol tidak diperbolehkan!");
                }
                break;
            default:
                System.out.println("operator tidak valid!");
        }

        input.close();
    }
}
