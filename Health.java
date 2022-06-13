import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Health extends JFrame
{											// label 1,2,3,4,5,6 are in text and lbl 7 is bgimage lbl8 is bottom line in health frame		
	JLabel Member_Name,Gender,DOB,PhoneNO,Age,Health_Insurance,Expand,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8;

	JTextField txt1,txt2,txt3,txt4,txt5;
	
	JButton Save,Clear,click_here,Back;

	JComboBox cmb1;

	ImageIcon img;

	MyActionListener1 ml = new MyActionListener1(this);

	Health()
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
		 
		Age = new JLabel("Age");
		Health_Insurance = new JLabel("Health_Insurance");
		Member_Name =new JLabel("Member_Name");
		Gender =new JLabel("Gender");
		DOB =new JLabel("DOB");
		PhoneNO =new JLabel("PhoneNO");
		Expand = new JLabel("Expand for Terms and conditions");

		Save =new JButton("Save");
		Clear =new JButton("Clear");
		click_here =new JButton("Click_here");
		Back =new JButton("<");

		String[] choice = {"Select","Male", "Female", "Others", "Prefer to not Say"};
		cmb1 = new JComboBox(choice);
		
		lbl1 = new JLabel("1. Terms & Conditions");
		lbl2 = new JLabel("The insurance cover provided under this Policy to the Insured Person up to the Sum Insured is and shall");
		lbl3 = new JLabel("be subject to (a) the terms and conditions of this Policy and (b) the receipt of premium, and (c) Disclosure");
		lbl4 = new JLabel("to Information Norm (including by way of the Proposal or Information Summary Sheet) for Yourself and on");
		lbl5 = new JLabel("behalf of all persons to be insured. Please inform Us immediately of any change in the address, nature of");
		lbl6 = new JLabel("job, state of health, or of any other changes affecting You or any Insured Person.");
		// lbl7 is for image
		lbl8 = new JLabel("For more Information Regarding Health Insuarance");

		Font f1 = new Font("Times New Roman",Font.BOLD,20);	
		Font f2 = new Font("Arial",Font.ITALIC,30);	
	
		Health_Insurance.setFont(f1);
		Member_Name.setFont(f1);
		Gender.setFont(f1);
		DOB.setFont(f1);
		Age.setFont(f1);
		PhoneNO.setFont(f1);

		Back.setFont(f1);
		Save.setFont(f1);
		Clear.setFont(f1);
		Expand.setFont(f1);
		cmb1.setFont(f1);
		click_here.setFont(f1);

		txt1.setFont(f1);
		txt2.setFont(f1);
		txt3.setFont(f1);
		txt4.setFont(f1);
		txt5.setFont(f1);

		lbl1.setFont(f2);
		lbl2.setFont(f2);
		lbl3.setFont(f2);
		lbl4.setFont(f2);
		lbl5.setFont(f2);
		lbl6.setFont(f2);
		lbl8.setFont(f2);

		add(txt1);
		add(txt2);
		add(txt3);
		add(txt4);
		add(txt5);
		add(cmb1);

		add(Age);
		add(Member_Name);
		add(Gender);
		add(DOB);
		add(PhoneNO);

		add(Save);
		add(Clear);
		add(click_here);
		add(Back);
		
		add(Health_Insurance);
		add(Expand);

		add(lbl1);
		add(lbl2);
		add(lbl3);
		add(lbl4);
		add(lbl5);
		add(lbl6);
		add(lbl7);
		add(lbl8);

		txt1.setBounds(300,150,150,65);
		cmb1.setBounds(300,250,150,65);
		txt3.setBounds(300,350,150,65);
		txt4.setBounds(300,450,150,65);
		txt5.setBounds(300,550,150,65);

		Health_Insurance.setBounds(100,50,350,75);
		Member_Name.setBounds(100,150,150,65);
		Gender.setBounds(100,250,150,65);
		DOB.setBounds(100,350,150,65);
		Age.setBounds(100,450,150,65);
		PhoneNO.setBounds(100,550,150,65);

		Save.setBounds(100,650,150,65);
		Clear.setBounds(300,650,150,65);
		click_here.setBounds(1150,900,150,65);
		Back.setBounds(0,0,65,65);
		
		Expand.setBounds(100,800,350,75);

		lbl1.setBounds(550,50,300,300);
		lbl2.setBounds(550,70,1500,500);
		lbl3.setBounds(550,150,1500,500);
		lbl4.setBounds(550,200,1500,500);
		lbl5.setBounds(550,250,1500,500);
		lbl6.setBounds(550,300,1500,500);
		lbl8.setBounds(900,600,1500,500);

		Save.addActionListener(ml);
		click_here.addActionListener(ml);
		Back.addActionListener(ml);
			
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					setVisible(false);
				}
			});
	}

 	public static void main(String args[])
	{
		
	}

}

//This is the end of our project health file xDDD......