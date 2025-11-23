public class Main {
    public static void main(String[] args) {
        String teks = "   Aku Suka Java   ";
        String trim = teks.trim();
        System.out.println(trim);
        String sub = trim.substring(4);
        System.out.println(sub);
        String replace = sub.replace("Java", "Jawa");
        System.out.println(replace);
    }
}