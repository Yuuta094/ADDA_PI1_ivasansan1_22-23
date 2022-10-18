package Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import us.lsi.common.Files2;
import us.lsi.common.List2;
import us.lsi.streams.Stream2;

public class TestE1 {

	public static void main(String[] args) {
		
		// Ruta del ficheros
		String file = "datos/PI1Ej1DatosEntrada.txt";

		List<List<String>> datos = lee_fichero(file);

		for (int i = 0; i < datos.size(); i++) {
			
			Integer varA = Integer.parseInt(datos.get(i).get(0));
			String varB = datos.get(i).get(1);
			Integer varC = Integer.parseInt(datos.get(i).get(2));
			String varD = datos.get(i).get(3);
			Integer varE = Integer.parseInt(datos.get(i).get(4));

			Map<Integer, List<String>> funcional = ejercicio1.FuncionalE1.ejercicio1_Funcional(varA, varB, varC, varD, varE);
			Map<Integer, List<String>> iterativa = ejercicio1.IterarivaE1.ejercicio1_Iterativo(varA, varB, varC, varD, varE);
			Map<Integer, List<String>> recFinal = ejercicio1.RecursivaFinalE1.ejercicio1_RecFinal(varA, varB, varC, varD, varE);

	
			System.out.print("1)Sol iterativa"+ iterativa +"\n");
			System.out.print("2)Sol RecFinal"+ recFinal +"\n");
			System.out.print("3)Sol Funcional"+ funcional +"\n\n");
		}
	}

	public static List<List<String>> lee_fichero(String ruta) {
		List<String> lineas = Files2.linesFromFile(ruta);
		List<List<String>> res = new ArrayList<List<String>>();
		
		for (String l : lineas) {
			List<String> num = Arrays.asList(l.split(","));
			List<String> ListaNum = List.of(((num.get(0))), (num.get(1)), (num.get(2)), (num.get(3)), (num.get(4)));
			res.add(ListaNum);
		}
		return res;
	}
}


