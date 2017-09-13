package swing;
import javax.swing.*;

public class Simple {
	JFrame jf;
	
	public Simple()
	{
		jf = new JFrame();
		jf.setVisible(true);
		jf.setLayout(null);
		jf.setSize(400, 500);
		jf.setTitle("From Constructor");
		
		JButton jb = new JButton("Click");
		jb.setSize(200, 30);
		jb.setName("Click Click");
		jf.add(jb);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Simple();
	}
}


