package p6_Refactorizar;

/**
 * Clase de tipo enum que contiene los detalles de cada operaciï¿½n.
 */

public enum Operaciones {
	SUMAR("Suma", "+", "Suma dos números", 1), RESTAR("Resta", "-", "Resta dos números", 2),
	MULTIPLICAR("Multiplicación", "*", "Multiplica dos números", 3), DIVIDIR("División", "/", "Divide dos números", 4),
	SUMAR_RES("Sumar al resultado", "+=", "Suma un número al resultado actual", 5),
	RESTAR_RES("Restar al resultado", "-=", "Al resultado actual le resta un número", 6),
	MULTIPLICAR_RES("Multiplicar al resultado", "*=", "Multiplica un número al resultado actual", 7),
	DIVIDIR_RES("Dividir al resultado", "/=", "Resultado actual dividido por un número", 8),
	RESULTADO("Mostrar resultado", "!", "Muestra el último resultado", 9),
	RANDOM("Número aleatorio", "¿?", "Crea un número aleatorio 1-100", 10),
	HISTORIAL("Historial", "h", "Muestra las cinco últimas operaciones", 11);

	/**
	 * Declaración de las constantes de la clase
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
	 * Método get que utilizo para que me devuelva el valor de la variable NOMBREOPERACION desde fuera de esta clase.
	 */
	public String getNombre() {
		return NOMBREOPERACION;
	}

	/**
	 * Método get que utilizo para que me devuelva el valor de la variable INFOOPERACION desde fuera de esta clase.
	 */
	public String getInfo() {
		return INFOOPERACION;
	}

	/**
	 * Método get que utilizo para que me devuelva el valor de la variable SIMBOLOOPERACION desde fuera de esta clase.
	 */
	public String getSimbolo() {
		return SIMBOLOOPERACION;
	}

	/**
	 * Método get que utilizo para que me devuelva el valor de la variable IDEOPERACION desde fuera de esta clase.
	 */
	public int getId() {
		return IDEOPERACION;
	}

	/**
	 * Método get que utilizo para que me devuelva el valor de la variable NOMBREOPERACION desde fuera de esta clase.
	 */
	public String getOpcionMenu() {
		return IDEOPERACION + ".- " + NOMBREOPERACION;
	}

}
