
public class Harshad {

	public static void main(String[] args) {
		int num = NumberOperations.inputNumber();
		if(num % NumberOperations.sumOfDigits(num) == 0) {
			System.out.println("Harshad number");
		}
		else {
			System.out.println("Not a harshad number");
		}
	}
}