public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }
    public static void sayiBulmaca(){

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
                mesajVer("Aranan Sayı Bulundu : " + aranacak);
            } else
                mesajVer("Sayı Bulunamadı : " + aranacak);

        }
        public static void mesajVer(String mesaj){
            System.out.println(mesaj);

        }
    }

