package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static int menu() {

		int opc;

		System.out.println("  - - - - - Menú - - - - - ");
		System.out.println(" | 1. Superficie          |");
		System.out.println(" | 2. Volumen             |");
		System.out.println(" | 0. Salir               |");
		System.out.println("  - - - - - Menú - - - - -  ");
		System.out.println();
		System.out.println("Dime que quieras hacer:");
		opc = sc.nextInt();

		return opc;
	}

	public static int pedirNumero() {
		int num = -1;

		do {
			try {
				System.out.println("Dime el radio de la esfera:");
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
		
		Esfera esfera = new Esfera();
		
		int opc = menu();
		double num = pedirNumero();
		
		esfera = new Esfera(num);
		
		switch(opc) {
		case 0:
			System.out.println("Saliendo...");
			break;
		case 1:
			System.out.println("La superficie de la esfera es de: " + esfera.superficie());
			break;
		case 2:
			System.out.println("El volumen de la esfera es de: " + esfera.volumen());
		}
		
		sc.close();

	}

}
