package ejercicio3;


import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import us.lsi.common.List2;
import us.lsi.geometria.Punto2D;
import us.lsi.geometria.Punto2D.Cuadrante;

public class RecursivaFinalE3 {
	
	public static Predicate<Punto2D> filtro = p -> p.getCuadrante() == Cuadrante.PRIMER_CUADRANTE || p.getCuadrante() == Cuadrante.TERCER_CUADRANTE));
	
	public static List<Punto2D> Ejercicio3_recFinal (String file1, String file2){
		Iterator<Punto2D> it = ejercicio3.Iterator_E3.iterador(file1);
		Iterator<Punto2D> it2 = ejercicio3.Iterator_E3.iterador(file2);
		Punto2D p1 = it2.next(); 
		Punto2D p2 = it2.next(); 
		return Ejercicio3_recFinal(file1,file2, List2.empty(),it,it2,p1,p2);
	}
	public static List<Punto2D> Ejercicio3_recFinal (String file1, String file2, List<Punto2D> ac,Iterator<Punto2D> it,Iterator<Punto2D> it2, Punto2D p1, Punto2D p2 ){	
		
		if ((it.hasNext())) {                  			//Minetras que haya un siguiente en el primer iterador de datos...
			if (!(filtro.test(p1))) {						//Si el No pertenece al Cuadrante 
				ac= Ejercicio3_recFinal(file1, file2, ac, it, it2, it.next(), p2);									//Pasa al siguiente
			} else if (it2.hasNext()) {						//Si exixte un siguiente en el segundo iterador...
				if (!(filtro.test(p2))) {						//Si no pertence al Cuadrante
					ac= Ejercicio3_recFinal(file1, file2, ac, it, it2, p1, it2.next());								//Pasa al siguiente
				}
				else if (p1.compareTo(p2) == -1) {		   			//Compara el punto que no pertenece al cuadrante con otro del primer iterador el cual si pertenece
					ac.add(p1);										//Con esto introduccimos todos los putnos negativos(3 Cuadrante)
					ac= Ejercicio3_recFinal(file1, file2, ac, it, it2, it.next(), p2);
					
				} else {
					ac.add(p2);
					ac= Ejercicio3_recFinal(file1, file2, ac, it, it2, p1, it2.next());
				}
			}
			else if (filtro.test(p2)) {					//Los puntos restantes del primer iterador (4 Cuadrante)
				ac.add(p2);										//
			} else {									//De lo contrario
				ac.add(p1);											//Añade el punto del primer iterador 
				ac= Ejercicio3_recFinal(file1, file2, ac, it, it2, it.next(), p2);								
			}
		}
		
		else if (it2.hasNext()) {							//Finalizamos con este bucle que añade los putnos restantes del 4 cuadrante del 2 iterador
			if (filtro.test(p2)) {
				ac.add(p2);
			}
			ac= Ejercicio3_recFinal(file1, file2, ac, it, it2, p1, it2.next());
		}
		else if (filtro.test(p1)) {								//El último punto de cada iterador
			ac.add(p1);
		} else if (filtro.test(p2)) {
			ac.add(p2);
		}
		return ac;
	}
}
