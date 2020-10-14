package Employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
public class Remove_emp implements ActionListener {
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t;
	JButton b1,b2,b3,b4;
	Remove_emp()
	{
		f=new JFrame("Remove Employee");
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(500,500);
		
		l8=new JLabel();
		l8.setBounds(0,0,500,500);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Employee/images/remove.jpg"));
		l8.setLayout(null);
		l8.setIcon(i1);
		f.add(l8);
		
		l1=new JLabel("Employee id");
		l1.setBounds(50, 50, 200, 30);
		l1.setForeground(Color.WHITE);
		Font f2=new Font("serif",Font.BOLD,25);
		l1.setFont(f2);
		l8.add(l1);
		
		t=new JTextField();
		t.setBounds(300,50,150,30);
		l8.add(t);
		
		b1=new JButton("Search");
		b1.setBounds(200, 100, 100, 30);
		b1.addActionListener(this);
		l8.add(b1);
		
		f2=new Font("serif",Font.BOLD,20);
		b2=new JButton("Back");
		b2.setBounds(360, 100, 100, 30);
		b2.addActionListener(this);
		l8.add(b2);
		
		l2=new JLabel("Name :-> ");
		l2.setBounds(50,150,250,30);
		l2.setForeground(Color.white);
		l2.setFont(f2);
		l8.add(l2);
		
		l3=new JLabel();
		l3.setBounds(200,150,350,30);	
		l3.setForeground(Color.white);
		l3.setFont(f2);
		l8.add(l3);
		
		l4=new JLabel("Mobile no. :-> ");
		l4.setBounds(50,200,250,30);
		l4.setForeground(Color.white);
		l4.setFont(f2);
		l8.add(l4);
		
		l5=new JLabel();
		l5.setBounds(200,200,350,30);	
		l5.setForeground(Color.white);
		l5.setFont(f2);
		l8.add(l5);
		
		l6=new JLabel("E-mail :-> ");
		l6.setBounds(50,250,250,30);
		l6.setForeground(Color.white);
		l6.setFont(f2);
		l8.add(l6);
		
		l7=new JLabel();
		l7.setBounds(200,250,350,30);	
		l7.setForeground(Color.white);
		l7.setFont(f2);
		l8.add(l7);
		
		b3=new JButton("Remove");
		b3.setBounds(200,300,100,30);
		b3.addActionListener(this);
		l8.add(b3);
		
		b4=new JButton("Back");
		b4.setBounds(360,300,100,30);
		b4.addActionListener(this);
		l8.add(b4);
		
		l2.setVisible(false);
		l3.setVisible(false);
		l4.setVisible(false);
		l5.setVisible(false);
		l6.setVisible(false);
		l7.setVisible(false);
		b3.setVisible(false);
		b4.setVisible(false);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			try {
				conn c=new conn();
				String s="select name,phone,email from employee where emp_id='"+t.getText()+"'";
				ResultSet rs=c.s.executeQuery(s);
				int i=0;
				if(rs.next())
				{
					String name=rs.getString(1);
					String phone=rs.getString(2);
					String email=rs.getString(3);
					
					l3.setText(name);
					l5.setText(phone);
					l7.setText(email);
					l2.setVisible(true);
					l3.setVisible(true);
					l4.setVisible(true);
					l5.setVisible(true);
					l6.setVisible(true);
					l7.setVisible(true);
					b3.setVisible(true);
					b4.setVisible(true);
					i=1;
				}
				if(i==0)
				{
					JOptionPane.showMessageDialog(null, "Id not found");
				}
			}
			catch(Exception ae){}
		}
		else if(e.getSource()==b2)
		{
			f.setVisible(false);
			new details();
		}
		else if(e.getSource()==b3)
		{
			try
			{
				conn c=new conn();
				String q="delete from employee where emp_id='"+t.getText()+"'";
				c.s.executeUpdate(q);
				JOptionPane.showMessageDialog(null, "Deleted Successfully");
				l2.setVisible(false);
				l3.setVisible(false);
				l4.setVisible(false);
				l5.setVisible(false);
				l6.setVisible(false);
				l7.setVisible(false);
				b3.setVisible(false);
				b4.setVisible(false);
			}
			catch(Exception ae)
			{
				JOptionPane.showMessageDialog(null, "Error Occured");
			}
		}
		else
		{
			f.setVisible(false);
			new details();
		}
	}
	public static void main(String[] args) {
		Remove_emp a=new Remove_emp();
	}
}
