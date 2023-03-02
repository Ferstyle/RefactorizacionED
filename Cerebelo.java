package p6_Refactorizar;

import java.util.Scanner;

public class Cerebelo {

	/**
	 * Declaraci�n de atributos de la clase
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
	 * M�todo que pide al usuario que introduzca un n�mero.
	 */
	protected void pedirUnNumero() {
		System.out.println("Introduce el n�mero: ");
		this.numero1 = this.resultado;
		this.numero2 = tecladoCce.nextDouble();
	}

	/**
	 * M�todo que pide al usuario que introduzca dos n�meros.
	 */
	protected void pedirDosNumeros() {
		System.out.println("Introduce el primer n�mero: ");
		this.numero1 = tecladoCce.nextDouble();
		System.out.println("Introduce el segundo n�mero: ");
		this.numero2 = tecladoCce.nextDouble();
	}

	/**
	 * M�todo da informaci�n sobre la operaci�n que se ha elegido en la calculadora.
	 */
	protected void infoOperacion(Operaciones op) {
		System.out.println("//////////////////////////////");
		System.out.println("-> " + op.getNombre() + " - " + op.getInfo());
	}

	/**
	 * M�todo que muestra el resultado despues de cada operaci�n.
	 */
	protected void mostrarResultado(Operaciones op) {
		System.out.println("El resultado de la operaci�n " + op.getNombre().toLowerCase() + " es:"
				+ (Double.toString(this.numero1) + " " + op.getSimbolo() + " " + Double.toString(this.numero2) + " = "
						+ Double.toString(this.resultado) + "\n"));
	}

	/**
	 * M�todo que muestra el resultado actual.
	 */
	protected void mostrarResultadoActual(Operaciones op) {
		this.infoOperacion(op);
		System.out.println("El valor actual del resultado es: " + this.resultado + "\n");
	}

	/**
	 * M�todo que a�ade la �ltima operaci�n al historial.
	 * 
	 */
	protected void anadirHistorial(Operaciones op) {
		String nuevaOperacion;
		if (op.getSimbolo() == "�?") {
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
	 * M�todo get que utilizo para que me devuelva el valor de la variable resultado desde la clase CerebroCalculadoraED().
	 */
	public double getResultado() {
		return resultado;
	}

	/**
	 * M�todo get que utilizo para establecer el valor de la variable resultado desde fuera de esta clase.
	 */
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	/**
	 * M�todo get que utilizo para que me devuelva el valor de la variable numero1 desde la clase CerebroCalculadoraED().
	 */
	public double getNumero1() {
		return numero1;
	}

	/**
	 * M�todo get que utilizo para que me devuelva el valor de la variable numero2 desde la clase CerebroCalculadoraED().
	 */
	public double getNumero2() {
		return numero2;
	}

}
