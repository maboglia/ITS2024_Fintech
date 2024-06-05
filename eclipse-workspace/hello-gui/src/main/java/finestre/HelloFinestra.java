package finestre;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HelloFinestra {

	public static void main(String[] args) {

		JFrame finestra = new JFrame();
		
		JLabel testo = new JLabel("Hello GUI");
		
		JTextField nomePokemon = new JTextField();
		nomePokemon.setSize(100, 20);
		BorderLayout layout = new BorderLayout();
		
		JButton bottone = new JButton();
		
		bottone.setText("cliccami");
		
		bottone.addActionListener(e -> System.out.println("funziona " + nomePokemon.getText()));
		
		finestra.setLayout(layout);
		
		finestra.add(testo, BorderLayout.NORTH);
		finestra.add(nomePokemon, BorderLayout.CENTER);
		finestra.add(bottone, BorderLayout.SOUTH);
		
		finestra.setTitle("Pokemon Gallery");
		
		
		
		finestra.setSize(500, 400);
		
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		finestra.setVisible(true);
		
	}

}
