public class Main {
    public static void main(String[] args) {
        int[] angka = {45, 76, 23, 14, 78};
        int min = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println(min);
    }
}
