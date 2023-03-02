package p6_Refactorizar;

import java.util.Scanner;

public class Cerebelo {

	/**
	 * Declaración de atributos de la clase
	 */
	private double resultado, numero1, numero2;
	private final int TAMANOHISTORIAL = 5;
	protected String[] historial = new String[TAMANOHISTORIAL];

	Scanner tecladoCce = new Scanner(System.in);

	/**
	 * Constructor por defecto de la clase.
	 */
	public Cerebelo() {
	}

	/**
	 * Método que pide al usuario que introduzca un nï¿½mero.
	 */
	protected void pedirUnNumero() {
		System.out.println("Introduce el número: ");
		this.numero1 = this.resultado;
		this.numero2 = tecladoCce.nextDouble();
	}

	/**
	 * Método que pide al usuario que introduzca dos números.
	 */
	protected void pedirDosNumeros() {
		System.out.println("Introduce el primer número: ");
		this.numero1 = tecladoCce.nextDouble();
		System.out.println("Introduce el segundo número: ");
		this.numero2 = tecladoCce.nextDouble();
	}

	/**
	 * Método da información sobre la operación que se ha elegido en la calculadora.
	 */
	protected void infoOperacion(Operaciones op) {
		System.out.println("//////////////////////////////");
		System.out.println("-> " + op.getNombre() + " - " + op.getInfo());
	}

	/**
	 * Método que muestra el resultado despues de cada operación.
	 */
	protected void mostrarResultado(Operaciones op) {
		System.out.println("El resultado de la operación " + op.getNombre().toLowerCase() + " es:"
				+ (Double.toString(this.numero1) + " " + op.getSimbolo() + " " + Double.toString(this.numero2) + " = "
						+ Double.toString(this.resultado) + "\n"));
	}

	/**
	 * Método que muestra el resultado actual.
	 */
	protected void mostrarResultadoActual(Operaciones op) {
		this.infoOperacion(op);
		System.out.println("El valor actual del resultado es: " + this.resultado + "\n");
	}

	/**
	 * Método que añade la última operación al historial.
	 * 
	 */
	protected void anadirHistorial(Operaciones op) {
		String nuevaOperacion;
		if (op.getSimbolo() == "¿?") {
			nuevaOperacion = op.getNombre() + " -> " + Double.toString(this.resultado);
		} else {
			nuevaOperacion = op.getNombre() + " -> " + Double.toString(this.numero1) + " " + op.getSimbolo() + " "
					+ Double.toString(this.numero2) + " = " + Double.toString(this.resultado);
		}

		this.historial[4] = this.historial[3];
		this.historial[3] = this.historial[2];
		this.historial[2] = this.historial[1];
		this.historial[1] = this.historial[0];
		this.historial[0] = nuevaOperacion;
	}

	/**
	 * Método get que utilizo para que me devuelva el valor de la variable resultado desde la clase CerebroCalculadoraED().
	 */
	public double getResultado() {
		return resultado;
	}

	/**
	 * Método get que utilizo para establecer el valor de la variable resultado desde fuera de esta clase.
	 */
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	/**
	 * Método get que utilizo para que me devuelva el valor de la variable numero1 desde la clase CerebroCalculadoraED().
	 */
	public double getNumero1() {
		return numero1;
	}

	/**
	 * Método get que utilizo para que me devuelva el valor de la variable numero2 desde la clase CerebroCalculadoraED().
	 */
	public double getNumero2() {
		return numero2;
	}

}
