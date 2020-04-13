/*If two numbers are such that the sum of the perfect divisors of one number is equal to the other number and the 
 * sum of the perfect divisors of the other number is equal to the first number, then the numbers are called
 * Amicable Numbers.*/
public class Amicable {

	public static void main(String[] args) {
		int num1 = NumberOperations.inputNumber();
		int num2 = NumberOperations.inputNumber();
		if(NumberOperations.sumOfPerfectDivisors(num1) == num2 && NumberOperations.sumOfPerfectDivisors(num1) == num2) {
			System.out.println("Amicable numbers");
		}
		else {
			System.out.println("Not amicable numbers");
		}
	}
}