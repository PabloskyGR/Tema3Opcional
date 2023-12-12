package ejercicio2;

public class Esfera {

	double radio;

	public Esfera() {
	}

	public Esfera(double radio) {
		this.radio = radio;
	}
	
	double superficie() {
		double res;
		
		res = (4 * Math.PI) * (Math.pow(radio, 2));
		
		return res;
	}
	
	double volumen() {
		double res;
		
		res = ((4 * Math.PI) / 3) * (Math.pow(radio, 2));
		
		return res;
	}

}
