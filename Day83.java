import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[3];
        int hasil = 0;
        for (int i = 0; i < a.length; i++) {
            a[i]=s.nextInt();
            hasil += a[i];
        }
        System.out.println(hasil);
    }
}