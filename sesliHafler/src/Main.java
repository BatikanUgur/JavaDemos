public class Main {

    public static void main(String[] args) {
        char harf = 'O';

        char[] kalin = {'a', 'ı', 'o', 'u'};
        char[] ince = {'e', 'i', 'ö', 'ü'};

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            default:
                System.out.println("İnce Sesli Harf");
        }

    }
}
