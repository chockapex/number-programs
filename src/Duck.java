/*A Duck number is a number which has zeroes present in it, but there should be no zero present in
 *  the beginning of the number. 
 * */
import static java.lang.System.out;
import java.util.Scanner;
public class Duck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		sc.close();
		if(!num.startsWith("0") && num.contains("0")) {
			out.println("Duck number");
		}
		else {
			out.println("Not a duck number");
		}
	}
}
