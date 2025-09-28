public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("Sebelum tukar: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sesudah tukar: a = " + a + ", b = " + b);
    }
}