package swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class LoginScreen {
	
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		//frame.setBounds(100, 100, 400, 300);	
		frame.setSize(300, 500);
		frame.setTitle("Login Screen");
		
		frame.setVisible(true);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.setLayout(null);
		
		
		
		JLabel lb1 = new JLabel("User");		
		lb1.setBounds(10, 40, 50, 20);
		
		JTextField txt1 = new JTextField("",30);
		lb1.setBounds(300, 530, 50, 20);
		

		JLabel lb2 = new JLabel("Password");
		JTextField txt2 = new JTextField("",20);
		lb1.setBounds(20, 30, 50, 20);
		
		JButton btn = new JButton("Login");
		lb1.setBounds(20, 30, 50, 20);
		
		
		
		panel.add(lb1);
		panel.add(txt1);
		panel.add(lb2);
		panel.add(txt2);
		panel.add(btn);
		
		
		
	
		
		
	}

}
