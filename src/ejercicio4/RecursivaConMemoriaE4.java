package ejercicio4;

import java.util.Map;

import us.lsi.common.Map2;


public class RecursivaConMemoriaE4 {

	//No me reconoce la clase InTrio de miguel Toro asique la creo aqui
	
	public static record Trio (Integer first, Integer second, Integer third) {
	public static Trio of(Integer first, Integer second, Integer third) {
		return new Trio(first, second, third);
		}
	}
	
	public static String ejercicio4_RecConMemoria(Integer a, Integer b, Integer c) {
		return ejercicio4_RecConMemoria_aux(a, b, c,Map2.empty());
		}
		
	
	public static String ejercicio4_RecConMemoria_aux(Integer a, Integer b, Integer c, Map<Trio, String> map) {
	
		String s = map.get(Trio.of(a, b, c));
		if (s==null) {
			if (a < 2 && b<=2 || c < 2) {
				s= "(" + a.toString() + "+" + b.toString() + "+" + c.toString() +")";	
			}
			else if (a < 3 || b<3 && c <= 3 ) {
				s= "(" + c.toString() + "-" + b.toString() + "-" + a.toString() +")";
			}
			else if(b%a==0 && (a%2 ==0 || b%3 == 0)) {
				s= "(" + ejercicio4_RecConMemoria_aux(a-1, b/a, c-1, map) + "*" + ejercicio4_RecConMemoria_aux(a-2, b/2, c-2,map) + ")";
			}
			else {
				s= "(" + ejercicio4_RecConMemoria_aux(a/2, b-2, c/2,map) + "/" + ejercicio4_RecConMemoria_aux(a/3, b-1, c/3,map) + ")";
			}
			map.put(Trio.of(a, b, c), s);
		}
		return s;
     }
}


