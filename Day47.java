import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan angka (1-7):  ");
        int menu = s.nextInt();
        switch (menu) {
            case 1 -> System.out.println("hari pertama adalah senin");
            case 2 -> System.out.println("hari kedua adalah selasa");
            case 3 -> System.out.println("hari ketiga adalah rabu");
            case 4 -> System.out.println("hari keempat adalah kamis");
            case 5 -> System.out.println("hari kelima adalah jumat");
            case 6-> System.out.println("hari keenam adalah sabtu");
            case 7 -> System.out.println("hari ketujuh adalah minggu");
            default -> System.out.println("angka tidak valid");
        }
    }
}
