import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int a = i.nextInt();
        if (a>0) {
            System.out.println(a+" adalah bilangan positif");
        } else if (a<0) {
            System.out.println(a+" adalah bilangan negatif");
        } else if (a==0){
            System.out.println(a+" adalah bilangan nol");
        }
    }
}
