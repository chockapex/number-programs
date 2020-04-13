/*An armstrong number in a given number base is a number that is the sum of its own digits each
 *  raised to the power of the number of digits.*/
public class Armstrong {

	public static void main(String[] args) {
		int num = NumberOperations.inputNumber();
		int noOfDigits = NumberOperations.noOfDigits(num);
		int n = num, sum = 0;
		while(n > 0) {
			int r = n % 10;
			sum += Math.pow(r, noOfDigits);
			n /= 10;
		}
		if(sum == num) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an armstrong number");
		}
	}
}
