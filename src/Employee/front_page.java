package Employee;
 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class front_page implements ActionListener{
	JFrame f;
	JLabel id,l1;
	JButton b;
	front_page()
	{
		f=new JFrame("Employee Management System");
		f.setBackground(Color.red);
		f.setLayout(null);
		
     	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Employee/images/front.jpg"));
		Image i2=i1.getImage()
.getScaledInstance(1200, 500, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l=new JLabel(i3);
		
		l.setBounds(80, 150, 900, 500);
		f.add(l);
		
		b=new JButton("Click Here To Continue");
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		
		b.setBounds(425, 500, 200, 50);
		b.setLayout(null);
		b.addActionListener(this);
		
		l1=new JLabel();
		l1.setBounds(0, 0, 1100, 700);
		l1.setLayout(null);
		
		
		JLabel lid=new JLabel("Employee Management System");
		lid.setBounds(80, 30, 1500, 100);
		lid.setFont(new Font("serif",Font.PLAIN,70));
		lid.setForeground(Color.red);
		l1.add(lid);
		
		l1.add(b);
		f.add(l1);
		
		f.setVisible(true);
		f.setSize(1100, 700);
		f.setLocation(0,0);
		
	}
	public static void main(String[] args)
	{
		front_page f=new front_page();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
			f.setVisible(false);
			new login();
		}
		
	}
	
}