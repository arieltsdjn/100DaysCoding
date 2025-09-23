public class Main {
    public static void main(String[] args) {
        // Deklarasi
        int a = 10;
        int b = 3;

        // Perkalian
        int kali = a * b;
        System.out.println(a + " * " + b + " = " + kali);

        // Pembagian pakai int, hanya bilangan bulat
        int bagiInt = a / b;
        System.out.println(a + " / " + b + " (int) = " + bagiInt);

        // Pembagian pakai double, ada desimal
        double bagiDouble = (double) a / b; 
        System.out.println(a + " / " + b + " (double) = " + bagiDouble);
    }
}