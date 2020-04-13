/*A number is said to be special number when the sum of factorial of its digits is equal to the number itself.
*/
public class Special {

	public static void main(String[] args) {
		int num = NumberOperations.inputNumber();
		int n = num, sum = 0;
		while(n > 0) {
			int r = n % 10;
			sum += NumberOperations.factorial(r);
			n /= 10;
		}
		if(sum == num) {
			System.out.println("Special number");
		}
		else {
			System.out.println("Not a special number");
		}
	}
}