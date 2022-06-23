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
	
	JLabel lbl;
	
	JButton str;
	
	Font f1;
	
	ImageIcon img;
	
	MyActionListener1 ml = new MyActionListener1(this);

	Main_Frame()
	{
		super("INSURANCE MANAGEMENT");
		setLayout(null);
		//this.setBounds(0,0,1920,1080);
		
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		
		img = new ImageIcon("MainFrame.png");
		lbl = new JLabel(img);
		lbl.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		lbl.setVisible(true);

		str = new JButton("START");
		
		f1 = new Font("Segoe UI Black",Font.BOLD,60);

		str.setBounds(150,500,300,200);
		
		str.setFont(f1);
		
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
