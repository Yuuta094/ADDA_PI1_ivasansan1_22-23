package ejercicio2;

public class RecursivaFinalE2 {

	
	public static Integer Ejercicio2_Final (Integer a, Integer b, String s) {
		return Ejercicio2_Final(a, b, s, 0);
	}
		
	
	public static Integer Ejercicio2_Final (Integer a, Integer b, String s, Integer ac) {
		
		
		if(s.length()==0) {
			ac= a*a + b*b;
		} 
		else if (a < 2 || b < 2) {
			ac= s.length() + a + b;
		}
		else if (a % s.length() < b % s.length()) {
			
     		ac= a + b + Ejercicio2_Final(a-1, b/2, s.substring(a%s.length(),b%s.length()), ac);
		}
		else {
			ac= a * b + Ejercicio2_Final(a/2, b-1, s.substring(b%s.length(),a%s.length()), ac);
		}
		return ac;
	}
	
}
