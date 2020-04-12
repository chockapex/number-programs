/*	A pronic number, oblong number, rectangular number or heteromecic number, is a number which is the
 *  product of two consecutive integers, that is, n (n + 1). */
public class Pronic {

	public static void main(String[] args) {
		int num = NumberOperations.inputNumber();
		int sqroot = (int) Math.sqrt(num);
		if(sqroot*(sqroot+1) == num) {
			System.out.println("Pronic number");
		}
		else {
			System.out.println("Not a pronic number");
		}
	}
}