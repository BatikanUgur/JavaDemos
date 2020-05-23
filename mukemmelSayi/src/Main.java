public class Main {

    public static void main(String[] args) {
        //6 bölenleri 1+2+3==6
        int number = 28;
        int mukemmel = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                mukemmel = mukemmel + i;
            }

        }
        if (mukemmel == number) {
            System.out.println("Sayı Mükemmel Sayıdır.");
        } else {
            System.out.println("Sayı Mükemmel Değildir.");
        }
    }
}
