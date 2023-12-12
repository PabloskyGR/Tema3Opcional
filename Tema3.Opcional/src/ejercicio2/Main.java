package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Abrimos el scanner
	static Scanner sc = new Scanner(System.in);

	// Método para mostrar el menú y pedir una opción al usuario
	public static int menu() {
		int opc;

		System.out.println("  - - - - - Menú - - - - - ");
		System.out.println(" | 1. Superficie          |");
		System.out.println(" | 2. Volumen             |");
		System.out.println(" | 0. Salir               |");
		System.out.println("  - - - - - Menú - - - - -  ");
		System.out.println();
		System.out.println("Dime qué quieres hacer:");
		opc = sc.nextInt();

		return opc;
	}

	// Método para pedir al usuario que introduzca un número
	public static double pedirNumero() {
		double num = -1;

		// Comprobamos que el número sea válido
		do {
			try {
				System.out.println("Dime el radio de la esfera:");
				num = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error, el tipo introducido no es válido");
			} finally {
				sc.nextLine();
			}
		} while (num < 0);

		return num;
	}

	public static void main(String[] args) {

		// Creamos un objeto esfera
		Esfera esfera;

		// Variable donde guardaremos el número que introduzca el usuario y mostramos el
		// menu llamando a los métodos
		double radio = pedirNumero();
		int opc = menu();

		// Creamos un objeto Esfera con el valor del radio introducido
		esfera = new Esfera(radio);

		// Usamos un switch para realizar la operación que haya pedido el usuario
		switch (opc) {
		case 0:
			System.out.println("Saliendo...");
			break;
		case 1:
			System.out.println("La superficie de la esfera es de: " + esfera.superficie());
			break;
		case 2:
			System.out.println("El volumen de la esfera es de: " + esfera.volumen());
			break;
		}

		// Cerramos el scanner
		sc.close();
	}
}
