import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class health_policy extends JFrame
{
	JButton plans,back;
	
	JLabel lbl0, lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13, lbl14, lbl15, lbl16, lbl17, lbl18;
	
	MyActionListener1 ml;
	
    health_policy()
    {
        setLayout(null);
        ml = new MyActionListener1(this);
		setBounds(0,0,1600,1000);
        
        lbl0= new JLabel("Health Insurance Policy");
        lbl1 = new JLabel("The following words or terms shall have the meaning ascribed to them wherever they appear in this ");
        lbl2= new JLabel("Policy, and references to the singular or to the masculine shall include references to the plural and to ");
        lbl3= new JLabel("the feminine wherever the context so permits:");
        lbl4= new JLabel("Accident or Accidental means a sudden, unintended, fortuitous visible and external event.");
        lbl5= new JLabel("Building means any under construction or fully enclosed civil structure with walls and a roof, used ");
        lbl6= new JLabel("primarily for domestic / residential purposes, including all the electrical fittings and plumbing work, ");
        lbl7= new JLabel("collapsible and fixed grills, gates, doors and windows and also the boundary wall, fencing, out");
        lbl8= new JLabel("house, pump house etc forming part of the insured premises and / or for the protection of the ");
        lbl9= new JLabel("contents within the Insured Premises");
        lbl10= new JLabel("Deductible means the amount stated in the Schedule which shall be borne by the Insured in ");
        lbl11= new JLabel("respect of each and every Claim made under this Policy. The Company’s liability to make any ");
        lbl12= new JLabel("payment under the Policy is in excess of the Deductible.");
        lbl13= new JLabel("Insured means the person named in the Schedule and, benefiting from the Cover.");
        lbl14= new JLabel("Occupation means Occupation of Insured as shown in the Schedule or as declared to the ");
        lbl15= new JLabel("Company in the Proposal.");
        lbl16= new JLabel("Policy means the Insured’s proposal, the Schedule, Company’s covering letter to the Insured, ");
        lbl17= new JLabel("insuring clauses, definitions, exclusions, conditions and other terms contained herein and any");
        lbl18= new JLabel("endorsements attaching to or forming part hereof, either at inception or during the Policy Period.");
       
        
        plans= new JButton("Get plans");
        back= new JButton("<|");

        Font f1 = new Font("Arial",Font.ITALIC,25);
        Font f2 = new Font("Times New Roman",Font.BOLD,50);

        lbl0.setFont(f2);
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
        lbl17.setFont(f1);
        lbl18.setFont(f1);

        back.setFont(f1);
        plans.setFont(f1);

        add(lbl0);
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
        add(lbl17);
        add(lbl18);

        add(back);
        add(plans);
      
        lbl0.setBounds(300,50,1600,50);
        lbl1.setBounds(50,100,1600,50);
        lbl2.setBounds(50,130,1600,50);
        lbl3.setBounds(50,160,1600,50);
        lbl4.setBounds(50,190,1600,50);
        lbl5.setBounds(50,220,1600,50);
        lbl6.setBounds(50,250,1600,50);
        lbl7.setBounds(50,280,1600,50);
        lbl8.setBounds(50,310,1600,50);
        lbl9.setBounds(50,340,1600,50);
        lbl10.setBounds(50,370,1600,50);
        lbl11.setBounds(50,400,1600,50);
        lbl12.setBounds(50,430,1600,50);
        lbl13.setBounds(50,460,1600,50);
        lbl14.setBounds(50,490,1600,50);
        lbl15.setBounds(50,520,1600,50);
        lbl16.setBounds(50,550,1600,50);
        lbl17.setBounds(50,580,1600,50);
        lbl18.setBounds(50,610,1600,50);

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