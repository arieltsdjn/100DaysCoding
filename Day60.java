public class Main {
    public static void main(String[] args) {
        int angka = 10;
        for (int i = angka; i >= 1; i--) {
            if (i%2==1) {
                System.out.println(i);
            }
        }
        for (int i = angka; i >= 1; i--) {
            if (i%2==0 ) {
                System.out.println(i);
            }
        }
    }
}
