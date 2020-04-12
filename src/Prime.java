
public class Prime {

	public static boolean isPrime(int num) {
		boolean flag = true;
		for(int i = 2 ; i <= num/2 ; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		if((flag && num > 1) || num == 2 || num == 3) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		if(isPrime(NumberOperations.inputNumber())) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
}