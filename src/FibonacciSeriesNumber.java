
public class FibonacciSeriesNumber {

	public static void main(String[] args) {
		int num = NumberOperations.inputNumber();
		if(NumberOperations.isNoInFibo(0, 1, num)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}