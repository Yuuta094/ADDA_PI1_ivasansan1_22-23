package ejercicio2;

public class RecursivaNoFinalE2 {

	
	public static Integer Ejercicio2_NoFinal (Integer a, Integer b, String s) {
		
		Integer res= 0;
		
		if(s.length()==0) {
			res= a*a + b*b;
		} 
		else if (a < 2 || b < 2) {
			res= s.length() + a + b;
		}
		else if (a % s.length() < b % s.length()) {
			res= a + b + Ejercicio2_NoFinal(a-1, b/2, s.substring(a%s.length(),b%s.length()));
		}
		else {
			res= a * b + Ejercicio2_NoFinal(a/2, b-1, s.substring(b%s.length(),a%s.length()));
		}
			 
		return res;
	}
}
