package victoria.perdiz;

public class ImitadorDevagar {
	private static ImitadorDevagar instancia;
	private ImitadorDevagar() {
		super();
	}

	public static ImitadorDevagar getInstancia() {
		if (instancia == null) {
			instancia = new ImitadorDevagar();
		}
		return instancia;
	}
}
