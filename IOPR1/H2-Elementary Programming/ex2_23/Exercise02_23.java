package ex2_23;

public class Exercise02_23 {
//  moet nog gefixt worden 
	public static void main(String[] args) {

		char x = 'x';

		int cast = (int) x;

		int code = String.valueOf(x).codePointAt(0);

		char again = (char) code;

		System.out.printf("x = %s  cast = %d  codePoint = %d  again = %s%n", x,
				cast, code, again);
	}

}
