//An automorphic number is a number which is present in the last digit(s) of its square.
public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = NumberOperations.inputNumber();
		String n = Integer.toString(num);
		String nsquare = Integer.toString((int)Math.pow(num, 2));
		if(nsquare.endsWith(n)) {
			System.out.println("Automorphic number");
		}
		else {
			System.out.println("Not a automorphic number");
		}
	}
}