package S_01;

import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Win3  extends JFrame implements ActionListener{

	Container con3= getContentPane();
	JLabel lhead,lmail,lpass,linfo;
	 
	JButton blogin,bforget,bclear,bback,bsign;
	JTextField tmail,tpass;
	int ch1=0;
	public Win3(){
		
		Font f=new Font("Times New Roman",Font.BOLD,30);
		lhead=new JLabel("LOGIN AS STUDENT");
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
		
		
	
	
		con3.add(linfo);
		con3.add(bback);
		con3.add(bclear);
		con3.add(bsign);
		con3.add(lmail);
		con3.add(tmail);
		con3.add(lpass);
		con3.add(blogin);
		con3.add(bforget);
		con3.add(tpass);
		con3.add(lhead);
	con3.setBackground(Color.BLACK);
	setTitle("Login as Student");
	Image icon = Toolkit.getDefaultToolkit().getImage("D:\\logo2.jpg");    
	setIconImage(icon);  
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
		/*try
		{
			FileInputStream fin=new FileInputStream("D:\\\\Studentinfo.txt");
					int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			
		
			}
		fin.close();
		}catch(Exception e0)
		{
			System.out.println(e0);
		}
		*/
		String ch=e.getActionCommand();
		if(ch=="LOGIN")
		{ 
			try
			{
				String mail=tmail.getText();
				String pass=tpass.getText();
				
					
					File f1=new File("D:\\\\psswd\\\\Student\\\\Studentlogin.txt");
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
						
					}
					else
					{
						JOptionPane.showMessageDialog(this, "Enter password");
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
						
						JOptionPane.showMessageDialog(this, "Login Sucessfully");
						Lwin Lw=new Lwin();
						
						
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
				
			/*String mail=tmail.getText();
			String pass=tpass.getText();
			try
			{
			
				String mail1,pass1;
				Scanner fileScan= new Scanner(new File("D:\\Student.txt"));
				while(fileScan.hasNext())
				{
					mail1=fileScan.next();
					pass1=fileScan.next();
					if(tpass.equals(pass1)&tmail.equals(mail1))
					{ ch1=1;
						JOptionPane.showMessageDialog(this, "Login Sucessfully");
						Lwin Lw=new Lwin();
						

					}
					else
					{
						JOptionPane.showMessageDialog(this, "Wrong email or password");
					}
				}
				
			}
			catch(Exception e2)
			{
				
			}*/
			
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
			Win1 w1=new Win1();
		}
	if(ch=="Forget Password")
	{ dispose();
		Fwin Fw=new Fwin();
	}
		
	}

}