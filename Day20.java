public class Main {
    public static void main(String[] args) {
        int angka = 123;
        
        String s1 = Integer.toString(angka);
        System.out.println("Integer.toString: " + s1);
        
        String s2 = String.valueOf(angka);
        System.out.println("String.valueOf   : " + s2);
    }
}