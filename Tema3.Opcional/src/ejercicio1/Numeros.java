package ejercicio1;

public class Numeros {

	int numero;

	public Numeros() {
	}

	public Numeros(int numero) {
		this.numero = numero;
	}

	boolean esPrimo() {
		boolean res = true;

		if (numero <= 1) {
			res = false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				res = false;
				break;
			}
		}
		return res;
	}

	boolean esCapicua() {
		boolean res;
		int numCopia = 0;
		int numInver = 0;
		int cifra = 0;

		numCopia = numero;

		while (numCopia != 0) {
			cifra = numCopia % 10;
			numInver = numInver * 10 + cifra;
			numCopia = numCopia / 10;
		}
		if (numero == numInver) {
			res = true;
		} else {
			res = false;
		}

		return res;
	}

}
