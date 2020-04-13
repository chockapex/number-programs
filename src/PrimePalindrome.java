
public class PrimePalindrome {

	public static void main(String[] args) {
		int num = NumberOperations.inputNumber();
		if(Prime.isPrime(num) && Palindrome.isPalindrome(num)) {
			System.out.println("Prime palindrome number");
		}
		else {
			System.out.println("Not a prime palindrome number");
		}
	}
}
