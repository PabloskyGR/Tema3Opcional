package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static int menu() {

		int opc;

		System.out.println("  - - - - - Menú - - - - - ");
		System.out.println(" | 1. Primo               |");
		System.out.println(" | 2. Capicúa             |");
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
		
		Numeros numero = new Numeros();
		
		int opc = menu();
		int num = pedirNumero();
		
		numero = new Numeros(num);
		
		switch(opc) {
		case 1:
			System.out.println("¿Es el " + num + " primo? --> " + numero.esPrimo());
			break;
		case 2:
			System.out.println("¿Es el " + num + " capicúa? --> " + numero.esCapicua());
		}
		
		sc.close();

	}

}
