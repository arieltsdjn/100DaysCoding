import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jum = s.nextInt();
        int tot = 0;
        for (int i = 0; i < jum; i++) {
            int a = s.nextInt();
            if (a>0) tot+=a;
        }
        System.out.println("total: "+tot);
        }
}
