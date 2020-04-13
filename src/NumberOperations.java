import java.util.Scanner;

public class NumberOperations {
	
	public static int inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
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
	
	public static int noOfDigits(int num) {
		int nod = 0;
		while(num > 0) {
			nod++;
			num /= 10;
		}
		return nod;
	}
	
	public static int factorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}
		else if(num > 1){
			return num*factorial(num-1);
		}
		return 0;
	}
	
	public static boolean isNoInFibo(int a, int b, int num) {
		int c = a + b;
		if(c > num) {
			return false;
		}
		if(c == num) {
			return true;
		}
		else {
			return isNoInFibo(b, c, num);
		}
	}
	
	public static int sumOfPerfectDivisors(int num) { // Excluding the number itself
		int sumOfPerfectDivisors = 0;
		for(int i = 1 ; i <= num/2 ; i++) {
			if(num % i == 0) {
				sumOfPerfectDivisors += i;
			}
		}
		return sumOfPerfectDivisors;
	}
	
	public static int sumOfSquaresOfDigits(int num) {
		int sum = 0;
		while(num > 0) {
			int r = num % 10;
			sum += Math.pow(r, 2);
			num /= 10;
		}
		return sum;
	}
}