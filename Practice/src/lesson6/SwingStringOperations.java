package lesson6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingStringOperations {
	
	JFrame frame = new JFrame("String Utility");
	JPanel panel = new JPanel();
	
	private JButton countLetters = new JButton("Count Letters");
	private JButton reverseLetters = new JButton("Reverse Letters");
	private JButton removeDuplicates = new JButton("Remove Duplicates");
	
	private JTextField inputText = new JTextField();
	private JTextField outputText = new JTextField();
	
	private JLabel inputLabel = new JLabel("Input");
	private JLabel outputLabel = new JLabel("Output");
	
	
	
	public void drawFrame()
	{
		frame.setBounds(300,300, 600, 400);		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel.setBounds(300,300, 600, 400);
		panel.setLayout(null);
		frame.add(panel);
		
		
		countLetters.setBounds(10, 50, 200, 40);
		reverseLetters.setBounds(10, 100, 200, 40);
		removeDuplicates.setBounds(10, 150, 200, 40);
		
		inputText.setBounds(250, 70, 200, 30);
		outputText.setBounds(250, 125, 200, 30);
		
		inputLabel.setBounds(250, 40, 200, 30);
		outputLabel.setBounds(250, 100, 200, 30);		
		
		
	}
	

	public void addToPanel()
	{
		panel.add(countLetters);		
		panel.add(reverseLetters);		
		panel.add(removeDuplicates);
		
		panel.add(inputText);		
		panel.add(outputText);
		
		
		panel.add(inputLabel);		
		panel.add(outputLabel);
	}
	
	public void stringOperations()
	{
		countLetters.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				outputText.setText(inputText.getText().length() + "");						
			}			
		});
		
		reverseLetters.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				outputText.setText( new StringBuilder(inputText.getText()).reverse() + "");						
			}			
		});
		
		removeDuplicates.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				outputText.setText(removeDuplicates(inputText.getText()));	
			}			
		});
	}
	
	public String removeDuplicates(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}
	
	
	
	public static void main(String[] args) {
		
		SwingStringOperations sso = new SwingStringOperations();
		sso.drawFrame();
		sso.addToPanel();
		sso.stringOperations();
	}

}
