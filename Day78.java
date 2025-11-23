import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = s.nextLine();

        System.out.println("length: " + teks.length());
        System.out.println("isEmpty: " + teks.isEmpty());
        System.out.println("trim: [" + teks.trim() + "]");
        System.out.println("toUpperCase: " + teks.toUpperCase());
        System.out.println("toLowerCase: " + teks.toLowerCase());
        System.out.println("contains(\"a\"): " + teks.contains("a"));

        if (teks.length() >= 5) {
            System.out.println("substring(0,5): " + teks.substring(0, 5));
        } else {
            System.out.println("substring(0,5): teks terlalu pendek");
        }

        System.out.println("replace a->o: " + teks.replace("a", "o"));

        System.out.print("Masukkan teks pembanding: ");
        String banding = s.nextLine();

        System.out.println("equals: " + teks.equals(banding));
        System.out.println("equalsIgnoreCase: " + teks.equalsIgnoreCase(banding));
    }
}