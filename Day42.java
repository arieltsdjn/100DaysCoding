import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan gaji pokok: ");
        double gaji = s.nextDouble();
        System.out.print("masukkan jumlah anak (kalau >3, tunjangan 5%): ");
        double anak = s.nextDouble();
        System.out.print("masukkan pajak (%): ");
        double pajak = s.nextDouble()/100;
        double total = 0;
        if (anak>=3) total = gaji+(gaji*0.05);
        else total = gaji;
        System.out.printf("gaji bersih: Rp%.2f", total-(total*pajak));
    }
}
