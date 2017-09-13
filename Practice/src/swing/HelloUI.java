package swing;
import javax.swing.*;

public class HelloUI {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Hello Swing App");
		frame.setVisible(true);
		//frame.setBounds(100, 200, 400, 500);
		
		frame.setTitle("Our Application");
		frame.setLayout(null);
		
		JPanel panel = new JPanel();
		//panel.setBounds(100, 200, 400, 500);
		
		//frame.add(panel);
		
		JButton btn = new JButton("Click Me!");
		btn.setBounds(130,100,100, 40);
		//panel.add(btn);
		frame.add(btn);
		
		panel.setSize(400,500);
		
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
