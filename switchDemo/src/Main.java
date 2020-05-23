public class Main {

    public static void main(String[] args) {
        char grade = 'Q';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel");
                break;
            case 'B':
                System.out.println("Güzel");
                break;
            case 'C':
                System.out.println("İyi");
                break;
            case 'D':
                System.out.println("İdare Eder");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");

        }
    }
}
