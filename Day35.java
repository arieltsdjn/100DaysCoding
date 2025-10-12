import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int angka = i.nextInt();
        
        if (angka >= 20) {
            System.out.println(angka + " adalah puluhan, dan seterusnya..");
        } else if (angka >= 10) {
            System.out.println(angka + " adalah belasan");
        } else if (angka > 0){
            System.out.println(angka + " adalah satuan");
        } else {
            System.out.println(angka + " bukan satuan, belasan ataupun puluhan");
        }
        
    }
}
