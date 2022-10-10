package ejercicio2;

public class IterarivaE2 {
	
	public static Integer Ejercicio2_Iterativo(Integer a, Integer b, String s) {

		Integer ac = 0; // acumulador

		for (int i = 0; i < a+1; i++) {
			for (int j = 0; j < b+1; j++) {
				if (s.length() == 0) {
					ac = i * i + j * j;
					
				} else if (i < 2 || j < 2) {
					ac = s.length() + i + j;

				} else if (i % s.length() < j % s.length()) {
					ac = i + j;

					s = s.substring(i % s.length(), j % s.length());
					i = i - 1;
					j = j / 2;
					
				} else {
					ac = i * j;

					s = s.substring(j % s.length(), i % s.length());
					i = i / 2;
					j = j - 1;
				}
			}
		}
		return ac;
	}
}
