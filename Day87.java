public class Main {
    public static void main(String[] args) {
        int[] angka = {3, 7, 1, 9, 4};
        int target = 7;
        boolean ketemu = false;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == target) {
                System.out.println("Elemen ditemukan di index: " + i);
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Elemen tidak ditemukan.");
        }
    }
}