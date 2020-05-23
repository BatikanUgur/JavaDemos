public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0, 2); //Burada void ile farkı anlatılıyor. Substring bize bir değer döndürdü.
        //String bir değere void atayamazsın.
        // String yeniMesaj = ekle(); diyemezsin çünkü ekle void bir fonksiyondur.
        //String yeniMesaj = topla(); diyemezsin çünkü String bir değer beklenirken fonskiyon int döndürüyor
        // String yeniMesaj = sehirVer(); uygundur.
        System.out.println(yeniMesaj);
        int sayi = topla(5, 7);
        int toplam = topla2(2, 3, 4, 5, 6, 7, 8);
    }

    public static void ekle() {
        System.out.println("Eklendi");


    }

    public static void sil() {
        System.out.println("Silindi");

    }

    public static void guncelle() {
        System.out.println("Güncellendi");

    }

    public static int topla(int sayi1, int sayi2) {

        int sayi = sayi1 + sayi2;
        System.out.println(sayi);

        return sayi;
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        System.out.println(toplam);
        return toplam;
    }

    public static String sehirVer() {

        return "Ankara";
    }


}
