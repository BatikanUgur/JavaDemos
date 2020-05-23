public class Main {

    public static void main(String[] args) {
	    //for
        for(int i =2; i<10; i+=2){
            System.out.println(i);

        }
        System.out.println("For Döngüsü Bitti");
        int i=2;
        //While
        while (i<10){
            System.out.println(i);
            i+=2;

        }

        System.out.println("While Döngüsü Bitti");
        int j = 1;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}//Do-While şart uymasa bile 1 kere çalışır, while da hiç çalışmaz.
