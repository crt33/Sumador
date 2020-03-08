
import  java.util.Scanner ;

/**
 * 
 * @author Celia Ruiz
 *
 */

public class CRTFunciona {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		String num = sc.next();
		ASumar suma = new ASumar(num);
		System.out.println(suma.mostrar());
		}
	}