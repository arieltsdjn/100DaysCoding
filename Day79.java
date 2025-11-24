import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String akun = "admin123";
        String sandi = "1234";
        do {
            System.out.print("Masukkan username: ");
            String akun1 = s.nextLine();
            System.out.print("Masukkan sandi: ");
            String sandi1 = s.nextLine();
            if (akun1.equals(akun)&&sandi1.equals(sandi)) {
                System.out.println("Selamat datang.");
                break;
            } else {
                System.out.println("Akses ditolak.");
            }
        } while (true);
    }
}
