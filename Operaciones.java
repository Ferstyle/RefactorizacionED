package p6_Refactorizar;

/**
 * Clase de tipo enum que contiene los detalles de cada operaci�n.
 */

public enum Operaciones {
	SUMAR("Suma", "+", "Suma dos n�meros", 1), RESTAR("Resta", "-", "Resta dos n�meros", 2),
	MULTIPLICAR("Multiplicaci�n", "*", "Multiplica dos n�meros", 3), DIVIDIR("Divisi�n", "/", "Divide dos n�meros", 4),
	SUMAR_RES("Sumar al resultado", "+=", "Suma un n�mero al resultado actual", 5),
	RESTAR_RES("Restar al resultado", "-=", "Al resultado actual le resta un n�mero", 6),
	MULTIPLICAR_RES("Multiplicar al resultado", "*=", "Multiplica un n�mero al resultado actual", 7),
	DIVIDIR_RES("Dividir al resultado", "/=", "Resultado actual dividido por un n�mero", 8),
	RESULTADO("Mostrar resultado", "!", "Muestra el �ltimo resultado", 9),
	RANDOM("N�mero aleatorio", "�?", "Crea un n�mero aleatorio 1-100", 10),
	HISTORIAL("Historial", "h", "Muestra las cinco �ltimas operaciones", 11);

	/**
	 * Declaraci�n de las constantes de la clase
	 */
	private final String NOMBREOPERACION;
	private final String SIMBOLOOPERACION;
	private final String INFOOPERACION;
	private final int IDEOPERACION;

	/**
	 * Constructor de la clase que recibe como parametros: el nombre, simbolo, info
	 * y la id.
	 */
	Operaciones(String nombre, String simbolo, String info, int id) {
		this.NOMBREOPERACION = nombre;
		this.SIMBOLOOPERACION = simbolo;
		this.INFOOPERACION = info;
		this.IDEOPERACION = id;
	}

	/**
	 * M�todo get que utilizo para que me devuelva el valor de la variable NOMBREOPERACION desde fuera de esta clase.
	 */
	public String getNombre() {
		return NOMBREOPERACION;
	}

	/**
	 * M�todo get que utilizo para que me devuelva el valor de la variable INFOOPERACION desde fuera de esta clase.
	 */
	public String getInfo() {
		return INFOOPERACION;
	}

	/**
	 * M�todo get que utilizo para que me devuelva el valor de la variable SIMBOLOOPERACION desde fuera de esta clase.
	 */
	public String getSimbolo() {
		return SIMBOLOOPERACION;
	}

	/**
	 * M�todo get que utilizo para que me devuelva el valor de la variable IDEOPERACION desde fuera de esta clase.
	 */
	public int getId() {
		return IDEOPERACION;
	}

	/**
	 * M�todo get que utilizo para que me devuelva el valor de la variable NOMBREOPERACION desde fuera de esta clase.
	 */
	public String getOpcionMenu() {
		return IDEOPERACION + ".- " + NOMBREOPERACION;
	}

}
