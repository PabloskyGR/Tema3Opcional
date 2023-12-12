package ejercicio4;

public class FuncionRecursiva {

	// Método para calcular el sumatorio de los números hasta un determinado valor
	static int sumatorio(int numero) {
		int res = 0;

		for (int i = 1; i <= numero; i++) {
			res += i;
		}

		return res;
	}

	// Método para calcular la potencia de un número
	static double potencia(double a, int n) {
		double res;

		res = Math.pow(a, n);

		return res;
	}

	// Método para calcular el número de la serie Fibonacci
	static int serieFibonacci(int numero) {
		int res;

		if (numero <= 1) {
			return numero;
		} else {
			res = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
			return res;
		}
	}
}
