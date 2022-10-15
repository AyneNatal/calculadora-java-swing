package calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import calc.modelo.Memoria;

public class Teclado extends JPanel implements ActionListener{
	
	private final Color COR_CINZA_ESCURO = new Color(68,68,68);
	private final Color COR_CINZA_CLARO = new Color(99,99,99);
	private final Color COR_LARANJA = new Color(242,163,60);
	
	public Teclado () {
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		
		setLayout(layout);
		
		constraints.weightx = 1;
		constraints.weighty = 1;
		constraints.fill = GridBagConstraints.BOTH;
		
		//Linha 1 do teclado:
		constraints.gridwidth = 3; //p o btn ocupar 3 espaços
		adicionarBotao("AC", COR_CINZA_ESCURO, constraints, 0, 0);
		constraints.gridwidth = 1; //aqui eu faço os btns voltar a ocupar 1 espaço
		adicionarBotao("/", COR_LARANJA, constraints, 3, 0);

		//Linha 2 do teclado:
		adicionarBotao("7", COR_CINZA_CLARO, constraints, 0, 1);
		adicionarBotao("8", COR_CINZA_CLARO, constraints, 1, 1);
		adicionarBotao("9", COR_CINZA_CLARO, constraints, 2, 1);
		adicionarBotao("*", COR_LARANJA, constraints, 3, 1);
		
		//Linha 3 do teclado:
		adicionarBotao("4", COR_CINZA_CLARO, constraints, 0, 2);
		adicionarBotao("5", COR_CINZA_CLARO, constraints, 1, 2);
		adicionarBotao("6", COR_CINZA_CLARO, constraints, 2, 2);
		adicionarBotao("-", COR_LARANJA, constraints, 3, 2);
		
		//Linha 4 do teclado:
		adicionarBotao("1", COR_CINZA_CLARO, constraints, 0, 3);
		adicionarBotao("2", COR_CINZA_CLARO, constraints, 1, 3);
		adicionarBotao("3", COR_CINZA_CLARO, constraints, 2, 3);
		adicionarBotao("+", COR_LARANJA, constraints, 3, 3);
		
		//Linha 5 do teclado:
		constraints.gridwidth = 2;
		adicionarBotao("0", COR_CINZA_CLARO, constraints, 0, 4);
		constraints.gridwidth = 1;
		adicionarBotao(",", COR_CINZA_CLARO, constraints, 2, 4);
		adicionarBotao("=", COR_LARANJA, constraints, 3, 4);
		
	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints constraints, int x, int y) {
		constraints.gridx = x;
		constraints.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, constraints);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}
	}
	
}
