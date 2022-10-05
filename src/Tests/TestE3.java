package Tests;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import java.util.stream.Collectors;


import us.lsi.geometria.Punto2D;
import us.lsi.streams.Stream2;

public class TestE3 {

	//HAY QUE HACER LA UNION DE LOS DATOS CON UN ITERADOR NO CON LISTAS PERO SE QUE ME DA BIEN LA SOLUCI�N
	public static void main(String[] args) {

		
		
		//Funci�n de parseo
		Function <String,Punto2D> parseoPuntos= s->{
			String[]v =s.split(",");
			return Punto2D.of(Double.valueOf(v[0]),Double.valueOf(v[1]));
			};
		
		for (int i=1; i<4;i++) {	
		//Ruta de los datos
		String file = "datos/PI1Ej3DatosEntrada" + i +"A.txt";
		String file2 = "datos/PI1Ej3DatosEntrada" + i +"B.txt";
		List<Punto2D> ls = Stream2.file(file).map(parseoPuntos).collect(Collectors.toList());
		List<Punto2D> ls2 = Stream2.file(file2).map(parseoPuntos).collect(Collectors.toList());

	//Tama�o de las listas	
		Integer tama�oRec_Final = ejercicio3.RecursivaFinalE3.Ejercicio3_recFinal( merge(ls, ls2) ).size();
		Integer tama�oIterativa = ejercicio3.IterarivaE3.Ejercicio3_iterativa( merge(ls, ls2) ).size();
	//Solucion de los ejercicios	
		List<Punto2D> listaOrdenadaRec_Final = ejercicio3.RecursivaFinalE3.Ejercicio3_recFinal( ( merge(ls, ls2) ).stream().sorted().collect(Collectors.toList())); 
		List<Punto2D> listaOrdenadaIterativa = ejercicio3.IterarivaE3.Ejercicio3_iterativa( merge(ls, ls2) ).stream().sorted().collect(Collectors.toList());
	
		//Recursiva_Final
		System.out.println("Test "+ i +": Los siguientes " + tama�oRec_Final + " puntos: " );
		System.out.println(listaOrdenadaRec_Final + "\n");
		//Iterativa
//		System.out.println("Test "+ i +": Los siguientes " + tama�oIterativa + " puntos: " );
//		System.out.println(listaOrdenadaIterativa + "\n");
			}
	}
	
	
	//M�todo para unir listas
	public static List<Punto2D> merge(List<Punto2D> list1, List<Punto2D> list2)
	{
	    List<Punto2D> list = new ArrayList<>();
	 
	    list.addAll(list1);
	    list.addAll(list2);
	 
	    return list;
	}
	
}
