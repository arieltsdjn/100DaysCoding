public class Main {
    public static void main(String[] args) {
        int m = 2;
        int n = 4;
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total*=m;
        }
         System.out.println("Hasil dari "+m+" pangkat "+n+": "+total);
    }
}