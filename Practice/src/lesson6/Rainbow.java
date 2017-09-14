package lesson6;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		red.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame,
				"Red signifies passion, vitality, enthusiasm and security.");
			}});
		
	
		
		
		JButton orange = new JButton("Orage");
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
		
		
		
		JButton green = new JButton("green");
		green.setBounds(200, 0, 100, 100);
		green.setBackground(Color.green);
		green.setBorderPainted(false);
		mainFrame.add(green);
		
		red.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame,
				"Red signifies passion, vitality, enthusiasm and security.");
			}});
		
		
		JButton blue = new JButton("blue");
		blue.setBounds(300, 0, 100, 100);
		blue.setBackground(Color.blue);
		red.setBorderPainted(false);
		mainFrame.add(blue);
		
		red.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame,
				"Red signifies passion, vitality, enthusiasm and security.");
			}});
		
		
		JButton yellow = new JButton("yellow");
		yellow.setBounds(400, 0, 100, 100);
		yellow.setBackground(Color.yellow);
		yellow.setBorderPainted(false);
		mainFrame.add(yellow);
		
		red.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame,
				"Red signifies passion, vitality, enthusiasm and security.");
			}});
		
		JButton indigo = new JButton("Indigo");
		indigo.setBounds(500, 0, 100, 100);
		indigo.setBackground(new Color(75,0,130));
		indigo.setBorderPainted(false);
		mainFrame.add(indigo);
		
		red.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame,
				"Red signifies passion, vitality, enthusiasm and security.");
			}});
		
		JButton violet = new JButton("violet");
		violet.setBounds(600, 0, 100, 100);
		violet.setBackground(new Color(148, 0, 211));
		violet.setBorderPainted(false);
		mainFrame.add(violet);
		
		red.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(mainFrame,
				"Red signifies passion, vitality, enthusiasm and security.");
			}});
	}
	
	public static void main(String[] args) {
		new Rainbow();
	}
	
	/*
	 * 
	 * 
	 *  It is the light with the longest wavelength.
Orange– This light or color is a combination of yellow and red. 
Yellow– This is the color of the sunshine itself. It represents clarity of thought, wisdom, orderliness and energy.
Green– This is the middle color of the rainbow and denotes fertility, growth, balance, health and wealth.
Blue– This the fifth color of the rainbow which makes us think of the Unknown. The sky and the wide oceans are in this color and hence it has been associated with Spirituality and Divinity.
Indigo– It is believed that where Blue is calming, Indigo is sedating. Indigo is mystical as it bridges the Gap between Finite and Infinite. Indigo colored gem stones are often used for spiritual attainment, psychic abilities, self awareness and enhancement of Intuition.
Violet– The last color of the rainbow is a mix of red and blue. It is considered the highest element of spirituality. It can ignite one’s imagination and be an inspiration to artists. Dark tones of violet are associated with sorrow. Deeper shades of violet or purple denote high spiritual mastery.
	 * 
	 * 
	 * */

}
