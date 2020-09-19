package meugame.modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Fase {
	
	private Image fundo;
	
	
	public Fase() {
		ImageIcon referencia = new ImageIcon("res\\19246_space-game-background.png");
		fundo = referencia.getImage();
	}
}
