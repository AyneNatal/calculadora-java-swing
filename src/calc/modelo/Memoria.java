package calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private static final Memoria INSTANCIA = new Memoria();
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	private String textoAtual = "";
	
	private Memoria() {
		//coloquei o construtor como private p/ deixar no padrão singleton, onde só pode haver uma instancia.
	}

	public static Memoria getInstancia() {
		return INSTANCIA;
	}
	
	public void adicionarObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	public void processarComando(String valor) {
		if ("AC".equals(valor)) {
			textoAtual = "";
		} else {
			textoAtual += valor;
		}
		
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}
	
	
	
}
