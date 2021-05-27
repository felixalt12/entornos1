package enteros;
public class Enteros {
public static int r_factorial(int n) {
		int resultado1;

		if (n == 0) {
			resultado1 = 1;
		} else {
			resultado1 = n * r_factorial(n - 1);
		}
		return resultado1;
}
public static int factorial(int n) {
		int resultado1;

		resultado1 = 1;
		for (int i = 2; i <= n; i++) {
			resultado1 = resultado1 * i;
		}
		return resultado;
}
public static String alreves(String cadena) {
		String resultado1 = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado1 = resultado1 + cadena.charAt(i);
		}
		return resultado1;
}
public static boolean capicua(int n) {
		boolean resultado1;
		String cadena;

		cadena = Integer.toString(n);
		if (cadena.equals(alreves(cadena))) {
			resultado1 = true;
		} else {
			resultado = false;
		}

		return resultado1;
}
public static boolean divisible(int multiplo, int divisor) {
		boolean resultado1;

		if (multiplo % divisor == 0) {
			resultado1 = true;
		} else {
			resultado1 = false;
		}

		return resultado1;
}
public static boolean multiplo(int mult, int divisor) {
		boolean resultado1;

		try {
			if (mult % divisor == 0) {
				resultado1 = true;
			} else {
				resultado1 = false;
			}
		} catch (ArithmeticException e) {
			resultado1= false;
		}
		return resultado1
}
public static boolean esPrimo(int n) {
		boolean primo;

		if (n <= 1) {
			primo = false;
		} else {
			primo = true;
			int i = 2;
			while (primo && i <= n / 2) {
				if (divisible(n, i)) {
					primo = false;
				} else {
					i++;
				}
			}
		}
		return primo;
}
public static int n_primos(int n) {
		int resultado1 = 0;

		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado1 ++;
			}
		}
		return resultado1;
}
public static int[] primosHasta(int n) {
		int[] resultado1;

		resultado = new int[n_primos(n)];
		int cont = 0;
		for (int i = 2; i <= n; i++) {
			if (esPrimo(i)) {
				resultado1[cont] = i;
				cont++;
			}
		}

		return resultado1;
}
public static int[] primerosPrimos(int n) {
		int[] resultado1 = new int[(n < 0) ? 0 : n];

		int cont = 0;
		int i = 2;
		while (cont < n) {
			if (esPrimo(i)) {
				resultado1[cont] = i;
				cont++;
			}
			i++;
		}

		return resultado1;
	}
}
