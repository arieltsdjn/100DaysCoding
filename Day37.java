import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int a = i.nextInt();
        if (a%2==0) {
            System.out.println(a+" adalah bilangan genap");
        } else if (a%2==1) {
            System.out.println(a+" adalah bilangan ganjil");
        }
    }
}
