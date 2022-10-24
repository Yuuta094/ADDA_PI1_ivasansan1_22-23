package Tests;

import java.util.List;
import java.util.stream.Collectors;
import us.lsi.geometria.Punto2D;


public class TestE3 {	
	public static void main(String[] args) {
	
		for (int i = 1; i < 4; i++) {
			// Ruta de los datos
			String file1 = "datos/PI1Ej3DatosEntrada" + i + "A.txt";
			String file2 = "datos/PI1Ej3DatosEntrada" + i + "B.txt";
			
			// Tama�o de las listas  //el tama�o del primer fichero es 10, si la suma de tama�o dividido entre 3 no da 10 esta mal el tama�o
			Integer tam = (ejercicio3.RecursivaFinalE3.Ejercicio3_recFinal(file1,file2).size() + 
						   ejercicio3.IterarivaE3.Ejercicio3_iterativa(file1, file2).size() + 
					       ejercicio3.FuncionalE3.Ejercicio3_Funcional(file1, file2).size())/3;
			
			// Solucion de los ejercicios
			List<Punto2D> listaOrdenadaRec_Final = ejercicio3.RecursivaFinalE3.Ejercicio3_recFinal(file1,file2);
			List<Punto2D> listaOrdenadaIterativa = ejercicio3.IterarivaE3.Ejercicio3_iterativa(file1,file2);
			List<Punto2D> listaOrdenadaFuncional = ejercicio3.FuncionalE3.Ejercicio3_Funcional(file1,file2);
			
			//Tama�o de la lista
			System.out.println("Test " + i + ": Los siguientes " + tam+ " puntos: ");
			
			// Recursiva_Final
			System.out.println("Sol Rec_Final");
			System.out.println(listaOrdenadaRec_Final);

			// Iterativa
			System.out.println("Sol Iterativa");
			System.out.println(listaOrdenadaIterativa);

			// Funcional
			System.out.println("Sol Funcional");
			System.out.println(listaOrdenadaFuncional + "\n\n");

		}
	}
}
