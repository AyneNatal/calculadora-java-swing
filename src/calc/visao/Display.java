package calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JPanel{
	
	private JLabel label;
	
	public Display() {
		setBackground(new Color(46,49,50));
		label = new JLabel("1234,123");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10,15));
		
		add(label);
	}
}
