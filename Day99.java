import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 2; i <= n; i++) {
            int hitung = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    hitung++;
                }
            }
            if (hitung == 2) {
                System.out.print(i + " ");
            }
        }
    }
}