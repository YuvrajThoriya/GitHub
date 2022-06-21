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
		this.setBounds(0,0,1600,1000);
		ml = new MyActionListener1(this);

        img = new ImageIcon("p2.JFIF");
		lbl2 = new JLabel(img);
		lbl2.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		lbl2.setVisible(true);
		
		lbl1 = new JLabel("List of insurances.");
		health = new JButton("health insurances");
		home = new JButton("home insurances");
		car = new JButton("car insurances");
		family = new JButton("family insurances");
		back = new JButton("back");
		
		f3 = new Font("Arial",Font.BOLD,20);
		f1 = new Font("Arial",Font.BOLD,15);
		f2 = new Font("Roman",Font.BOLD,50);

		lbl1.setBounds(250,200,1500,50);
		health.setBounds(250,350,500,75);
		home.setBounds(250,500,500,75);
		car.setBounds(250,650,500,75);
		family.setBounds(250,800,500,75);
		back.setBounds(50,50,150,75);
		
		lbl1.setFont(f2);
		health.setFont(f3);
		home.setFont(f3);
		car.setFont(f3);
		family.setFont(f3);
		back.setFont(f3);
		
		add(back);
		add(health);
		add(home);
		add(car);
		add(family);
        
        add(lbl1);
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
					setVisible(false);
				}
			});
	}

	/*public static void main(String args[])
	{
		List ls = new List();
		ls.setVisible(true);
	}*/
}