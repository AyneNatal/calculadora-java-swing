package calc.modelo;

public class Memoria {
	
	private static final Memoria INSTANCIA = new Memoria();
	private String textoAtual = "";
	
	private Memoria() {
		//coloquei o construtor como private p/ deixar no padr�o singleton, onde s� pode haver uma instancia.
	}

	public static Memoria getInstancia() {
		return INSTANCIA;
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	
	
}
