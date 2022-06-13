import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Home extends JFrame
{
	JButton Member_Name, Gender, DOB, PhoneNO, Age, Save, Clear, Home_Insurance, Back, Expand_Terms_n_Conditions;

	JTextField txt1,txt2,txt3,txt4,txt5;
	
	JLabel lbl1;

	MyActionListener1 mf2 = new MyActionListener1(this);

	Home()
	{
		setLayout(null);
		setBounds(0,0,550,965);
		
		txt1=new JTextField();
		txt2=new JTextField();
		txt3=new JTextField();
		txt4=new JTextField();
		txt5=new JTextField();

		Age = new JButton("Age");
		Expand_Terms_n_Conditions = new JButton("Terms and Conditions");
		Home_Insurance = new JButton("Home_Insurance");
		Member_Name =new JButton("Member_Name");
		Gender =new JButton("Gender");
		DOB =new JButton("DOB");
		PhoneNO =new JButton("PhoneNO");
		Save =new JButton("Save");
		Clear =new JButton("Clear");
		Back =new JButton("<-");
		Expand_Terms_n_Conditions = new JButton("Expand for Terms and conditions");
		
		lbl1 = new JLabel("1. Terms & Conditions");
		
		Font f1 = new Font("Times New Roman",Font.BOLD,20);	
	
		Expand_Terms_n_Conditions.setFont(f1);
		Home_Insurance.setFont(f1);
		Member_Name.setFont(f1);
		Gender.setFont(f1);
		DOB.setFont(f1);
		Age.setFont(f1);
		PhoneNO.setFont(f1);

		Back.setFont(f1);
		Save.setFont(f1);
		Clear.setFont(f1);
		Expand_Terms_n_Conditions.setFont(f1);

		txt1.setFont(f1);
		txt2.setFont(f1);
		txt3.setFont(f1);
		txt4.setFont(f1);
		txt5.setFont(f1);

		lbl1.setFont(f1);

		add(txt1);
		add(txt2);
		add(txt3);
		add(txt4);
		add(txt5);

		add(Age);
		add(Expand_Terms_n_Conditions);
		add(Member_Name);
		add(Gender);
		add(DOB);
		add(PhoneNO);

		add(Back);
		add(Save);
		add(Clear);

		add(Home_Insurance);
		add(Expand_Terms_n_Conditions);

		add(lbl1);
		
		txt1.setBounds(300,100,150,65);
		txt2.setBounds(300,200,150,65);
		txt3.setBounds(300,300,150,65);
		txt4.setBounds(300,400,150,65);
		txt5.setBounds(300,500,150,65);

		Expand_Terms_n_Conditions.setBounds(1000,75,350,75);
		Home_Insurance.setBounds(100,0,350,75);
		Member_Name.setBounds(100,100,150,65);
		Gender.setBounds(100,200,150,65);
		DOB.setBounds(100,300,150,65);
		Age.setBounds(100,400,150,65);
		PhoneNO.setBounds(100,500,150,65);
		
		Back.setBounds(0,0,65,65);
		Save.setBounds(100,600,150,65);
		Clear.setBounds(300,600,150,65);

		Expand_Terms_n_Conditions.setBounds(100,750,350,75);

		lbl1.setBounds(650,100,300,300);

		Member_Name.addActionListener(mf2);
		Gender.addActionListener(mf2);
		DOB.addActionListener(mf2);
		PhoneNO.addActionListener(mf2);
		Save.addActionListener(mf2);
		Clear.addActionListener(mf2);
		Expand_Terms_n_Conditions.addActionListener(mf2);
		Back.addActionListener(mf2);
		
		
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					setVisible(false);
				}
			});
	}

 /*	public static void main(String args[])
	{
		
	}
*/
}