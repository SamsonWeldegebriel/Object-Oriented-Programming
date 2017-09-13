package lesson6;

import java.awt.Color;

import javax.swing.*;
import javax.swing.border.Border;

public class Rainbow {
	
	JFrame mainFrame = new JFrame();
	
	public Rainbow()
	{
		drawRainbow();
	}
	
	public void drawRainbow()
	{
		mainFrame.setSize(700, 150);
		mainFrame.setVisible(true);
		mainFrame.setLayout(null);
		mainFrame.setTitle("Rainbow Color Frame");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton red = new JButton("Red");
		red.setBounds(0, 0, 100, 100);
		red.setBackground(Color.red);
		red.setBorderPainted(false);
		mainFrame.add(red);
		
		JButton orange = new JButton("Orage");
		orange.setBounds(100, 0, 100, 100);
		orange.setBackground(Color.orange);
		orange.setBorderPainted(false);
		mainFrame.add(orange);
		
		
		JButton green = new JButton("green");
		green.setBounds(200, 0, 100, 100);
		green.setBackground(Color.green);
		green.setBorderPainted(false);
		mainFrame.add(green);
		
		JButton blue = new JButton("blue");
		blue.setBounds(300, 0, 100, 100);
		blue.setBackground(Color.blue);
		red.setBorderPainted(false);
		mainFrame.add(blue);
		
		
		JButton yellow = new JButton("yellow");
		yellow.setBounds(400, 0, 100, 100);
		yellow.setBackground(Color.yellow);
		yellow.setBorderPainted(false);
		mainFrame.add(yellow);
		
		JButton indigo = new JButton("Indigo");
		indigo.setBounds(500, 0, 100, 100);
		indigo.setBackground(new Color(75,0,130));
		indigo.setBorderPainted(false);
		mainFrame.add(indigo);
		
		JButton violet = new JButton("violet");
		violet.setBounds(600, 0, 100, 100);
		violet.setBackground(new Color(255,0,255));
		violet.setBorderPainted(false);
		
		mainFrame.add(violet);
	}
	
	public static void main(String[] args) {
		new Rainbow();
	}

}
