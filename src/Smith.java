/*A  Smith number is a composite number, the sum of whose digits is the sum of the digits of its prime factors 
 * obtained as a result of prime factorisation (excluding 1). The first few such numbers are 4, 22, 27, 58 …………
 * */
public class Smith {

	public static void main(String[] args) {
		int num = NumberOperations.inputNumber();
		int n = num, sumOfDigitsOfPrimeFactors = 0;
		for(int i = 2 ; i <= n ; i++) {
			if(n <= 1 || i == num) {
				break;
			}
			if(n % i == 0) {
				if(i > 9) {
					sumOfDigitsOfPrimeFactors += NumberOperations.sumOfDigits(i);
				}
				else {
					sumOfDigitsOfPrimeFactors += i;
				}
				n /= i;
				i = 1;
			}
		}
		int sumOfDigits = NumberOperations.sumOfDigits(num);
		if(sumOfDigits == sumOfDigitsOfPrimeFactors) {
			System.out.println("Smith number");
		}
		else {
			System.out.println("Not a smith number");
		}
	}
}