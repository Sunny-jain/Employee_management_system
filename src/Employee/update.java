package Employee;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class update implements ActionListener{
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l,l13,lab,lab1;
    String emp_id,name,father,address,phone,email,education,post,age,dob,aadhar;

	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
	JButton b1,b;
	update(String e_id)
	{
		 try{
	            conn con = new conn();
	            String str = "select * from employee where emp_id = '"+e_id+"'";
	            ResultSet rs= con.s.executeQuery(str);

	            while(rs.next()){

	               
	                name = rs.getString("name");
	                father = rs.getString("fname");
	                age = rs.getString("age");
	                dob = rs.getString("dob");
	                address = rs.getString("address");
	                phone = rs.getString("phone");
	                email = rs.getString("email");
	                education = rs.getString("education");
	                post = rs.getString("post");
	                aadhar = rs.getString("aadhar");
	                emp_id = rs.getString("emp_id");
	            }
	        }catch(Exception e){
	            e.printStackTrace();
	        }
		f=new JFrame("update");
		f.setLayout(null);
		
		l=new JLabel();
		ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("Employee/images/add_employee.jpg"));
		l.setBounds(0, 0, 900, 700);
		l.setLayout(null);
		l.setIcon(i);
		
		l13=new JLabel("update Employee Details");
		l13.setBounds(320,30,500,50);
		l13.setFont(new Font("serif",Font.BOLD,25));
		l13.setForeground(Color.black);
		l.add(l13);
		
		l1=new JLabel("Name");
		l1.setBounds(50, 150, 100, 30);
		l1.setFont(new Font("serif",Font.BOLD,20));
		l.add(l1);
		
		t1=new JTextField();
		t1.setBounds(200,150,150,30);
		l.add(t1);
		
		l2=new JLabel("Father's Name");
		l2.setBounds(400, 150, 200, 30);
		l2.setFont(new Font("serif",Font.BOLD,20));
		l.add(l2);
		
		t2=new JTextField();
		t2.setBounds(600,150,150,30);
		l.add(t2);
		
		l3=new JLabel("Age");
		l3.setBounds(50, 200, 100, 30);
		l3.setFont(new Font("serif",Font.BOLD,20));
		l.add(l3);
		
		t3=new JTextField();
		t3.setBounds(200,200,150,30);
		l.add(t3);
		
		l4=new JLabel("Date of Birth");
		l4.setBounds(400, 200, 200, 30);
		l4.setFont(new Font("serif",Font.BOLD,20));
		l.add(l4);
		
		t4=new JTextField();
		t4.setBounds(600,200,150,30);
		l.add(t4);
		
		l5=new JLabel("Address");
		l5.setBounds(50, 250, 100, 30);
		l5.setFont(new Font("serif",Font.BOLD,20));
		l.add(l5);
		
		t5=new JTextField();
		t5.setBounds(200,250,150,30);
		l.add(t5);
		
		l6=new JLabel("Phone");
		l6.setBounds(400, 250, 100, 30);
		l6.setFont(new Font("serif",Font.BOLD,20));
		l.add(l6);
		
		t6=new JTextField();
		t6.setBounds(600,250,150,30);
		l.add(t6);
		
		l7=new JLabel("E-mail");
		l7.setBounds(50, 300, 100, 30);
		l7.setFont(new Font("serif",Font.BOLD,20));
		l.add(l7);
		
		t7=new JTextField();
		t7.setBounds(200,300,150,30);
		l.add(t7);
		
		l8=new JLabel("Education");
		l8.setBounds(400, 300, 100, 30);
		l8.setFont(new Font("serif",Font.BOLD,20));
		l.add(l8);
		
		t8=new JTextField();
		t8.setBounds(600,300,150,30);
		l.add(t8);
		
		l9=new JLabel("Job Post");
		l9.setBounds(50, 350, 100, 30);
		l9.setFont(new Font("serif",Font.BOLD,20));
		l.add(l9);
		
		t9=new JTextField();
		t9.setBounds(200,350,150,30);
		l.add(t9);
		
		l10=new JLabel("Aadhar No.");
		l10.setBounds(400, 350, 100, 30);
		l10.setFont(new Font("serif",Font.BOLD,20));
		l.add(l10);
		
		t10=new JTextField();
		t10.setBounds(600,350,150,30);
		l.add(t10);
		
		l11=new JLabel("Employee no.");
		l11.setBounds(50, 400, 200, 30);
		l11.setFont(new Font("serif",Font.BOLD,20));
		l.add(l11);
		
		t11=new JTextField();
		t11.setBounds(200,400,150,30);
		l.add(t11);
		
		
        lab=new JLabel();
        lab.setBounds(200,450,250,200);
        l.add(lab);

        lab1=new JLabel("");
        lab1.setBounds(600,450,250,200);
        l.add(lab1);

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,550,150,40);
        b.addActionListener(this);
        l.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);
        b1.addActionListener(this);
        l.add(b1);
        
        f.add(l);
        f.setVisible(true);
        f.setSize(900,700);
        
        t1.setText(name);
        t2.setText(father);
        t3.setText(age);
        t4.setText(dob);
        t5.setText(address);
        t6.setText(phone);
        t7.setText(email);
        t8.setText(education);
        t9.setText(post);
        t10.setText(aadhar);
        t11.setText(emp_id);
        
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			f.setVisible(false);
			new Update_emp();
		}
		else
		{
	        if(ae.getSource() == b){
	            try{
	                conn cc = new conn();
	                String q = "update employee set name='"+t1.getText()+"',fname='"+t2.getText()+"',age='"+t3.getText()+"',dob='"+t4.getText()+"',address='"+t5.getText()+"',phone='"+t6.getText()+"',email='"+t7.getText()+"',education='"+t8.getText()+"',post='"+t9.getText()+"',aadhar='"+t10.getText()+"',emp_id='"+t11.getText()+"' where emp_id='"+emp_id+"'";
	                cc.s.executeUpdate(q);
	                JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
	                f.setVisible(false);
	                new details();
	            }catch(Exception ee){
	                System.out.println("The error is:"+ee);
	            }
	        }
		}
		
	}
	
	public static void main()
	{
		update a=new update("1002");
	}
}
