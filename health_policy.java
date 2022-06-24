import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class health_policy extends JFrame
{
	JButton plans,back;
	
	JLabel lbl2;
	
	MyActionListener1 ml;
	
	Font f1,f2;
	
	ImageIcon img;
	
    health_policy()
    {
		super("Health insurance policy");
        setLayout(null);
        ml = new MyActionListener1(this);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        
		img = new ImageIcon("Health Policy.png");
		lbl2 = new JLabel(img);
		lbl2.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
		lbl2.setVisible(true);
        
        plans= new JButton("   GET PLANS   ");
        back= new JButton("< List      ");

        f1 = new Font("Segoe UI Black",Font.BOLD,30);
		f2 = new Font("Segoe UI Black",Font.BOLD,20);

        back.setFont(f2);
        plans.setFont(f1);
		
		add(lbl2);

        add(back);
        add(plans);

        back.setBounds(50,50,200,75);
        plans.setBounds(1300,800,300,100);
      
        back.addActionListener(ml);
        plans.addActionListener(ml);

        addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});

     }
}