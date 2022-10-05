package ejercicio3;

import java.util.List;

import us.lsi.common.List2;
import us.lsi.geometria.Punto2D;
import us.lsi.geometria.Punto2D.Cuadrante;

public class IterarivaE3 {
	
	public static List<Punto2D> Ejercicio3_iterativa(List<Punto2D> ls){
		Integer e = 0; 
		List<Punto2D> ac = List2.empty();
		
		while(e < ls.size()) {
				Punto2D p = ls.get(e);                //el punto que pilla de cada iteración
				if (p.getCuadrante() == Cuadrante.PRIMER_CUADRANTE || p.getCuadrante() == Cuadrante.TERCER_CUADRANTE) {
					ac.add(p);
				}
				e++;
		}
		return ac;
	}
	
}
