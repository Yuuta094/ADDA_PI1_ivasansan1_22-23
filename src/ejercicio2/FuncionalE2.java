package ejercicio2;

import java.util.stream.Stream;



public class FuncionalE2 {
	
	// Función hecha en clase de practicas
	public static record Tupla(Integer a, Integer b, String s, Integer ac) {
		// Constructor
		public static Tupla of(Integer a, Integer b, String s, Integer ac) {
			return new Tupla(a, b, s, ac);
		}

		// Inicializador
		public static Tupla first(Integer a, Integer b, String s) {
			return of(a, b, s, 0);
		}

		// Actualizador
		public Tupla next() {
			// (equivale el caso recursivo)
			if (a % s.length() < b % s.length()) {
				return of(a-1, b/2, s.substring(a%s.length(), b%s.length()), ac+a+b);
			} else {
				return of(a/2, b-1, s.substring(b%s.length(), a%s.length()), ac+a*b);
			}
		}
	}
	
	public static Integer Ejercicio2_Funcional(Integer a, Integer b, String s) {
		
		Tupla t= Stream.iterate(Tupla.first(a, b, s), e-> e.next())
				.filter(e-> e.s().length() == 0 || e.a() < 2 || e.b() < 2)
				.findFirst()
				.get();//Resultado de la parte recursiva
				
		//Construir el resultado del caso base
		if (t.s().length()==0) {
			return t.a() * t.a() + t.b() * t.b() + t.ac();
		}
		else {
		return t.s().length() +t.a() + t.b() + t.ac();
		}
	}
}
