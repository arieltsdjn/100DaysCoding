import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan angka:  ");
        int angka = s.nextInt();
        System.out.println((angka%2==0) ? "genap":"ganjil");
        }
    }
