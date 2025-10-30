public class Main {
    public static void main(String[] args) {
        int angka = 1;
        for (int i = 0; i < 5; i++) {
            if (1==3) break;
            System.out.println(i);
        }
        while (angka <= 5) {
            if (angka == 3) break;
            System.out.println(angka);
            angka++;
        }
        switch (angka) {
            case 1 -> {
                break;
            }
        }
    }
}
