package victoria.perdiz;

public class ImitadorAvexado {
	private static ImitadorAvexado instancia = new ImitadorAvexado();

	private ImitadorAvexado() {
		super();
	}
	public static ImitadorAvexado getInstancia() {
		return instancia;
	}
}
