package ejercicio4;

public class FuncionRecursiva {
	
	static int sumatorio(int numero) {
		int res = 0;
		
		for(int i = 0; i <= numero; i++) {
			res += i;
		}
		
		return res;
	}
	
	static double potencia(double a, int n) {
		double res;
		
		res = Math.pow(a, n);
		
		return res;
	}
	
	static int serieFibonacci(int numero) {
		int res;
		
		res = (numero = (numero-1) + (numero-2));
		
		return res;
	}

}
