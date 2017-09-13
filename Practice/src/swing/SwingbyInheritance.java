package swing;

import javax.swing.*;

public class SwingbyInheritance extends JFrame {
	
	JFrame jf;
	
	public SwingbyInheritance()
	{
		JButton b = new JButton("Inherit Click!");
		setVisible(true);
		add(b);
		setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SwingbyInheritance();
	}
}
