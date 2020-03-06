package S_01;

import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Win4 extends JFrame implements ActionListener,Serializable {
	
	Container con4= getContentPane();
	JLabel lhead,lmail,lpass,linfo;
	 
	JButton blogin,bforget,bclear,bback,bsign;
	JTextField tmail,tpass;
	String password="Admin";
	String Id="admin";
	public Win4(){
		
		Font f=new Font("Times New Roman",Font.BOLD,30);
		lhead=new JLabel("LOGIN AS ADMIN");
		lhead.setForeground(Color.GREEN);
		lhead.setBounds(210,60,500,30);
		lhead.setFont(f);
		
		lmail=new JLabel("Enter Email : ");
		lmail.setBounds(150,200,100,30);
		lmail.setForeground(Color.GREEN);
		
		lpass=new JLabel("Enter Password : ");
		lpass.setBounds(150,260,100,30);
		lpass.setForeground(Color.GREEN);
		 
		tmail=new JTextField();
		tmail.setBounds(275,200,200,30);
		
		tpass=new JPasswordField();
		tpass.setBounds(275,260,200,30);
		
		
		bback=new JButton("BACK");
		bback.setBounds(10,10,70,30);
		bback.addActionListener(this);
		
		blogin=new JButton("LOGIN");
		blogin.setBounds(250,320,100,30);
		blogin.addActionListener(this);
		
		bclear=new JButton("CLEAR");
		bclear.setBounds(400,320,100,30);
		bclear.addActionListener(this);

		
		bsign=new JButton("SIGN UP");
		bsign.setBounds(100,320,100,30);
		bsign.addActionListener(this);
		
		
		bforget=new JButton("Forget Password");
		bforget.setBounds(240,410,150,30);
		bforget.addActionListener(this);
		
		linfo=new JLabel("Click Forget password Button above, If You forget Your password ");
		linfo.setBounds(140,450,500,30);
		linfo.setForeground(Color.GREEN);
		
		
	
	
		con4.add(linfo);
		con4.add(bback);
		con4.add(bclear);
		con4.add(bsign);
		con4.add(lmail);
		con4.add(tmail);
		con4.add(lpass);
		con4.add(blogin);
		con4.add(bforget);
		con4.add(tpass);
		con4.add(lhead);
	con4.setBackground(Color.BLACK);
	setTitle("Login as Student"); 
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
		if(ch=="LOGIN")
		{ 
			{	String Id="admin";
				String password="Admin";
			
				String Id1=tmail.getText();
				String password1=tpass.getText();
				
				//if(Id==Id1 || password==password1)
					if(Id.equals(Id1) && password.equals(password1))
				{
					//JOptionPane.showMessageDialog(this, "Login Sucessfully");
					Awin Aw=new Awin();
					dispose();
					
				}
				else {
					
					//JOptionPane.showMessageDialog(this, "Invalid Email or Password LOL ");
				}
			}
		
		
			try 
		{
			String mail=tmail.getText();
			String pass=tpass.getText();
	
				//File f1=new File("D:\\\\AdminLogin.txt");
				File f1=new File("D:\\Adminlogin.txt");
				String[] words=null;
				
				FileReader fr=new FileReader(f1);
				BufferedReader br1=new BufferedReader(fr);
				String s;
				String input= mail;
				String input2=pass;
				int count=0;
				while((s=br1.readLine())!=null)
				{
					words=s.split(" ");
					for(String word : words)
					{
						if(word.equals(input))
						{
							count++;
						}
						
					}
				}
				if(count!=0)
				{  
					//System.out.println("Data is Present " +input +"" +count+" "+br1);
					//System.out.println(s);
				}
				else
				{
					//System.out. println(words+" "+count);
					//System.out.println("else");
				} 
				// +++++++++++++++++++++++++++  password +++++++++++++++++++++++++++++++++++++++
				String[] word1=null;
				int count1=0;
				while((s=br1.readLine())!=null)
				{
					words=s.split(" ");
					for(String word : word1)
					{
						if(word.equals(input2));
						{
							count++;
						}
						
					}
				}
				if(count!=0)
				{  
					//System.out.println("Data is Presented "+count);
					JOptionPane.showMessageDialog(this, "Login Sucessfully");
					Awin Aw=new Awin();
					dispose();
					
					
				}
				else
				{
					
					JOptionPane.showMessageDialog(this, "Invalid Email or Password LOL ");
					
				}
				fr.close();
			}
			catch(Exception e0)
			{
				System.out.println(e0);
			}
			
		}
		else
		{
			
		}
		if(ch=="BACK")
		{	dispose();
			Win0 w=new Win0();
			
		}
		else
		
		if(ch=="CLEAR")
		{
		tpass.setText(null);
		tmail.setText(null);
		}
		if(ch=="SIGN UP")
		{	dispose();
			Win2 w2=new Win2();
		}
	if(ch=="Forget Password")
	{	dispose();
		Fwin0 f0=new Fwin0();
	}
		
	}

	}

