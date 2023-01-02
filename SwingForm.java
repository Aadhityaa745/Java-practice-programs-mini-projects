package projects;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;
public class SwingForm implements ActionListener{

JFrame f = new JFrame();

JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
JTextField tf1,tf2,tf3,tf4,tf5;
JTextArea ta;
JCheckBox cb1,cb2,cb3;
JRadioButton rb1,rb2,rb3;
JComboBox c1,c2;
ButtonGroup b = new ButtonGroup();
JButton b1,b2;
String item = "";
ArrayList<JCheckBox> al = new ArrayList<>();
SwingForm(){
	
	f.getContentPane().setBackground(Color.pink);
		l1 = new JLabel("Registration Form");
		l1.setBounds(450,15,200,45);
		
		l2 = new JLabel("Name");
		l2.setBounds(70,100,60,40);
		
		tf1 = new JTextField();
		tf1.setBounds(170,100,250,40);
		
		l3 = new JLabel("Age");
		l3.setBounds(70,150,40,40);
		
		tf2 = new JTextField();
		tf2.setBounds(170,150,50,40);
		
		l4 = new JLabel("Address");
		l4.setBounds(70,200,80,40);
		
		ta = new JTextArea();
		ta.setBounds(170,200,250,130);
		
		l5 = new JLabel("Hobbies");
		l5.setBounds(70,350,80,40);
		
		cb1 = new JCheckBox("Gaming");
		cb1.setBounds(170,350,80,30);
		
		cb2 = new JCheckBox("Movies");
		cb2.setBounds(250,350,80,30);
		
		cb3 = new JCheckBox("Reading");
		cb3.setBounds(330,350,80,30);
		al.add(cb1);al.add(cb2);al.add(cb3);
		
		l6 = new JLabel("Father Name");
		l6.setBounds(500,100,90,40);
		
		tf3 = new JTextField();
		tf3.setBounds(600,100,220,40);
		
		l7 = new JLabel("Sex");
		l7.setBounds(500,150,40,40);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(600,150,60,40);
		rb1.setActionCommand("Male");
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(660,150,70,40);
		rb2.setActionCommand("Female");
		
		rb3 = new JRadioButton("Others");
		rb3.setBounds(730,150,70,40);
		rb3.setActionCommand("Others");
		
		l8 = new JLabel("Course");
		l8.setBounds(500,200,60,40);
		
		String arr[] = {"BSC","BCA","BBA","BCOM"};
		c1 = new JComboBox(arr);
		c1.setBounds(600,200,80,40);
		
		l9 = new JLabel("Phone");
		l9.setBounds(500,250,40,40);
		
		tf4 = new JTextField();
		tf4.setBounds(600,250,220,40);
		
		l10 = new JLabel("E-Mail");
		l10.setBounds(500,300,40,40);
		
		tf5 = new JTextField();
		tf5.setBounds(600,300,220,40);
		
		l11 = new JLabel("Nation");
		l11.setBounds(500,350,40,40);
		
		String brr [] = {"India","Australia","USA","Canada","UK"};
		c2  = new JComboBox(brr);
		c2.setBounds(600,350,80,40);
		
		b1= new JButton("Submit");
		b1.setBounds(350,450,90,40);
		b1.addActionListener(this);
		
		b2 = new JButton("Cancel");
		b2.setBounds(450,450,90,40);
		b2.addActionListener(this);
		
		f.add(l1); f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);f.add(l8);f.add(l9);f.add(l10);f.add(l11);
		f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);f.add(tf5);
		f.add(ta);
		f.add(cb1);f.add(cb2);f.add(cb3);
		b.add(rb1);b.add(rb2);b.add(rb3);f.add(rb1);f.add(rb2);f.add(rb3);
		f.add(c1);f.add(c2);
		f.add(b1); f.add(b2);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(1000,700);
		f.setTitle("Registration Form");
	}
	
	public static void main(String[] args) {
		SwingForm rf = new SwingForm();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b2) {
			f.setVisible(false);
		}
		else if(e.getSource()==b1) {
			report();
		}
	}
	void report () {
		try {
		JFrame f1 = new JFrame();
		JLabel a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
		JLabel t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
		
		JLabel title = new JLabel("Report");
		title.setBounds(160,50,100,40);
		
		a1 = new JLabel("Name : ");
		a1.setBounds(70,100,60,40);
		
		t1 = new JLabel(tf1.getText());
		t1.setBounds(170,100,250,40);
		
		a2 = new JLabel("Age : ");
		a2.setBounds(70,150,40,40);
		
		t2 = new JLabel(tf2.getText());
		t2.setBounds(170,150,50,40);
		
		a3 = new JLabel("Address : ");
		a3.setBounds(70,200,80,40);
		
		t3 = new JLabel(ta.getText());
		t3.setBounds(170,200,250,40);
		
		a4 = new JLabel("Hobbies : ");
		a4.setBounds(70,250,80,40);
		
		t4 = new JLabel();
		for(JCheckBox cb : al) {
			if(cb.isSelected()) {
				item = item+cb.getLabel()+", ";
			}
		}
		t4.setText(item);
		t4.setBounds(170,250,200,40);
		
		a5 = new JLabel("Father Name : ");
		a5.setBounds(70,300,100,40);
		
		t5 = new JLabel(tf3.getText());
		t5.setBounds(170,300,200,40);
		
		a6 = new JLabel("Sex : ");
		a6.setBounds(70,350,100,40);
		
		t6= new JLabel(b.getSelection().getActionCommand());
		t6.setBounds(170,350,100,40);
		
		a7 = new JLabel("Course : ");
		a7.setBounds(70,400,100,40);
		
		t7 = new JLabel(c1.getSelectedItem().toString());
		t7.setBounds(170,400,100,40);
		
		a8 = new JLabel("Phone : ");
		a8.setBounds(70,450,100,40);
		
		t8= new JLabel(tf4.getText());
		t8.setBounds(170,450,100,40);
		
		a9 = new JLabel("Email : ");
		a9.setBounds(70,500,100,40);
		
		t9 = new JLabel(tf5.getText());
		t9.setBounds(170,500,100,40);
		
		a10 = new JLabel("Nation : ");
		a10.setBounds(70,550,100,40);
		
		t10 = new JLabel(c2.getSelectedItem().toString());
		t10.setBounds(170,550,100,40);
		
		f1.add(a1); f1.add(a2);f1.add(a3);f1.add(a4);f1.add(a5);
		f1.add(a6);f1.add(a7);f1.add(a8);f1.add(a9);f1.add(a10);
		f1.add(t1);f1.add(t2);f1.add(t3);f1.add(t4);f1.add(t5);
		f1.add(t6);f1.add(t7);f1.add(t8);f1.add(t9);f1.add(t10);
		f1.add(title);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setSize(1000,700);
		f1.setTitle("Report");
		}
		
		catch(Exception e) {
			JOptionPane p = new JOptionPane();
			p.showMessageDialog(f, "Please fill all the Fields to complete the Registration!","Error!", JOptionPane.ERROR_MESSAGE);
		}
	}
}
