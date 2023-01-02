package javaSwing;
import javax.swing.*;

public class SwingPasswordField {
	
	JFrame f = new JFrame();
	
	SwingPasswordField(){
		
		JLabel l1 = new JLabel("Enter Username : ");
		l1.setBounds(50,50,120,30);
		
		JLabel l2 = new JLabel("Enter Password : ");
		l2.setBounds(50,100,120,30);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(200,50,200,30);
		
		JPasswordField pf = new JPasswordField();
		pf.setBounds(200,100,200,30);
		
		f.add(l1);f.add(l2);f.add(tf1);f.add(pf);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,300);
		f.setTitle("JPasswordField");
		
	}
	public static void main(String[] args) {
		
		SwingPasswordField sp = new SwingPasswordField();
	}
}
