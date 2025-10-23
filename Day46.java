import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("====== PASAR GELAP ======\nmenu yang tersedia:\n1. narkotika\n2. ganja\n3. AK-47\n4. granat\n5. sianida\n=========================\nmau yang mana? pilih satu aja:  ");
        int menu = s.nextInt();
        String pilih = switch (menu) {
            case 1 ->
                "narkotika";
            case 2 ->
                "ganja";
            case 3 ->
                "AK-47";
            case 4 ->
                "granat";
            case 5 ->
                "sianida";
            default ->
                "pilihan tidak valid";
        };
        if (menu==1||menu==2||menu==3||menu==4||menu==5) {
            System.out.println("\nanda memilih " + pilih + ".\nselanjutnya, silahkan atur jadwal & lokasi pertemuan untuk diskusi harga dan mengambil pesanan anda.\ncp. 081234567890");
        } else {
            System.out.println(pilih);
        }
    }
}
