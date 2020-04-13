/*A number is said to be a palindrome number when is reverse is equal to the number itself.
 * */
public class Palindrome {

	public static boolean isPalindrome(int num) {
		int n = num, rev = 0;
		while(n > 0) {
			int r = n % 10;
			rev = (rev * 10) + r;
			n /= 10;
		}
		if(num == rev) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		if(isPalindrome(NumberOperations.inputNumber())) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a palindrome number");
		}
	}
}
