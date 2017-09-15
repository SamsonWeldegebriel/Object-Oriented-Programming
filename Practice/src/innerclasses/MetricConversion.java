package innerclasses;
import javax.swing.*;

public class MetricConversion {
	
	private JFrame frame= new JFrame();
	
	private JLabel milesLabel = new JLabel("Mile:");
	private JLabel kilometersLabel = new JLabel("Kilometer:");
	private JLabel poundsLabel = new JLabel("Pounds:");
	private JLabel kilogramsLabel = new JLabel("Kilograms:");
	private JLabel gallonsLabel = new JLabel("Gallons:"); 
	private JLabel litersLabel = new JLabel("Liters:");
	private JLabel FahrenheitLabel = new JLabel("Fahrenheit:"); 
	private JLabel CentigradeLabel = new JLabel("Centigrade:");
	
	private JTextField milesText = new JTextField("0");
	private JTextField kilometersText = new JTextField("0");
	private JTextField poundsText = new JTextField("0");
	private JTextField kilogramsText = new JTextField("0");
	private JTextField gallonsText = new JTextField("0"); 
	private JTextField litersText = new JTextField("0");
	private JTextField FahrenheitText = new JTextField("0"); 
	private JTextField CentigradeText = new JTextField("0");
	
	private double kilometers, kilograms, liters, centigrade;
	
	private JButton convertButton = new JButton("Convert");
	
	public void setBounds()
	{
		milesLabel.setBounds(80, 50, 70, 30);
		kilometersLabel.setBounds(280, 50, 70, 40);
		
		poundsLabel.setBounds(80, 100, 70, 40);
		kilogramsLabel.setBounds(280, 100, 70, 40);
		
		gallonsLabel.setBounds(80, 150, 70, 40);
		litersLabel.setBounds(280, 150, 70, 40);
		
		FahrenheitLabel.setBounds(80, 200, 70, 40);
		CentigradeLabel.setBounds(280, 200, 70, 40);
				
		
		milesText.setBounds(150, 50, 100, 25);
		kilometersText.setBounds(350, 50, 100, 25);
		
		poundsText.setBounds(150, 100, 100, 25);
		kilogramsText.setBounds(350, 100, 100, 25);
		
		gallonsText.setBounds(150, 150, 100, 25);
		litersText.setBounds(350, 150, 100, 25);
		
		FahrenheitText.setBounds(150, 200, 100, 25);
		CentigradeText.setBounds(350, 200, 100, 25);
		
		convertButton.setBounds(200, 250, 200, 50);
		convertButton.addActionListener((e) -> {

			kilometers = Integer.parseInt(milesText.getText()) *1.6;
			kilograms = Integer.parseInt(poundsText.getText())*.5 ;
			liters = Integer.parseInt(gallonsText.getText()) * .004;
			centigrade = (Integer.parseInt(FahrenheitText.getText())-32)*5/9;
			
			kilometersText.setText(kilometers + "");
			kilogramsText.setText(kilograms + "");
			litersText.setText(liters + "");
			CentigradeText.setText(centigrade + "");
		});
		
	}
	
		public void drawPicture()
		{
			frame.setTitle("Metric Conversion Assistant");
			frame.setVisible(true);
			frame.setSize(500, 500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel panel = new JPanel();
			panel.setLayout(null);
			
			frame.add(panel);
			setBounds();
			
			panel.add(milesLabel);
			panel.add(kilometersLabel);
			panel.add(poundsLabel);
			panel.add(kilogramsLabel);
			panel.add(gallonsLabel);
			panel.add(litersLabel);
			panel.add(FahrenheitLabel);
			panel.add(CentigradeLabel);
			
			
			panel.add(milesText);
			panel.add(kilometersText);
			panel.add(poundsText);
			panel.add(kilogramsText);
			panel.add(gallonsText);
			panel.add(litersText);
			panel.add(FahrenheitText);
			panel.add(CentigradeText);
			
			panel.add(convertButton);
			
		}
		
		public static void main(String[] args) {
			MetricConversion mc = new MetricConversion();
			mc.drawPicture();
		}
		
		/*
		miles 
		kilometers
		pounds 
		kilograms
		gallons 
		liters,
		Fahrenheit 
		Centigrade
		 * 
		 */

}
