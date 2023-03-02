package ED_P6;

public class CerebroCalculadoraED {

	/**
	 * Declaraci�n del objeto cerebelo, que es con el que voy a controlar esta
	 * clase.
	 */
	Cerebelo cerebelo = new Cerebelo();

	/**
	 * Constructor por defecto de la clase.
	 */
	CerebroCalculadoraED() {
	}

	/**
	 * M�todo que se utiliza para elegir la operaci�n que vamos a realizar. Recibe
	 * op de tipo String por parametro, que ser�a con el que se seleccionara la
	 * opoeraci�n a realizar.
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
			//A�adido para que no saltase el mensaje de error de abajo.
		case "x":
			break;
		default:
			System.out.println("ERROR: La operaci�n " + op + " no es conocida.");
			break; // a�adido por buena praxis
		}
	}

	/**
	 * M�todo para operar la suma de dos n�meros.
	 */
	private void operarSuma(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirDosNumeros();
		cerebelo.setResultado(cerebelo.getNumero1() + cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * M�todo para operar la resta de dos n�meros.
	 */
	private void operarResta(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirDosNumeros();
		cerebelo.setResultado(cerebelo.getNumero1() - cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * M�todo para operar la multiplicaci�n de dos n�meros.
	 */
	private void operarMultiplica(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirDosNumeros();
		cerebelo.setResultado(cerebelo.getNumero1() * cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * M�todo para operar la divisi�n de dos n�meros.
	 */
	private void operarDivide(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirDosNumeros();
		cerebelo.setResultado(cerebelo.getNumero1() / cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * M�todo para operar suma al resultado anterior.
	 */
	private void operarSumaRes(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirUnNumero();
		cerebelo.setResultado(cerebelo.getResultado() + cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * M�todo para operar resta al resultado anterior.
	 */
	private void operarRestaRes(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirUnNumero();
		cerebelo.setResultado(cerebelo.getResultado() - cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * M�todo para operar multiplicaci�n al resultado anterior.
	 */
	private void operarMultiplicaRes(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirUnNumero();
		cerebelo.setResultado(cerebelo.getResultado() * cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * M�todo para operar dividir al resultado anterior.
	 */
	private void operarDivideRes(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.pedirUnNumero();
		cerebelo.setResultado(cerebelo.getResultado() / cerebelo.getNumero2());
		cerebelo.mostrarResultado(op);
		cerebelo.anadirHistorial(op);
	}

	/**
	 * M�todo para generar un n�mero random.
	 */
	private void numeroAleatorio(Operaciones op) {
		cerebelo.infoOperacion(op);
		cerebelo.setResultado((double) (Math.random() * 100 + 1));
		System.out.println("El n�mero aleatorio generado es: " + cerebelo.getResultado() + "\n");
		cerebelo.anadirHistorial(op);
	}

	/**
	 * M�todo para operar el historial.
	 */
	private void operarHistorial(Operaciones op) {
		System.out.println("*** Historial de las cinco �ltimas operaciones ***");
		for (String hist : cerebelo.historial) {
			System.out.println(hist);
		}
		System.out.println("\n");
	}

}
