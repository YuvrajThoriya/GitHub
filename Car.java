import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Car extends JFrame
{											// label 1,2,3,4,5,6 are in text and lbl 7 is bgimage lbl8 is bottom line in Car frame		
	JLabel member_name,gender,dob,phoneno,age,car_insurance,lbl7;

	JTextField txt1,txt2,txt3,txt4,txt5;
	
	JButton save,clear,back;

	JComboBox cmb1;

	ImageIcon img;

	MyActionListener1 ml = new MyActionListener1(this);

	Car()
	{
		setLayout(null);
		setBounds(0,0,550,965);
		
		txt1=new JTextField();
		txt2=new JTextField();
		txt3=new JTextField();
		txt4=new JTextField();
		txt5=new JTextField();

		img = new ImageIcon("p1.JPG");
		lbl7 = new JLabel(img);
		lbl7.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		lbl7.setVisible(true);
		 
		age = new JLabel("Age");
		car_insurance = new JLabel("Car Insurance");
		member_name =new JLabel("Member Name");
		gender =new JLabel("Gender");
		dob =new JLabel("DOB");
		phoneno =new JLabel("Phone No");

		save =new JButton("Save           ");
		clear =new JButton("Clear           ");
		back =new JButton("< Back");

		String[] choice = {"Select","Male", "Female", "Others", "Prefer to not Say"};
		cmb1 = new JComboBox(choice);

		Font f1 = new Font("Times New Roman",Font.BOLD,20);	
		Font f2 = new Font("Arial",Font.ITALIC,30);	
	
		car_insurance.setFont(f1);
		member_name.setFont(f1);
		gender.setFont(f1);
		dob.setFont(f1);
		age.setFont(f1);
		phoneno.setFont(f1);

		back.setFont(f1);
		save.setFont(f1);
		clear.setFont(f1);
		cmb1.setFont(f1);
		

		txt1.setFont(f1);
		txt2.setFont(f1);
		txt3.setFont(f1);
		txt4.setFont(f1);
		txt5.setFont(f1);

		add(txt1);
		add(txt2);
		add(txt3);
		add(txt4);
		add(txt5);
		add(cmb1);

		add(age);
		add(member_name);
		add(gender);
		add(dob);
		add(phoneno);

		add(save);
		add(clear);
		
		add(back);
		
		add(car_insurance);

		txt1.setBounds(300,150,150,65);
		cmb1.setBounds(300,250,150,65);
		txt3.setBounds(300,350,150,65);
		txt4.setBounds(300,450,150,65);
		txt5.setBounds(300,550,150,65);

		car_insurance.setBounds(100,50,350,75);
		member_name.setBounds(100,150,150,65);
		gender.setBounds(100,250,150,65);
		dob.setBounds(100,350,150,65);
		age.setBounds(100,450,150,65);
		phoneno.setBounds(100,550,150,65);

		save.setBounds(100,650,150,65);
		clear.setBounds(300,650,150,65);
		back.setBounds(0,0,65,65);

		save.addActionListener(ml);
		back.addActionListener(ml);
		clear.addActionListener(ml);
			
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
		
	}
}