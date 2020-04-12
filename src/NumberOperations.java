import java.util.Scanner;

public class NumberOperations {
	
	public static int inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		return num;
	}

	public static int reverseDigits(int num) {
		int rev = 0;
		while(num > 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num /= 10;
		}
		return rev;
	}
	
	public static int sumOfDigits(int num) {
		int sod = 0;
		while(num > 0) {
			int r = num % 10;
			sod += r;
			num /= 10;
		}
		return sod;
	}
}