import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("masukkan angka 1: ");
        double a = i.nextDouble();
        System.out.print("==== operator ====\na. tambah\nb. kurang\nc. kali\nd. bagi\ne. modulus/sisa bagi\n================\npilih operator: ");
        char op = i.next().charAt(0);
        System.out.print("masukkan angka 2: ");
        double b = i.nextDouble();
     
        double hasil=0;
        if (op=='a') {
            hasil=a+b;
            System.out.printf("hasil: %.2f\n",hasil);
        } else if (op=='b') {
            hasil=a-b;
            System.out.printf("hasil: %.2f\n",hasil);
        } else if (op=='c') {
            hasil=a*b;
            System.out.printf("hasil: %.2f\n",hasil);
        } else if (op=='d') {
            hasil=a/b;
            System.out.printf("hasil: %.2f\n",hasil);
        } else if (op=='e') {
            hasil=a%b;
            System.out.printf("hasil: %.2f\n",hasil);
        }
       
        
    }
}
