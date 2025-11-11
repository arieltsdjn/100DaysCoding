public class Main {
    public static void main(String[] args) {
        int angka = 5;
        int hasil = 1;
        for (int i = 1; i <= angka; i++) {
            hasil *= i;
        }
        System.out.println("faktorial dari " + angka + " adalah: " + hasil);
    }
}
