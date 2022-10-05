package Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import us.lsi.common.Files2;

public class TestE2 {

	public static void main(String[] args) {

		//Ruta del ficheros
				String file = "datos/PI1Ej2DatosEntrada.txt";
			
				List<List<String>> datos = lee_fichero(file); 
		
				
				for (int i= 0; i<datos.size();i++) { 
					
					String a= String.format("%s", datos.get(i).get(0));  
					String b= String.format("%s", datos.get(i).get(1));
					
				Integer rec_noFinal =  ejercicio2.RecursivaNoFinalE2.Ejercicio2_NoFinal(Integer.parseInt(a), Integer.parseInt(b), datos.get(i).get(2));
				Integer rec_Final =    ejercicio2.RecursivaFinalE2.Ejercicio2_Final(Integer.parseInt(a), Integer.parseInt(b), datos.get(i).get(2));
				Integer iterativa =    ejercicio2.IterarivaE2.Ejercicio2_Iterativo(Integer.parseInt(a), Integer.parseInt(b), datos.get(i).get(2));
			
				List<String> entrada = datos.get(i);
		System.out.printf("Entrada: "+ entrada+"\n" + "Recursiva No Final \t\t%d\n" + 
													  "Recursiva Final \t\t%d\n" + 
													  "Iterativa \t\t\t%d\n"+
													  "Funcional \t\t\t\t\n\n", 
													  rec_noFinal  ,rec_Final, iterativa); 
		}
	
	}
	
	
	
	
	public static List<List<String>> lee_fichero(String ruta) {
		List<String> lineas = Files2.linesFromFile(ruta);
		List<List<String>> res = new ArrayList<List<String>>();
		for (String l: lineas) {
			List<String> num = Arrays.asList(l.split(","));
			List<String> ListaNum = List.of(((num.get(0))),
											  (num.get(1)),
											  (num.get(2)));
			res.add(ListaNum);
		}
		return res;
	}
}
