/* A number whose sum of its digits powered with their respective position is equal to the original number.
 * */
public class Disarium {

	public static void main(String[] args) {
		int num = NumberOperations.inputNumber();
		int noOfDigits = Integer.toString(num).length();
		int n = num, sum = 0;
		while(n > 0) {
			int r = n % 10;
			sum += Math.pow(r, noOfDigits--);
			n /= 10;
		}
		if(num == sum) {
			System.out.println("Disarium number");
		}
		else {
			System.out.println("Not a disarium number");
		}
	}
}