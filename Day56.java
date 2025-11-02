import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String opsi = "yes";
        do {
            System.out.print("lanjut? (yes/no): ");
            opsi = s.nextLine();
        } while (opsi.equals("yes"));
        System.out.println("yaudah");
    }
}
