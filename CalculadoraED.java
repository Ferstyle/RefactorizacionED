package p6_Refactorizar;

import java.util.Scanner;

public class CalculadoraED {

	public static void main(String[] args) {
		/**
		 * Declaración de atributos
		 * 
		 * cce es un ainstancia de la clase CerebroCalculadoraED.
		 * entrada será la variable que use para seleccionar la opción deseada en el switch
		 */
		CerebroCalculadoraED cce = new CerebroCalculadoraED();
		Scanner teclado = new Scanner(System.in);
		String entrada;
		/**
		 * Do-while que pide por pantalla los datos
		 */
		do {
			imprimirCabecera();
			imprimirSeleccionOp();

			entrada = teclado.next();
			if (validarEntrada(entrada)) {
				cce.procesarOperacion(entrada);
			} else {
				System.out.println("Entrada no reconocida");
			}
		} while (!entrada.equals("x"));
		imprimirDespedida();
		teclado.close();
	}

	/**
	 * Método que imprime la cabecera
	 */
	private static void imprimirCabecera() {
		System.out.println("*----------------------------------*" + "\n*----------Calculadora ED----------*"
				+ "\n*----------------------------------*");
	}

	/**
	 * Método que imprime por pantalla una despedida.
	 */
	private static void imprimirDespedida() {
		System.out.println("*-----------------------------------------*"
				+ "\n*----!Gracias por usar Calculadora ED!----*" + "\n*-----------------------------------------*");
	}

	/**
	 * Método que se utiliza para sacar por pantalla el menu y que pide que se
	 * seleccione la opción deseada.
	 */
	private static void imprimirSeleccionOp() {
		Operaciones[] ops = Operaciones.values();
		for (Operaciones op : ops) {
			System.out.println(op.getOpcionMenu());
		}
		System.out.println("¿Qué operación desea realizar? (x para terminar)");
	}

	/**
	 * Método que devuelve un booleano que utilizamos para validar que lo que hemos
	 * introducido es correcto.
	 */

	private static boolean validarEntrada(String entrada) {
		if (entrada.equals("x")) {
			return true;
		} else {
			boolean opValida = false;
			Operaciones[] ops = Operaciones.values();
			for (Operaciones op : ops) {
				if (Integer.toString(op.getId()).equals(entrada)) {
					opValida = true;
				}
			}
			return opValida;
		}
	}

}
