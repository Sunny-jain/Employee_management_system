package Employee;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class login implements ActionListener{
	JFrame f;
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton log,cancel;
	login()
	{
		f=new JFrame("Login");
		f.setLayout(null);
		
		l1=new JLabel("Username");
		l1.setBounds(40, 20, 100, 30);
		f.add(l1);
		
		l2=new JLabel("Password");
		l2.setBounds(40, 70, 100, 30);
		f.add(l2);
		
		t1=new JTextField();
		t1.setBounds(150,20,150,30);
		f.add(t1);
		
		p1=new JPasswordField();
		p1.setBounds(150, 70, 150, 30);
		f.add(p1);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Employee/images/login.jpg"));
		Image i2=i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l3=new JLabel(i3);
		l3.setBounds(350, 20, 150, 150);
		f.add(l3);
		
		log=new JButton("Login");
		log.setBackground(Color.BLACK);
		log.setForeground(Color.WHITE);
		log.setBounds(40, 140, 120, 30);
		log.setFont(new Font("serif",Font.BOLD,15));
		log.addActionListener(this);
		f.add(log);
		
		cancel=new JButton("Cancel");
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setBounds(180, 140, 120, 30);
		cancel.setFont(new Font("serif",Font.BOLD,15));
		cancel.addActionListener(this);
		f.add(cancel);
		f.setVisible(true);
		f.setSize(600, 300);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			conn c1=new conn();
			String u=t1.getText();
			String p=p1.getText();
			String q="select * from login where username='"+u+"'and password='"+p+"'";
			ResultSet rs=c1.s.executeQuery(q);
			if(rs.next())
			{
				new details().f.setVisible(true);
				f.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid Login");
				f.setVisible(false);
			}
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
	}
	public static void main(String args[])
	{
		login l=new login();
	}
}
