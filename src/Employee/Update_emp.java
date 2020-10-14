package Employee;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Update_emp implements ActionListener{
	JFrame f;
	JLabel l1,l2;
	JTextField t1;
	JButton b1,b2;
	
	Update_emp()
	{
		f=new JFrame();
		f.setLayout(null);
		
		l1=new JLabel();
		l1.setBounds(0, 0, 500, 270);
		l1.setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Employee/images/view.jpg"));
		l1.setIcon(i1);
		
		l2=new JLabel("Employee ID");
		l2.setBounds(40,60,250,30);
		l2.setForeground(Color.WHITE);
		Font F1=new Font("serif",Font.BOLD,30);
		l2.setFont(F1);
		l1.add(l2);
		f.add(l1);
		
		t1=new JTextField();
		t1.setBounds(240, 60, 220, 30);
		l1.add(t1);
		
		b1=new JButton("Search");
		b1.setBounds(240, 150, 100, 30);
		b1.addActionListener(this);
		l1.add(b1);
		
		b2=new JButton("Cancel");
		b2.setBounds(360, 150, 100, 30);
		b2.addActionListener(this);
		l1.add(b2);
		
		f.setVisible(true);
		f.setSize(500,270);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2)
		{
			f.setVisible(false);
			new details();
		}
		else
		{
			f.setVisible(false);
			new update(t1.getText());
		}
		
	}
	
	public static void main(String[] args)
	{
		Update_emp z=new Update_emp(); 
	}
	
}
