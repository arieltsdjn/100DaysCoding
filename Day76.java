public class Main {
    public static void main(String[] args) {
        String teks = "es teh manis";
        String teks2 = "es teh Manis";
        String teks3 = "";
        if (teks.equals(teks2)) System.out.println("equals");
        else System.out.println("notEquals");
        if (teks.equalsIgnoreCase(teks2)) System.out.println("equalsIgnoreCase");
        if (teks.contains("manis")) System.out.println("contains");
        if (teks3.isEmpty()) System.out.println("isEmpty");
    }
}
