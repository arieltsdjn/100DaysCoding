import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai awal: ");
        int nilai = input.nextInt();

        System.out.print("Masukkan bonus nilai: ");
        int bonus = input.nextInt();

        System.out.print("Apakah kamu sering terlambat? (true/false): ");
        boolean terlambat = input.nextBoolean();
        
        nilai += bonus; 
        
        nilai++; 
        
        if (terlambat) {
            nilai--;
            System.out.println("Kamu terlambat, nilai dikurangi 1.");
        }
        
        boolean lulus = (nilai >= 70 && nilai <= 100);
        
        if (lulus) {
            System.out.println("Selamat! Kamu dinyatakan LULUS.");
        } else {
            System.out.println("Maaf, kamu BELUM LULUS.");
        }
        
        System.out.println("Nilai akhir kamu: " + nilai);

        input.close();
    }
}