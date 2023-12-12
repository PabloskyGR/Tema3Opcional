package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	// Método para mostrar el menú y obtener la opción del usuario
	public static int menu() {
		int opc;

		System.out.println("  - - - - - Menú - - - - - ");
		System.out.println(" | 1. Sumatorio           |");
		System.out.println(" | 2. Potencia            |");
		System.out.println(" | 3. Fibonacci           |");
		System.out.println(" | 0. Salir               |");
		System.out.println("  - - - - - Menú - - - - -  ");
		System.out.println();
		System.out.println("Dime qué quieres hacer:");
		opc = sc.nextInt();

		return opc;
	}

	// Método para solicitar al usuario un número entero que no sea negativo
	public static int pedirNumero() {
		int num = -1;

		// Comprobamos que el número sea del tipo válido
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

		// Variable donde gaurdaremos la opción que elija el usuario y mostramos el menu
		int opc = menu();
		
		// Variable donde gaurdaremos el número que introduzca el usuario
		int num;
		
		// Variable donde guardaremos el valor de 'n' y de 'a' que introduzca el usuario
		double n, a;

		// Usamos un switch para realizar la opción que haya elegido el usuario
		switch (opc) {
		case 0:
			System.out.println("Saliendo...");
			break;
		case 1:
			num = pedirNumero();
			System.out.println("El sumatorio de 0 a " + num + " es de: " + FuncionRecursiva.sumatorio(num));
			break;
		case 2:
			System.out.println("Dime valor de 'a' y de 'n': ");
			a = sc.nextDouble();
			n = pedirNumero(); // Pedir un número entero positivo para la potencia
			System.out.println(
					"La potencia de " + a + " elevado a " + n + " es de: " + FuncionRecursiva.potencia(a, (int) n));
			break;
		case 3:
			num = pedirNumero();
			System.out.println("El número correspondiente de la serie de Fibonacci del número " + num + " es: "
					+ FuncionRecursiva.serieFibonacci(num));
			break;
		}

		// Cerrar el scanner
		sc.close();
	}
}
