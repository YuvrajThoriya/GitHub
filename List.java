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
	JLabel lbl1, lbl2;
	
	JButton health,home,car,family,back;
	
	Font f1,f2,f3;

    ImageIcon img;
	
	MyActionListener1 ml;
	
	List()
	{
		super("List");
		setLayout(null);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		
		ml = new MyActionListener1(this);

        img = new ImageIcon("List.png");
		lbl2 = new JLabel(img);
		lbl2.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		lbl2.setVisible(true);
		
		health = new JButton("HEALTH INSURANCES");
		home = new JButton("HOME INSURANCES");
		car = new JButton("CAR INSURANCES");
		family = new JButton("FAMILY INSURANCES");
		back = new JButton("< INSURANCE");
		
		f1 = new Font("Segoe UI Black",Font.BOLD,40);
		f2 = new Font("Segoe UI Black",Font.BOLD,20);

		
		health.setBounds(250,350,500,75);
		home.setBounds(250,500,500,75);
		car.setBounds(250,650,500,75);
		family.setBounds(250,800,500,75);
		back.setBounds(50,50,200,75);
		
		
		health.setFont(f1);
		home.setFont(f1);
		car.setFont(f1);
		family.setFont(f1);
		back.setFont(f2);
		
		add(back);
		add(health);
		add(home);
		add(car);
		add(family);
        
       // add(lbl1);
        add(lbl2);
		
		back.addActionListener(ml);
		health.addActionListener(ml);
		home.addActionListener(ml);
		car.addActionListener(ml);
		family.addActionListener(ml);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}

	/*public static void main(String args[])
	{
		List ls = new List();
		ls.setVisible(true);
	}*/
}