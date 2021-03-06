package reponses;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel;

import controleur.Controleur;

public class ExplicationsReponseBouton extends JPanel {
	String correction;
	JButton bouton;
	
	public ExplicationsReponseBouton(Controleur c){
		setLayout(null);
		setPreferredSize(new Dimension(this.getWidth(),60));
		
		correction = c.getModele().getPhrase().getCorrection();
		
		bouton = new JButton("Next");
		bouton.setBounds(465, 5, 80, 40);
		bouton.setBackground(Color.lightGray);
		bouton.setForeground(Color.black);
		bouton.addActionListener(c);
		add(bouton);
		
		validate();
	}
	
	public void paintComponent(Graphics g){
		
		g.setColor(new Color(0, 33, 153));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.white);
		g.fillRect(40, 5, 415, this.getHeight()-20);
		g.setColor(new Color(36,85,255));
		g.drawRect(40, 5, 415, this.getHeight()-20);
		
		
		g.setFont(new Font("Arial", Font.BOLD, 12));
		g.setColor(Color.black);
		FontMetrics fm = g.getFontMetrics();
		int taille = fm.stringWidth(correction);
		g.drawString(correction, (500-taille)/2, 30);

	}
}
