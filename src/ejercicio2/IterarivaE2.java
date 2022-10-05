package ejercicio2;

public class IterarivaE2 {
	
	public static Integer Ejercicio2_Iterativo (Integer a, Integer b, String s) {
		
		Integer ac = 0; //acumulador
		Integer i = 0; //secuencia   no se como meter un while 
		
		while(i<  s.length()) {
		if(s.length()==0) {
			ac= a*a + b*b;
		} 
		else if (a < 2 || b < 2) {
			ac= s.length() + a + b;
			
		}
		else if (a % s.length() < b % s.length()) {
		
     		ac= a + b + ac;
     		
     		s= s.substring(a%s.length(),b%s.length());
     		a = a-1;
			b= b/2;
		}
		else {		
			ac= a * b + ac;
			
			s= s.substring(b%s.length(),a%s.length());
			a = a/2;
			b = b-1;
		 }
		i++;
		}
		return ac;
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
