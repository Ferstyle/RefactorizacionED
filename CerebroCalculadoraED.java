package ED_P6;

public class CerebroCalculadoraED {

	/**
	 * Declaración del objeto cerebelo, que es con el que voy a controlar esta
	 * clase.
	 */
	Cerebelo cerebelo = new Cerebelo();

	/**
	 * Constructor por defecto de la clase.
	 */
	CerebroCalculadoraED() {
	}

	/**
	 * Método que se utiliza para elegir la operación que vamos a realizar. Recibe
	 * op de tipo String por parametro, que sería con el que se seleccionara la
	 * opoeración a realizar.
	 */
	public void procesarOperacion(String op) {
		System.out.println("proceso " + op);
		switch (op) {
		case "1":
			operarSuma(Operaciones.SUMAR);
			break;
		case "2":
			operarResta(Operaciones.RESTAR);
			break;
		case "3":
			operarMultiplica(Operaciones.MULTIPLICAR);
			break;
		case "4":
			operarDivide(Operaciones.DIVIDIR);
			break;
		case "5":
			operarSumaRes(Operaciones.SUMAR_RES);
			break;
		case "6":
			operarRestaRes(Operaciones.RESTAR_RES);
			break;
		case "7":
			operarMultiplicaRes(Operaciones.MULTIPLICAR_RES);
			break;
		case "8":
			operarDivideRes(Operaciones.DIVIDIR_RES);
			break;
		case "9":
			cerebelo.mostrarResultadoActual(Operaciones.RESULTADO);
			break;
		case "10":
			numeroAleatorio(Operaciones.RANDOM);
			break;
		case "11":
			operarHistorial(Operaciones.HISTORIAL);
			break;
			//Añadido para que no saltase el mensaje de error de abajo.
		case "x":
			break;
		default:
			System.out.println("ERROR: La operación " + op + " no es conocida.");
			break; // añadido por buena praxis
		}
	}

	/**
	 * Método para operar la suma de dos números.
	 */
	private void operarSuma(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirDosNumeros();
		cerebelo.setResultado(cerebelo.getNumero1() + cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * Método para operar la resta de dos números.
	 */
	private void operarResta(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirDosNumeros();
		cerebelo.setResultado(cerebelo.getNumero1() - cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * Método para operar la multiplicación de dos números.
	 */
	private void operarMultiplica(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirDosNumeros();
		cerebelo.setResultado(cerebelo.getNumero1() * cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * Método para operar la división de dos números.
	 */
	private void operarDivide(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirDosNumeros();
		cerebelo.setResultado(cerebelo.getNumero1() / cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * Método para operar suma al resultado anterior.
	 */
	private void operarSumaRes(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirUnNumero();
		cerebelo.setResultado(cerebelo.getResultado() + cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * Método para operar resta al resultado anterior.
	 */
	private void operarRestaRes(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirUnNumero();
		cerebelo.setResultado(cerebelo.getResultado() - cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * Método para operar multiplicación al resultado anterior.
	 */
	private void operarMultiplicaRes(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirUnNumero();
		cerebelo.setResultado(cerebelo.getResultado() * cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * Método para operar dividir al resultado anterior.
	 */
	private void operarDivideRes(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirUnNumero();
		cerebelo.setResultado(cerebelo.getResultado() / cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * Método para generar un número random.
	 */
	private void numeroAleatorio(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.setResultado((double) (Math.random() * 100 + 1));
		System.out.println("El número aleatorio generado es: " + cerebelo.getResultado() + "\n");
		cerebelo.anadirHistorial(op);
	}

	/**
	 * Método para operar el historial.
	 */
	private void operarHistorial(Operaciones op) {
		System.out.println("*** Historial de las cinco últimas operaciones ***");
		for (String hist : cerebelo.historial) {
			System.out.println(hist);
		}
		System.out.println("\n");
	}

}
