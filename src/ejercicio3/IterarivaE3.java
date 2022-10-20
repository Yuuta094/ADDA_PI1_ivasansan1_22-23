package ejercicio3;

import java.util.Iterator;
import java.util.List;
import us.lsi.common.List2;
import us.lsi.geometria.Punto2D;
import us.lsi.geometria.Punto2D.Cuadrante;

public class IterarivaE3 {
	

	public static List<Punto2D> Ejercicio3_iterativa(String file1, String file2) {

		List<Punto2D> ac = List2.empty();
		Iterator<Punto2D> it = ejercicio3.Iterator_E3.iterador(file1);
		Iterator<Punto2D> it2 = ejercicio3.Iterator_E3.iterador(file2);

		while (it.hasNext()) {
			Punto2D p = it.next(); // el punto que pilla de cada iteración
			if (p.getCuadrante() == Cuadrante.PRIMER_CUADRANTE || p.getCuadrante() == Cuadrante.TERCER_CUADRANTE) {
				ac.add(p);
			}
			while (it2.hasNext()) {
				Punto2D p2 = it2.next(); // el punto que pilla de cada iteración
				if (p2.getCuadrante() == Cuadrante.PRIMER_CUADRANTE
						|| p2.getCuadrante() == Cuadrante.TERCER_CUADRANTE) {
					ac.add(p2);
				}
			}
		}
		return ac;
	}

}
