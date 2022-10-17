package ejercicio2;

public class IterarivaE2 {

	public static Integer Ejercicio2_Iterativo(Integer a, Integer b, String s) {

	
		Integer ac = 0; // acumulador

		while (s.length() != 0 && !(a < 2 || b < 2)) { // (hasta que no se cumpla el caso base...)

			if (a % s.length() < b % s.length()) {

				ac = a + b + ac;
				s = s.substring(a%s.length(), b%s.length());
				a = a - 1;
				b = b / 2;
			} else {
				ac = a * b + ac;
				s = s.substring(b%s.length(), a%s.length());
				a = a / 2;
				b = b - 1;
			}
		}
		// (Una vez llegado al caso base, la solución es la operación del caso base)
		
		if (s.length() == 0) {
			ac = a * a + b * b + ac;
		} else {
			ac = s.length() + a + b;
		}
		return ac;
	}
}
