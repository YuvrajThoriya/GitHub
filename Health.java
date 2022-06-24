import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Health extends JFrame
{
	JLabel lbl2;

	JTextField txt1,txt2,txt3,txt4,txt5;
	
	JButton save,clear,back;

	Font f1,f2;

	JComboBox cmb1;

	ImageIcon img;

	MyActionListener1 ml;

	Health()
	{
		super("Get health insurance");
		setLayout(null);
		ml = new MyActionListener1(this);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		
		img = new ImageIcon("Health.png");
		lbl2 = new JLabel(img);
		lbl2.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		lbl2.setVisible(true);
		
		txt1=new JTextField();
		txt2=new JTextField();
		txt3=new JTextField();
		txt4=new JTextField();
		txt5=new JTextField();

		save =new JButton("   SAVE   ");
		clear =new JButton("   CLEAR   ");
		back =new JButton("< HEALTH POLICY");

		String[] choice = {"Select","Male", "Female", "Others", "Prefer to not Say"};
		cmb1 = new JComboBox(choice);

		f1 = new Font("Segoe UI Black",Font.BOLD,30);
		f2 = new Font("Segoe UI Black",Font.BOLD,20);

		back.setFont(f2);
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

		add(lbl2);
		
		add(save);
		add(clear);
		
		add(back);

		txt1.setBounds(700,280,300,100);
		cmb1.setBounds(700,410,300,100);
		txt3.setBounds(700,540,300,100);
		txt4.setBounds(700,670,300,100);
		txt5.setBounds(700,800,300,100);

		save.setBounds(1300,300,300,100);
		clear.setBounds(1300,700,300,100);
		back.setBounds(50,50,300,100);

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