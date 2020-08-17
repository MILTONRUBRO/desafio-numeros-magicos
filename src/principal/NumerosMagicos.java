package principal;

import java.util.ArrayList;
import java.util.List;

public class NumerosMagicos {

	static List<Integer> numerosMagicos = new ArrayList<>();
	
	public static void percorreLista(List<List<Integer>> numeros) {

		for (int i = 0; i < numeros.size(); i++) {
			calcularNumeros(numeros.get(i));
		}
		
		imprimeNumerosMagicos(numerosMagicos);

	}

	public static void calcularNumeros(List<Integer> list) {
		checarRaizPerfeita(list.get(0), list.get(1));
	}

	public static void checarRaizPerfeita(int inicio, int fim) {

		double raiz = 0;

		for (int i = inicio; i <= fim; i++) {

			raiz = Math.sqrt(i);

			if (((raiz - Math.floor(raiz)) == 0 && ehPrimo((int) raiz))) {
				numerosMagicos.add(i);
			}

		}

	}

	public static boolean ehPrimo(Integer num) {
		
		if(num == 1)
			return false;
					
		if (num % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void imprimeNumerosMagicos(List<Integer> numerosMagicos) {
		System.out.println("Total de numeros magicos " + numerosMagicos.size() + " que sao " + numerosMagicos);
	}

}
