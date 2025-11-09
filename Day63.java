import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int total = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            total*=i;
        }
        System.out.println("Total: "+total);
    }
}