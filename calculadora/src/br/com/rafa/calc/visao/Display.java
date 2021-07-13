package br.com.rafa.calc.visao;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

@SuppressWarnings("serial")
public class Display extends JPanel {
	
	private final JLabel label;
	
	public Display() {
		setBackground(new Color(46, 49, 50));
		label = new JLabel("12345,67");
		label.setForeground(Color.WHITE);
		label.setFont(new FontUIResource("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
		
		add(label);
	}
}
