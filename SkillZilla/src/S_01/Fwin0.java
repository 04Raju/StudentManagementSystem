package S_01;

import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Fwin0 extends JFrame implements ActionListener{
	
	Container Fcon= getContentPane();
	JLabel lhead,lsq,sa,lmail,sq;
	JTextField tmail,tsq,tsa;
	JComboBox osq;
	JButton back,home,click,reset,newac;
	
	JButton Click;
	
	public Fwin0()
	{
		Font f=new Font("Times New Roman",Font.BOLD,25);
		lhead=new JLabel("FORGET PASSWORD");
		lhead.setForeground(Color.GREEN);
		lhead.setBounds(220,70,500,30);
		lhead.setFont(f);
		
		lmail=new JLabel("Enter Email Id : ");
		lmail.setBounds(150,200,140,30);
		lmail.setForeground(Color.GREEN);

	
		tmail=new JTextField();
		tmail.setBounds(260,200,200,30);
	
		
		lsq=new JLabel("Security question ");
		lsq.setBounds(150,250,200,50);
		lsq.setForeground(Color.GREEN);
		sq=new JLabel("NOTE-: Choose a security question used while Registration  :");
		sq.setBounds(120,320,400,50);
		sq.setForeground(Color.GREEN);
	String[] queslist= {"\tChoose a security Question"," Which is Your Favorite color ? "," What is your vehicle registration Number ?",
				" What was your First phone Number ?"," What was the name of your First Teacher ?"," What is your pet's name ?",
				" Which is your Favorite book",};
		 osq =new JComboBox(queslist);
		 osq.setBounds(150,290,320,25);
		 osq.setEditable(true);
		 
		sa=new JLabel("Security Answer : ");
		sa.setBounds(150,380,140,30);
		sa.setForeground(Color.GREEN);

		tsq=new JTextField();
		tsq.setBounds(260,380,200,30);
		
		back=new JButton("BACK");
		back.setBounds(10,10,80,30);
		back.addActionListener(this);
		
		reset=new JButton("RESET");
		reset.setBounds(150,450,100,30);
		reset.addActionListener(this);
		
		click=new JButton("GET PASSWORD");
		click.setBounds(300,450,170,30);
		click.addActionListener(this);
		
		newac=new JButton("Create New Account");
		newac.setBounds(240,550,200,30);
		newac.addActionListener(this);
		
		
		Fcon.add(lhead);
		Fcon.add(lmail);
		Fcon.add(lsq);
		Fcon.add(sq);
		Fcon.add(sa);
		Fcon.add(tsq);
		Fcon.add(tmail);
		Fcon.add(osq);
		Fcon.add(back);
		Fcon.add(reset);
		Fcon.add(newac);
		Fcon.add(click);
		
		Fcon.setBackground(Color.BLACK);
		setTitle("FORGET PASSWORD"); 
		setLocation(100,20);
		setBackground(Color.red);
		setLayout(null);
		setVisible(true);
		setSize(700,700);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String ch=e.getActionCommand();
		if(ch=="GET PASSWORD")
		{ 
				String s=tmail.getText();
				
				
			
				String sname=s.strip();
				String line="";
				try
				{
					FileInputStream  fin=new FileInputStream("D:\\Adminlogin.txt");
					Scanner sc=new Scanner(fin);
					while(sc.hasNextLine())
					{
						line=sc.nextLine();
						if(line.startsWith(sname))
						{
						JOptionPane.showMessageDialog(this, ">>> "+line);
						}
						
						
					}
					sc.close();
				
					
						//JOptionPane.showMessageDialog(this, "Invalid User ");
					
					
				
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			
		}
		/*else {
			JOptionPane.showMessageDialog(this, "Invalid User ");
		}*/
		if(ch=="BACK")
		{	dispose();
			Win4 w4=new Win4();
		}
		if(ch=="Create New Account")
		{
			dispose();
			Win2 w2=new Win2();
		}
	if(ch=="RESET")
	{
		tmail.setText(null);
		osq.setSelectedIndex(0);
		tsq.setText(null);
	}
		
			
		
		
	}

}
