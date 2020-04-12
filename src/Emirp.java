
public class Emirp {

	public static void main(String[] args) {
		int num = NumberOperations.inputNumber();
		if(Prime.isPrime(num) && Prime.isPrime(NumberOperations.reverseDigits(num))) {
			System.out.println("Emirp number");
		}
		else {
			System.out.println("Not a emirp number");
		}
	}
}