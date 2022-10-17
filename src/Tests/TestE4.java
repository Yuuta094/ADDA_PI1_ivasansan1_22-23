package Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import us.lsi.common.Files2;

public class TestE4 {
	
	public static void main(String[] args) {
		
		String file= "datos/PI1Ej4DatosEntrada.txt";
		
		List<List<Integer>> datos = lee_fichero(file); 
		
		for (int i= 0; i<datos.size(); i++) { 
			
			Integer a= datos.get(i).get(0);  
			Integer b= datos.get(i).get(1);
			Integer c= datos.get(i).get(2);
			
//Me da error de "Java heap space en la última entrada (60, 50, 40)
			
		String RecSinMemoria = ejercicio4.RecursivaSinMemoriaE4.ejercicio4_RecSinMemoria(a, b, c);
		String RecConMemoria = ejercicio4.RecursivaConMemoriaE4.ejercicio4_RecConMemoria(a, b, c);
		String Iterativa = ejercicio4.IterarivaE4.ejercicio4Iterativo(a, b, c);
		
		System.out.println("Entrada: " + a + ", " + b + ", " + c + "\n" +
						   "ConM: " + RecSinMemoria + "\n" +
						   "SinM: "+ RecConMemoria + "\n" +
						   "Iter: "+ Iterativa + "\n");
		}
	}
	
	public static List<List<Integer>> lee_fichero(String ruta) {
		List<String> lineas = Files2.linesFromFile(ruta);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for (String l: lineas) {
			List<String> num = Arrays.asList(l.split(","));
			List<Integer> ListaNum = List.of(((Integer.parseInt(num.get(0)))),
											  Integer.parseInt(num.get(1)),
											  Integer.parseInt(num.get(2)));
			res.add(ListaNum);
		}
		return res;
	}

}
