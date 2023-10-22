package victoria.perdiz;

public class ImitadorPassinho {
	private static class Capsula{
		public static ImitadorPassinho instancia = new ImitadorPassinho();
	}
	private ImitadorPassinho() {
		super();
	}

	public static ImitadorPassinho getInstancia() {
		return Capsula.instancia;
	}
}
