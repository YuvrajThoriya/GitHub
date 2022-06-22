import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import java.lang.*;
import java.awt.Font.*;


public class Thanks extends JFrame
{
	
	JLabel lbl;
	
	JButton str;
	
	Font f1;
	
	ImageIcon img;
	
	MyActionListener1 ml = new MyActionListener1(this);

	Thanks()
	{
		super("Thanks");
		setLayout(null);
		this.setBounds(0,0,980,750);
		
		img = new ImageIcon("thanks.jpg");
		lbl = new JLabel(img);
		lbl.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		lbl.setVisible(true);

		str = new JButton("Ok");
		f1 = new Font("Times New Roman",Font.BOLD,30);

		str.setBounds(450,550,100,75);
		
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
			Thanks mf = new Thanks();
			mf.setVisible(true);
	}
}
