public class Main {

    public static void main(String[] args) {
//		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
//		womanGameCalculator.hesapla();
//		womanGameCalculator.gameOver();

		GameCalculator gameCalculator = new WomanGameCalculator();
		gameCalculator.hesapla();
		GameCalculator gameCalculator1 = new ManGameCalculator();
		gameCalculator1.hesapla();
		GameCalculator gameCalculator2 = new KidsGameCalculator();
		gameCalculator2.hesapla();
	}
}
