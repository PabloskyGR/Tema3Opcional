package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		int opc;

		// Mostrar el menú
		System.out.println("  - - - - - Menú - - - - - ");
		System.out.println(" | 1. Primo               |");
		System.out.println(" | 2. Capicúa             |");
		System.out.println(" | 0. Salir               |");
		System.out.println("  - - - - - Menú - - - - -  ");
		System.out.println();
		System.out.println("Dime qué quieres hacer:");
		opc = sc.nextInt();

		return opc;
	}

	public static int pedirNumero() {
		int num = -1;

		// Comprobamos que el valor introducido sea correcto
		do {
			try {
				System.out.println("Dime un número:");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error, el tipo introducido no es válido");
			} finally {
				sc.nextLine();
			}
		} while (num < 0);

		return num;
	}

	public static void main(String[] args) {

		// Creamos el objeto numeros
		Numeros numero;

		// Variables para pedir el número y mostrar el menú
		int num = pedirNumero();
		int opc = menu();

		// Creamos un objeto Numeros con el valor de num introducido
		numero = new Numeros(num);

		// Usamos un switch para realizar la opción que haya elegido el usuario
		switch (opc) {
		case 1:
			System.out.println("¿Es el " + num + " primo? --> " + numero.esPrimo());
			break;
		case 2:
			System.out.println("¿Es el " + num + " capicúa? --> " + numero.esCapicua());
			break;
		case 0:
			System.out.println("Saliendo...");
			break;
		default:
			System.out.println("Error, opción no válida");

		}

		// Cerramos el scanner
		sc.close();
	}
}
