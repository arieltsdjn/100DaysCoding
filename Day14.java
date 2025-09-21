public class Main {
    public static void main(String[] args) {
        String anu = "123";
        String anuanu = "45.67";
        String anuanuanu = "true";

        // String ke int
        int angka = Integer.parseInt(anu);
        System.out.println("String ke int: " + angka);

        // String ke double
        double desimal = Double.parseDouble(anuanu);
        System.out.println("String ke double: " + desimal);

        // String ke boolean
        boolean kondisi = Boolean.parseBoolean(anuanuanu);
        System.out.println("String ke boolean: " + kondisi);
    }
}