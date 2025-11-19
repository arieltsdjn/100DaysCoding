import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0, angka;
        do {
            angka = s.nextInt();
            if (angka>0) total += angka;
        } while (angka>0);
        System.out.println(total);
    }
}
