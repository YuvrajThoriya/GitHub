import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import java.lang.*;
import java.awt.Font.*;


public class List extends JFrame
{
	Label lbl;
	
	JButton Health,Home,Car,Family,Back;
	
	Font f1,f2,f3;
	
	MyActionListener1 ls1 = new MyActionListener1(this);
	
	List()
	{
		super("List");
		setLayout(null);
		this.setBounds(0,0,1600,1000);

		lbl = new Label("List of insurances.");
		Health = new JButton("Health insurances");
		Home = new JButton("Home insurances");
		Car = new JButton("Car insurances");
		Family = new JButton("Family insurances");
		Back = new JButton("< Back");
		
		f3 = new Font("Arial",Font.BOLD,20);
		f1 = new Font("Arial",Font.BOLD,15);
		f2 = new Font("Roman",Font.BOLD,50);

		lbl.setBounds(250,200,1500,50);
		Health.setBounds(250,350,500,75);
		Home.setBounds(250,500,500,75);
		Car.setBounds(250,650,500,75);
		Family.setBounds(250,800,500,75);
		Back.setBounds(50,50,150,75);
		
		lbl.setFont(f2);
		Health.setFont(f3);
		Home.setFont(f3);
		Car.setFont(f3);
		Family.setFont(f3);
		Back.setFont(f3);
		
		add(Back);
		add(lbl);
		add(Health);
		add(Home);
		add(Car);
		add(Family);	
		
		Back.addActionListener(ls1);
		Health.addActionListener(ls1);
		Home.addActionListener(ls1);
		Car.addActionListener(ls1);
		Family.addActionListener(ls1);
		
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
		List ls = new List();
		ls.setVisible(true);
	}
}