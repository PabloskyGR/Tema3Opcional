package ejercicio2;

public class Esfera {

	// Atributo para guardar el radio de la esfera
	double radio;

	// Constructor sin parámetros
	public Esfera() {
	}

	// Constructor con parámetros
	public Esfera(double radio) {
		this.radio = radio;
	}

	// Método para calcular la superficie de la esfera
	double superficie() {
		double res;

		// Fórmula de la superficie de la esfera
		res = (4 * Math.PI) * (Math.pow(radio, 2));

		return res;
	}

	// Método para calcular el volumen de la esfera
	double volumen() {
		double res;

		// Fórmula del volumen de la esfera
		res = ((4 * Math.PI) / 3) * (Math.pow(radio, 2));

		return res;
	}

}
