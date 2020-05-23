public class Main {

	public static void main(String[] args) {
		int number = 34;
		int remainder = number % 2;
		int remainder1 = number % 3;
		int remainder2 = number % 5;
		int remainder3 = number % 7;
		boolean isPrime = true;

		if(number==1){
			System.out.println("Sayı asal değildir");
			return;
		}

		if(number<1){
			System.out.println("Geçersiz Sayı");
			return;
		}

		for (int i = 2; i < number; i++) {
			if(number % i == 0){
				isPrime = false;
			}

		}
		if(isPrime){
			System.out.println("Sayi Asaldır");
		}else{
			System.out.println("Sayi Asal Değildir");
		}
	}
}
