import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int nilai = s.nextInt();
        char predikat = 'E';
        if (nilai>100) System.out.println("nilai tidak valid.");
        else if (nilai>90) predikat='A';
        else if (nilai>80) predikat='B';
        else if (nilai>70) predikat='C';
        else if (nilai>60) predikat='D';
        else if (nilai<50) predikat='E';
        System.out.println("predikat kamu: "+predikat);
    }
}
