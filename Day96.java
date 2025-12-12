public class Main {
    static int tambah(int a, int b) {
        return a + b;
    }
    static int kurang(int a, int b) {
        return a - b;
    }
    static int kali(int a, int b) {
        return a * b;
    }
    static double bagi(int a, int b) {
        return (double) a / b;
    }
    public static void main(String[] args) {
        int x = 12;
        int y = 4;
        System.out.println(tambah(x, y));
        System.out.println(kurang(x, y));
        System.out.println(kali(x, y));
        System.out.println(bagi(x, y));
    }
}