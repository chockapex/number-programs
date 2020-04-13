
public class Happy {

	public static void main(String[] args) {
		int num = NumberOperations.inputNumber();
		int res = NumberOperations.sumOfSquaresOfDigits(num);
		int ct = 0;
		while(res != 1 && ct < 10) {
			res = NumberOperations.sumOfSquaresOfDigits(res);
			ct++;
		}
		if(res == 1) {
			System.out.println("Happy number");
		}
		else {
			System.out.println("Processed 10 times - Not a happy number");
		}
	}
}
