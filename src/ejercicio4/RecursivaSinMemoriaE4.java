package ejercicio4;

public class RecursivaSinMemoriaE4 {

	
	public static String ejercicio4_RecSinMemoria (Integer a, Integer b, Integer c) {
		
		String s= "";
		if (a < 2 && b<=2 || c < 2) {
			s= "(" + a.toString() + "+" + b.toString() + "+" + c.toString() +")";	
		}
		else if (a < 3 || b<3 && c <= 3 ) {
			s= "(" + c.toString() + "-" + b.toString() + "-" + a.toString() +")";
		}
		else if(b%a==0 && (a%2 ==0 || b%3 == 0)) {
			s= "(" + ejercicio4_RecSinMemoria(a-1, b/a, c-1) + "*" + ejercicio4_RecSinMemoria(a-2, b/2, c-2) + ")";
		}
		else {
			s= "(" + ejercicio4_RecSinMemoria(a/2, b-2, c/2) + "/" + ejercicio4_RecSinMemoria(a/3, b-1, c/3) + ")";
		}
		return s;
	}
	
}
