public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int aranacak = 9;
        boolean varMi = false;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi == true) {
            System.out.println("Aranan Sayı Bulundu");
        } else {
            System.out.println("Sayı Bulunamadı");
        }

    }
}

