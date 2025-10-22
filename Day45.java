import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("pilih menu berikut:\n1. es teh\n2. kopi\n3. susu\nmau yang mana? ");
        int menu = s.nextInt();
        switch (menu) {
            case 1 -> System.out.println("kamu memilih es teh");
            case 2 -> System.out.println("kamu memilih kopi");
            case 3 -> System.out.println("kamu memilih susu");
            default -> System.out.println("pilihan tidak valid");
        }
    }
}
