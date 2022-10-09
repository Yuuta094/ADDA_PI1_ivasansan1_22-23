package ejercicio4;

import java.util.Map;

import ejercicio4.RecursivaConMemoriaE4.Trio;
import us.lsi.common.Map2;

public class IterarivaE4 {
	
	public static String ejercicio4Iterativo (Integer a, Integer b, Integer c) {
		
		Map<Trio, String> map = Map2.empty();
		String s = map.get(Trio.of(a,b,c));
		
		for (int i=0; i<a+1; i++) {
			for (int j=0; j<b+1;j++) {
				for (int k=0;k<c+1;k++) {
			
			if (i < 2 && j<=2 || k < 2) {
				s= "(" + i + "+" + j + "+" + k +")";	
			}
			else if (i < 3 || j < 3 && k <= 3 ) {
				s= "(" + i + "-" + j + "-" + k +")";
			}
			else if (j%i==0 && (i%2 ==0 || j%3 == 0)) {
				s= "(" + map.get(Trio.of(i-1, j/i, k-1)) + "*" + map.get(Trio.of(i-2, j/2, k-2)) + ")";
			}
			else {
				s= "(" + map.get(Trio.of(i/2, j-2, k/2)) + "/" + map.get(Trio.of(i/3, j-1, k/3)) + ")";
				
						}
				map.put(Trio.of(i, j, k), s);
					}
				}
			}
		
		return s;
	}

 }
