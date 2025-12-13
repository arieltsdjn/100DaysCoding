import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int anu = s.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < anu; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
