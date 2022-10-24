package ejercicio3;

import java.util.Iterator;
import java.util.List;

import us.lsi.common.List2;
import us.lsi.geometria.Punto2D;
import us.lsi.geometria.Punto2D.Cuadrante;

public class FuncionalE3 {

	public static List<Punto2D> Ejercicio3_Funcional(String file1, String file2) {
		List<Punto2D> ac = List2.empty();
		Iterator<Punto2D> it = ejercicio3.Iterator_E3.iterador(file1);
		Iterator<Punto2D> it2 = ejercicio3.Iterator_E3.iterador(file2);
		
		it.forEachRemaining(p -> {
			if (p.getCuadrante() == Cuadrante.PRIMER_CUADRANTE || p.getCuadrante() == Cuadrante.TERCER_CUADRANTE) {
				ac.add(p);
			}
		});
		it2.forEachRemaining(p -> {
			if (p.getCuadrante() == Cuadrante.PRIMER_CUADRANTE || p.getCuadrante() == Cuadrante.TERCER_CUADRANTE) {
				ac.add(p);
			}
		});
		
		return ac.stream().sorted().toList();

	}
}
