package ejercicio3;

import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import us.lsi.common.Files2;
import us.lsi.common.List2;
import us.lsi.geometria.Punto2D;
import us.lsi.streams.Stream2;

public class Iterator_E3 {
	
	public static Iterator<Punto2D> iterador(String file) {
		Function<String, Punto2D> parseoPuntos = s -> {
			String[] v = s.split(",");
			Double x = Double.valueOf(v[0]);
			Double y = Double.valueOf(v[1]);
			return Punto2D.of(x, y);
		};

		return Files2.streamFromFile(file)
				.map(parseoPuntos)
				.iterator();
	}
	
}

