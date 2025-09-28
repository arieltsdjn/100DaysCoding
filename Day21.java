public class Main {
    public static void main(String[] args) {
        int a = 96;
        int b = 69;

        System.out.println("Sebelum tukar: a = " + a + ", b = " + b);

        // Proses tukar tanpa temp
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sesudah tukar: a = " + a + ", b = " + b);
    }
}