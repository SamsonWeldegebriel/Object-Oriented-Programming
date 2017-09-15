package lesson6;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


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
		
		JButton red = new JButton();
		red.setBounds(0, 0, 100, 100);
		red.setBackground(Color.red);
		red.setBorderPainted(false);
		mainFrame.add(red);
		
		red.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame,
				"Red signifies passion, vitality, enthusiasm and security.");
			}});
		
	
		
		
		JButton orange = new JButton();
		orange.setBounds(100, 0, 100, 100);
		orange.setBackground(Color.orange);
		orange.setBorderPainted(false);
		mainFrame.add(orange);
		
		orange.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame,
				"Orange is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control.");
			}});
		
		
		
		JButton green = new JButton();
		green.setBounds(200, 0, 100, 100);
		green.setBackground(Color.green);
		green.setBorderPainted(false);
		mainFrame.add(green);
		
		green.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame,
				"Green denotes fertility, growth, balance, health and wealth");
			}});
		
		
		JButton blue = new JButton();
		blue.setBounds(300, 0, 100, 100);
		blue.setBackground(Color.blue);
		blue.setBorderPainted(false);
		mainFrame.add(blue);
		
		blue.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame,
				"Blue: The sky and the wide oceans are in this colour and hence it has been associated with Spirituality and Divinity");
			}});
		
		
		JButton yellow = new JButton();
		yellow.setBounds(400, 0, 100, 100);
		yellow.setBackground(Color.yellow);
		yellow.setBorderPainted(false);
		mainFrame.add(yellow);
		
		yellow.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame,
				"Yellow represents clarity of thought, wisdom, orderliness and energy");
			}});
		
		JButton indigo = new JButton();
		indigo.setBounds(500, 0, 100, 100);
		indigo.setBackground(new Color(75,0,130));
		indigo.setBorderPainted(false);
		mainFrame.add(indigo);
		
		indigo.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame,
				"Indigo is sedating.");
			}});
		
		JButton violet = new JButton();
		violet.setBounds(600, 0, 100, 100);
		violet.setBackground(new Color(148, 0, 211));
		violet.setBorderPainted(false);
		mainFrame.add(violet);
		
		violet.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame,
				"Violet is considered the highest element of spirituality.");
			}});
	}
	
	public static void main(String[] args) {
		new Rainbow();
	}

}