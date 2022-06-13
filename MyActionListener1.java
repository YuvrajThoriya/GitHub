import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.InternalFrameListener;
import java.lang.*;

public class MyActionListener1 implements ActionListener
{
	Main_Frame mf;
	List ls;
	Health mf1;
	Home mf2;

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

	MyActionListener1(Home m)
	{
		this.mf2 = m;
	}

	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Start"))
		{
            ls=new List();
			this.ls.setVisible(true);
		}
		
		if(e.getActionCommand().equals("< Back"))
		{
			this.ls.setVisible(false);
			this.mf.setVisible(true);
		}
		
        if(e.getActionCommand().equals("Health insurances"))
		{
			mf1=new Health();
			this.mf1.setVisible(true);
		}

		if(e.getActionCommand().equals("<"))
		{
			this.mf1.setVisible(false);
			this.ls.setVisible(true);
		}
		if(e.getActionCommand().equals("Home insurances"))
		{
            mf2=new Home();
			this.mf2.setVisible(true);
		}
		if(e.getActionCommand().equals("<-"))
		{
			this.mf2.setVisible(false);
			this.ls.setVisible(true);
		}
    }
}