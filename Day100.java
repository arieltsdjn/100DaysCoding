import java.util.*;
public class Main {
    static Integer[] anu;
    static int retas(int[] arr) {
        int n = arr.length, p = 0;
        anu = new Integer[n];
        for (int x : arr) {
            int i = ((x % n) + n) % n;
            while (anu[i] != null) {
                i = (i + 1) % n;
                p++;
            }
            anu[i] = x;
        }
        return p;
    }
    static String susunKode(int p) {
        String s = "";
        for (int i = 0; i < anu.length && s.length() < p; i++) {
            if (anu[i] != null) {
                s += anu[i];
            }
        }
        return s.substring(0, p);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();
        int p = retas(arr);
        System.out.println(susunKode(p));
    }
}
