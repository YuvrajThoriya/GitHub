import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import java.lang.*;
import java.awt.Font.*;


public class Main_Frame extends JFrame
{
	
	Label lbl;
	
	JButton str;
	
	Font f1,f2,f3;
	
	MyActionListener1 ml = new MyActionListener1(this);

	Main_Frame()
	{
		super("INSURANCE MANAGEMENT");
		setLayout(null);
		this.setBounds(0,0,1600,1000);

		lbl = new Label("Welcome To Insurance Management System");
		str = new JButton("Start");
		f3 = new Font("Arial",Font.BOLD,50);
		f1 = new Font("Arial",Font.BOLD,15);
		f2 = new Font("Roman",Font.BOLD,50);

		lbl.setBounds(250,200,1500,50);
		str.setBounds(600,400,300,200);
		
		lbl.setFont(f2);
		str.setFont(f3);
		
		add(lbl);
		add(str);
		
		str.addActionListener(ml);
		
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
			Main_Frame mf = new Main_Frame();
			mf.setVisible(true);
	}
}
