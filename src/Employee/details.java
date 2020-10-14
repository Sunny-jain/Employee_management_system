package Employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class details implements ActionListener {
	JFrame f;
	JLabel l1,l2;
	JButton b1,b2,b3,b4;
	
	details()
	{
		f=new JFrame("Employee Details");
		f.setLayout(null);
		
		l1=new JLabel();
		l1.setBounds(0,0,700,500);
		l1.setLayout(null);;
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Employee/images/details.jpg"));
		l1.setIcon(i1);
		f.add(l1);
		
		l2=new JLabel("Employee Details");
		l2.setBounds(430,20,200,40);
		l2.setFont(new Font("serif",Font.BOLD,25));
		l2.setForeground(Color.BLUE);
		l1.add(l2);
		
		b1=new JButton("Add");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setFont(new Font("serif",Font.BOLD,15));
		b1.setBounds(420, 80, 100, 20);
		b1.addActionListener(this);
		l1.add(b1);
		
		b2=new JButton("View");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setFont(new Font("serif",Font.BOLD,15));
		b2.setBounds(420, 180, 100, 20);
		b2.addActionListener(this);
		l1.add(b2);
		
		b3=new JButton("Remove");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setFont(new Font("serif",Font.BOLD,15));
		b3.setBounds(560, 80, 100, 20);
		b3.addActionListener(this);
		l1.add(b3);
		
		b4=new JButton("Update");
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.setFont(new Font("serif",Font.BOLD,15));
		b4.setBounds(560, 180, 100, 20);
		b4.addActionListener(this);
		l1.add(b4);
		
		f.setVisible(true);
		f.setSize(700,500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			f.setVisible(false);
			new Add_emp();
		}
		if(e.getSource()==b2)
		{
			f.setVisible(false);
			new View_emp();
		}
		if(e.getSource()==b3)
		{
			f.setVisible(false);
			new Remove_emp();
		}
		if(e.getSource()==b4)
		{
			f.setVisible(false);
			new Update_emp();
		}
	}
	public static void main(String[] aergs)
	{
		details d=new details();
	}
}
