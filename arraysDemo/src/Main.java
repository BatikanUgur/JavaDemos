public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Batıkan";

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Batıkan";
        ogrenciler[3] = "Ceylan";

        for (int i = 0; i < ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }
            System.out.println("-----------------------------------------");
        for(String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }


    }
}
