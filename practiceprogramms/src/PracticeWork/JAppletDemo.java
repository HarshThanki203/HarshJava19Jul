package PracticeWork;
import javax.swing.*;
import java.awt.event.*;


public class JAppletDemo extends JApplet implements ActionListener{
	
	JTextField t1;
	JButton b1;
	
	public void init()
	{
		setLayout(null);
		t1 = new JTextField("");
		b1 = new JButton("Press Me");
		t1.setBounds(20,20,100,30);
		b1.setBounds(20,60,100,20);
		add(t1);
		add(b1);
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		t1.setText("BOOM !!!");
		
	}

}
