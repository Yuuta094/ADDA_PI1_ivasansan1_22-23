package ejercicio3;


import java.util.List;

import us.lsi.common.List2;
import us.lsi.geometria.Punto2D;
import us.lsi.geometria.Punto2D.Cuadrante;

public class RecursivaFinalE3 {
	
	public static List<Punto2D> Ejercicio3_recFinal (List<Punto2D> ls){
		return Ejercicio3_recFinal(ls, 0, List2.empty());
	}
	
	public static List<Punto2D> Ejercicio3_recFinal (List<Punto2D> ls, Integer e, List<Punto2D> ac){
		
		
		if (e < ls.size()) {
				Punto2D p = ls.get(e);                //el punto que pilla de cada iteración
				
				if (p.getCuadrante() == Cuadrante.PRIMER_CUADRANTE || p.getCuadrante() == Cuadrante.TERCER_CUADRANTE) {
					ac.add(p);
				}
				ac= Ejercicio3_recFinal(ls, e+1, ac);
		}
		
		return ac;
	}
}
