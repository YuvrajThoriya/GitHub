import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javafx.stage.WindowEvent;
import java.lang.*;

public class family_policy extends JFrame
{
	JButton plans,back;
	
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13, lbl14, lbl15, lbl16;

    MyActionListener1 ml = new MyActionListener1(this);

    family_policy()
    {
        setLayout(null);
        setBounds(0,0,1600,1000);

        lbl1 = new JLabel("Dear Policyholde");
        lbl2 = new JLabel("Your Simple Home Insurance Policy entitles You to various Benefits. The sections that");
        lbl3 = new JLabel("are in force under this Policy and amount of insurance available to You under each of ");
        lbl4 = new JLabel("those sections, and in total, are those that You have chosen and are listed in the ");
        lbl5 = new JLabel("Schedule that accompanies this Policy. This Schedule forms part of this Policy.");


        lbl6 = new JLabel("We request You to keep this Policy along with the Schedule in a safe place, because");
        lbl7 = new JLabel("You will need to refer to them in the event of a claim. If You claim for payment arising ");
        lbl8 = new JLabel("out of loss, damage or injury during the Period of Insurance then We shall make");
        lbl9 = new JLabel("payment to You as long as the claim falls within the section opted by You and You have");
        lbl10 = new JLabel("complied with the Policy terms and conditions.");


        lbl11 = new JLabel("We have issued this Policy to You which is the contract of insurance between You and");
        lbl12 = new JLabel("Us, as consideration for Your premium, and subject to the same having been realized");
        lbl13 = new JLabel("by Us. This is based on the information that You have given to Us in Your proposal");
        lbl14 = new JLabel("which includes any other written statement/ communication, telephone call. This");
        lbl15 = new JLabel("nformation must be complete, correct, true and accurate in every respect and forms");
        lbl16 = new JLabel("part of this contract.");
		
		plans= new JButton("get Plans");
        back= new JButton("go Back");

        Font f1 = new Font("Arial",Font.ITALIC,25);	
        
        lbl1.setFont(f1);
		lbl2.setFont(f1);
		lbl3.setFont(f1);
		lbl4.setFont(f1);
		lbl5.setFont(f1);

		lbl6.setFont(f1);
        lbl7.setFont(f1);
		lbl8.setFont(f1);
        lbl9.setFont(f1);
		lbl10.setFont(f1);

		lbl11.setFont(f1);
		lbl12.setFont(f1);
		lbl13.setFont(f1);
        lbl14.setFont(f1);
		lbl15.setFont(f1);
		lbl16.setFont(f1);

        back.setFont(f1);
        plans.setFont(f1);

        add(lbl1);
		add(lbl2);
		add(lbl3);
		add(lbl4);
		add(lbl5);

		add(lbl6);
		add(lbl7);
		add(lbl8);
        add(lbl9);
		add(lbl10);

        add(lbl11);
		add(lbl12);
		add(lbl13);
		add(lbl14);
		add(lbl15);
		add(lbl16);

		add(back);
        add(plans);

        lbl1.setBounds(100,50,1500,25);
		lbl2.setBounds(100,100,1500,25);
		lbl3.setBounds(100,130,1500,25);
		lbl4.setBounds(100,160,1500,25);
		lbl5.setBounds(100,190,1500,25);

		lbl6.setBounds(100,220,1500,25);
        lbl7.setBounds(100,250,1500,25);
		lbl8.setBounds(100,280,1500,25);
        lbl9.setBounds(100,310,1500,25);
		lbl10.setBounds(100,340,1500,25);

		lbl11.setBounds(100,370,1500,25);
		lbl12.setBounds(100,400,1500,25);
		lbl13.setBounds(100,430,1500,25);
		lbl14.setBounds(100,460,1500,25);
		lbl15.setBounds(100,590,1500,25);
        lbl16.setBounds(100,620,1500,25);
		
		back.setBounds(300,700,200,65);
        plans.setBounds(500,700,200,65);
		
		back.addActionListener(ml);
        plans.addActionListener(ml);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                setVisible(false);
            }
        });
    }
}
