package meugame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Container extends JFrame{
	
	Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
	int x = (int) tela.getWidth();
	int y = (int) tela.getHeight();
	
	public Container(){
		setTitle("Space Shooter BR Fake Edition");
		setSize(x,y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setVisible(true);
		
	}
	public static void main (String []args) {
		new Container();
	}

}
