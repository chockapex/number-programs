/*A  Smith number is a composite number, the sum of whose digits is the sum of the digits of its prime factors 
 * obtained as a result of prime factorisation (excluding 1). The first few such numbers are 4, 22, 27, 58 …………
 * */
public class Smith {

	public static void main(String[] args) {
		int num = NumberOperations.inputNumber();
		int n = num, sumOfDigitsOfPrimeFactors = 0;
		int i = 2;
		while(n > 2) {		
			if(n % i == 0) {
				sumOfDigitsOfPrimeFactors += NumberOperations.sumOfDigits(i);
				n /= i;
			}
			else {
				i++;
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