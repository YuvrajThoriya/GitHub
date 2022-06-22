import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.InternalFrameListener;
import java.lang.*;
import java.lang.reflect.GenericDeclaration;

public class MyActionListener1 implements ActionListener
{
	Main_Frame mf;
	List ls;
	Health mf1;
	Home mf2;
	home_policy mf2_1;
	health_policy mf1_1;
	Car mf3;
	car_policy mf3_1;
	Family mf4;
	family_policy mf4_1;
	Thanks mf5;
	
	MyActionListener1(Main_Frame m)
    {
		this.mf = m;
	}
	
	MyActionListener1(List m)
    {
		this.ls = m;
	}

    MyActionListener1(Health m)
	{
		this.mf1 = m;
	}

	MyActionListener1(health_policy m)
	{
		this.mf1_1 = m;
	}

	MyActionListener1(Home m)
	{
		this.mf2 = m;
	}

	MyActionListener1(home_policy m)
	{
		this.mf2_1 = m;
	}

	MyActionListener1(Car m)
	{
		this.mf3 = m;
	}

	MyActionListener1(car_policy m)
	{
		this.mf3_1 = m;
	}

	MyActionListener1(Family m)
	{
		this.mf4 = m;
	}

	MyActionListener1(family_policy m)
	{
		this.mf4_1 = m;
	}

	MyActionListener1(Thanks m)
	{
		this.mf5 = m;
	}
	
