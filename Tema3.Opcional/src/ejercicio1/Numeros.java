package ejercicio1;

public class Numeros {

	// Atributo que guarda el número
	int numero;

	// Constructor por defecto
	public Numeros() {
	}

	// Constructor con parámetro
	public Numeros(int numero) {
		this.numero = numero;
	}

	// Método para comprobar si el número es primo
	boolean esPrimo() {
		boolean res = true;

		// Si el número es menor o igual a 1, no es primo
		if (numero <= 1) {
			res = false;
		} else {
			// Comprobamos si el número es divisible por algún número hasta su raíz cuadrada
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					res = false; // Si es divisible, no es primo
					break;
				}
			}
		}
		return res;
	}

	// Método para comprobar si el número es capicúa
	boolean esCapicua() {
		boolean res;
		int numCopia = numero;
		int numInver = 0;
		int cifra;

		// Invertimos el número
		while (numCopia != 0) {
			cifra = numCopia % 10;
			numInver = numInver * 10 + cifra;
			numCopia = numCopia / 10;
		}

		// Comprobamos si el número invertido es igual al número original
		if (numero == numInver) {
			res = true; // Si son iguales, es capicúa
		} else {
			res = false; // Si no son iguales, no es capicúa
		}

		return res;
	}
}
