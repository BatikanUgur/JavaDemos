public class Main {

    public static void main(String[] args) {
        //double [] mylist = new double[4];
        double[] myList = {1.2, 3.4, 5.6, 7.8};
        double total = 0;
        double max = myList[0];

        for (double liste : myList) {
            if (max < liste) {
                max = liste;
            }
            total = total + liste;
            System.out.println(liste);
        }
        System.out.println("Toplam = " + total);
        System.out.println("En büyük sayı = " + max);
    }
}
