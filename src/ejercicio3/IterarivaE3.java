package ejercicio3;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import us.lsi.common.List2;
import us.lsi.geometria.Punto2D;
import us.lsi.geometria.Punto2D.Cuadrante;

public class IterarivaE3 {

	public static Predicate<Punto2D> filtro = p -> p.getCuadrante() == Cuadrante.PRIMER_CUADRANTE || p.getCuadrante() == Cuadrante.TERCER_CUADRANTE));

	public static List<Punto2D> Ejercicio3_iterativa(String file1, String file2) {

		List<Punto2D> ac = List2.empty();
		Iterator<Punto2D> it = ejercicio3.Iterator_E3.iterador(file1);
		Iterator<Punto2D> it2 = ejercicio3.Iterator_E3.iterador(file2);
		Punto2D p1 = it.next(); // el punto que pilla de cada iteración
		Punto2D p2 = it2.next();

		while (it.hasNext()) {                  			//Minetras que haya un siguiente en el primer iterador de datos...
			if (!(filtro.test(p1))) {						//Si el No pertenece al Cuadrante 
				p1 = it.next();									//Pasa al siguiente
			} else if (it2.hasNext()) {						//Si exixte un siguiente en el segundo iterador...
				if (!(filtro.test(p2))) {						//Si no pertence al Cuadrante
					p2 = it2.next();								//Pasa al siguiente
				}
				else if (p1.compareTo(p2) == -1) {		   			//Compara el punto que no pertenece al cuadrante con otro del primer iterador el cual si pertenece
					ac.add(p1);											//Con esto introduccimos todos los putnos negativos(3 Cuadrante)
					p1 = it.next();	
				} else {
					ac.add(p2);
					p2 = it2.next();
				}
			}
			else if (filtro.test(p2)) {						//Los puntos restantes del primer iterador (4 Cuadrante)
				ac.add(p2);										//
			} else {										//De lo contrario
				
				ac.add(p1);										//Añade el punto del primer iterador 
				p1 = it.next();									
			}
		}
		
		while (it2.hasNext()) {								// Finalizamos con este bucle que añade los putnos restantes del 4 cuadrante del 2 iterador
			if (filtro.test(p2)) {
				ac.add(p2);
			}
			p2 = it2.next();
		}
		if (filtro.test(p1)) {								//El último punto de cada iterador
			ac.add(p1);
		} else if (filtro.test(p2)) {
			ac.add(p2);
		}
		return ac;
	}
}
