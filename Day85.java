public class Main {
    public static void main(String[] args) {
        int max = 0;
        int a[] = {27,39,26,62};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}