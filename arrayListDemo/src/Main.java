import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        //System.out.println("Dizi boyutu = " +sayilar.size());
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        //System.out.println("Dizi boyutu = " +sayilar.size());
        //System.out.println(sayilar.get(2));//elemanı getirme
        //sayilar.set(2,100);
        //System.out.println(sayilar.get(2));//eleman düzeltme
        //sayilar.remove(0);//eleman silme
        //sayilar.clear();// tüm listeyi temizler
        //System.out.println(sayilar.get(0));

        for (Object i: sayilar){
            System.out.println(i);
        }




    }
}