	public void actionPerformed(ActionEvent e)
	{

		// For List Frame (List of Insuarance)
		if(e.getActionCommand().equals("Start"))
		{
            ls=new List();
			this.ls.setVisible(true);
			this.mf.setVisible(false);
		}
		
		// For Main Frame
		if(e.getActionCommand().equals("back"))
		{
			mf = new Main_Frame();
			this.mf.setVisible(true);
			ls.setVisible(false);
		}
		
		// For Health 
        if(e.getActionCommand().equals("health insurances"))
		{
			mf1_1=new health_policy();
			this.mf1_1.setVisible(true);
			ls.setVisible(false);
		}

		if(e.getActionCommand().equals("Get plans"))
		{
			mf1 = new Health();
			this.mf1.setVisible(true);
			this.mf1_1.setVisible(false);
		}

		if(e.getActionCommand().equals("<|"))
		{
			ls = new List();
			this.mf1_1.setVisible(false);
			this.ls.setVisible(true);
		}

		if(e.getActionCommand().equals("Save"))
		{
			String member_name = this.mf1.txt1.getText();
			String dob = this.mf1.txt3.getText();
			String age = this.mf1.txt4.getText();
			String phoneno = this.mf1.txt5.getText();

			String Gender = (String)this.mf1.cmb1.getSelectedItem();
			

			Modle md = new Modle(member_name,Gender,dob,age,phoneno);

			try
			{
				md.saveObject("health.txt");
			}
			catch(Exception ef)
			{
				System.out.println(ef);
			}
			/*Modle md1 = new Modle();
			try
			{
				md1.readObject("home.txt");
			}
			catch(Exception efd)
			{
				System.out.println(efd);
			}*/

			mf5 = new Thanks();
			this.mf5.setVisible(true);
			this.mf1.setVisible(false);
			
		}

		if(e.getActionCommand().equals("Ok"))
		{
			ls = new List();
			this.mf5.setVisible(false);
			this.ls.setVisible(true);
		}
		
		if(e.getActionCommand().equals("Clear"))
		{
			this.mf1.txt1.setText("");
			this.mf1.txt3.setText("");
			this.mf1.txt4.setText("");
			this.mf1.txt5.setText("");
		}

		if(e.getActionCommand().equals("<"))
		{
			mf1_1 = new health_policy();
			this.mf1_1.setVisible(true);
			this.mf1.setVisible(false);
		}
		// for health_policy
		if(e.getActionCommand().equals("<|"))
		{
			this.mf1_1.setVisible(false);
			this.ls.setVisible(true);
		}

		
		// for Home Insuarance
		if(e.getActionCommand().equals("home insurances"))
		{
			mf2_1=new home_policy();
			this.mf2_1.setVisible(true);
			ls.setVisible(false);
		}
		if(e.getActionCommand().equals("get plans"))
		{
			mf2 = new Home();
			this.mf2.setVisible(true);
			this.mf2_1.setVisible(false);
		}
		if(e.getActionCommand().equals("Save          "))
		{
			String member_name = this.mf2.txt1.getText();
			String dob = this.mf2.txt3.getText();
			String age = this.mf2.txt4.getText();
			String phoneno = this.mf2.txt5.getText();

			String Gender = (String)this.mf2.cmb1.getSelectedItem();
			

			Modle md = new Modle(member_name,Gender,dob,age,phoneno);

			try
			{
				md.saveObject("home.txt");
			}
			catch(Exception ef)
			{
				System.out.println(ef);
			}
			/*Modle md1 = new Modle();
			try
			{
				md1.readObject("home.txt");
			}
			catch(Exception efd)
			{
				System.out.println(efd);
			}*/

			mf5 = new Thanks();
			this.mf5.setVisible(true);
			this.mf2.setVisible(false);
		}
		
		
		
		if(e.getActionCommand().equals("Clear          "))
		{
			this.mf2.txt1.setText("");
			this.mf2.txt3.setText("");
			this.mf2.txt4.setText("");
			this.mf2.txt5.setText("");
		}

		if(e.getActionCommand().equals("<-"))
		{
			mf2_1 = new home_policy();
			this.mf2_1.setVisible(true);
			this.mf2.setVisible(false);
		}

		if(e.getActionCommand().equals("go back"))
		{
			ls = new List();
			this.mf2_1.setVisible(false);
			this.ls.setVisible(true);
		}

		//for car policy

		if(e.getActionCommand().equals("car insurances"))
		{
			mf3_1=new car_policy();
			this.mf3_1.setVisible(true);
			ls.setVisible(false);
		}
		if(e.getActionCommand().equals("Get Plans"))
		{
			mf3 = new Car();
			this.mf3.setVisible(true);
			this.mf3_1.setVisible(false);
		}
		if(e.getActionCommand().equals("Save           "))
		{
			String member_name = this.mf3.txt1.getText();
			String dob = this.mf3.txt3.getText();
			String age = this.mf3.txt4.getText();
			String phoneno = this.mf3.txt5.getText();

			String Gender = (String)this.mf3.cmb1.getSelectedItem();
			

			Modle md = new Modle(member_name,Gender,dob,age,phoneno);

			try
			{
				md.saveObject("car.txt");
			}
			catch(Exception ef)
			{
				System.out.println(ef);
			}
			/*Modle md1 = new Modle();
			try
			{
				md1.readObject("home.txt");
			}
			catch(Exception efd)
			{
				System.out.println(efd);
			}*/

			mf5 = new Thanks();
			this.mf5.setVisible(true);
			this.mf3.setVisible(false);
			
		}
		
		if(e.getActionCommand().equals("Clear           "))
		{
			this.mf3.txt1.setText("");
			this.mf3.txt3.setText("");
			this.mf3.txt4.setText("");
			this.mf3.txt5.setText("");
		}

		if(e.getActionCommand().equals("< Back"))
		{
			mf3_1 = new car_policy();
			this.mf3_1.setVisible(true);
			this.mf3.setVisible(false);
		}

		if(e.getActionCommand().equals("Go Back"))
		{
			ls = new List();
			this.mf3_1.setVisible(false);
			this.ls.setVisible(true);
		}

		//for family policy

		if(e.getActionCommand().equals("family insurances"))
		{
			mf4_1=new family_policy();
			this.mf4_1.setVisible(true);
			ls.setVisible(false);
		}
		if(e.getActionCommand().equals("get Plans"))
		{
			mf4 = new Family();
			this.mf4.setVisible(true);
			this.mf4_1.setVisible(false);
		}
		if(e.getActionCommand().equals("Save            "))
		{
			String member_name = this.mf4.txt1.getText();
			String dob = this.mf4.txt3.getText();
			String age = this.mf4.txt4.getText();
			String phoneno = this.mf4.txt5.getText();

			String Gender = (String)this.mf4.cmb1.getSelectedItem();
			

			Modle md = new Modle(member_name,Gender,dob,age,phoneno);

			try
			{
				md.saveObject("family.txt");
			}
			catch(Exception ef)
			{
				System.out.println(ef);
			}
			/*Modle md1 = new Modle();
			try
			{
				md1.readObject("home.txt");
			}
			catch(Exception efd)
			{
				System.out.println(efd);
			}*/

			mf5 = new Thanks();
			this.mf5.setVisible(true);
			this.mf4.setVisible(false);
			
		}
		
		if(e.getActionCommand().equals("Clear            "))
		{
			this.mf2.txt1.setText("");
			this.mf2.txt3.setText("");
			this.mf2.txt4.setText("");
			this.mf2.txt5.setText("");
		}

		if(e.getActionCommand().equals("< back"))
		{
			mf4_1 = new family_policy();
			this.mf4_1.setVisible(true);
			this.mf4.setVisible(false);
		}

		if(e.getActionCommand().equals("go Back"))
		{
			ls = new List();
			this.mf4_1.setVisible(false);
			this.ls.setVisible(true);
		}
    }

	
}
