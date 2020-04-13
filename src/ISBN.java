/* The ISBN is legal if: 1xdigit1 + 2xdigit2 + 3xdigit3 + 4xdigit4 + 5xdigit5 + 6xdigit6 + 7xdigit7 + 
 * 8xdigit8 + 9xdigit9 + 10xdigit10 is divisible by 11.*/
public class ISBN {

	public static void main(String[] args) {
		int num = NumberOperations.inputNumber();
		int sum = 0;
		if(NumberOperations.noOfDigits(num) == 10) {
			int multiplier = 10;
			while(num > 0) {
				int r = num % 10;
				sum += r*multiplier--;
				num /= 10;
			}
		}
		if(sum % 11 == 0 && sum != 0) {
			System.out.println("ISBN number");
		}
		else {
			System.out.println("Not an ISBN number");
		}
	}
}
