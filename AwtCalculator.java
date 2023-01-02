package projects;
import java.awt.*;
import java.awt.event.*;

public class AwtCalculator implements ActionListener{
	
	Frame f = new Frame();
	Button b1,b2,b3,b4,b5;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	
	AwtCalculator(){
		
		l1 = new Label("Enter Number 1 : ");
		l1.setBounds(100,100,100,30);
		
		t1 = new TextField();
		t1.setBounds(200,100,200,30);
		
		
		l2 = new Label("Enter Number 2 : ");
		l2.setBounds(100,200,100,30);
		
		t2 = new TextField();
		t2.setBounds(200,200,200,30);
		
		l3 = new Label("Result : ");
		l3.setBounds(100,300,100,30);
		
		t3 = new TextField();
		t3.setBounds(200,300,200,30);
		
		b1 = new Button("Add");
		b1.setBounds(100,400,60,30);
		b1.addActionListener(this);
		
		b2 = new Button("Sub");
		b2.setBounds(170,400,60,30);
		b2.addActionListener(this);
		
		b3 = new Button("Mul");
		b3.setBounds(240,400,60,30);
		b3.addActionListener(this);
		
		b4 = new Button("Div");
		b4.setBounds(310,400,60,30);
		b4.addActionListener(this);
		
		b5 = new Button("Cancel");
		b5.setBounds(380,400,60,30);
		b5.addActionListener(this);
		
		f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
		f.add(l1);f.add(l2);f.add(l3);
		f.add(t1);f.add(t2);f.add(t3);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(700,500);
		f.setTitle("Calculator");
	}
	public static void main(String[] args) {
		
		AwtCalculator c = new AwtCalculator();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
	//	String num1 = t1.getText();
	//	String num2 = t2.getText();
		
		if(e.getSource()==b1) {
			t3.setText(Integer.toString(num1+num2));
		}
		else if(e.getSource()==b2) {
			t3.setText(Integer.toString(num1-num2));
		}
		else if(e.getSource()==b3) {
			t3.setText(Integer.toString(num1*num2));
		}
		else if(e.getSource()==b4) {
			t3.setText(Integer.toString(num1/num2));
		}
		else {
			f.setVisible(false);
		}
	}

}
