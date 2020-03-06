package S_01;


import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Awin extends JFrame implements ActionListener{
	Container Acon= getContentPane();
	ButtonGroup gender=new ButtonGroup();
	JLabel lhead,lname,ldob,lemail,lpass,lphone,lgen,lcourse,lnote,lsq,sq,sa;
	JButton add,mod,del,al,sl,back,As,Ad,print,clear,back1,check,search;
	JTable T1;
	JScrollPane S1;
	JRadioButton r1,r2;
	JComboBox day,month,year,course,ccode,osq;
	JTextArea display;
	JTextField tname,temail,tpass,tphone,tsq,tsa,tsearch;
	public Awin()
	{
		
		
		Font f=new Font("Times New Roman",Font.BOLD,25);
		lhead=new JLabel("Admin Panel ");
		lhead.setForeground(Color.GREEN);
		lhead.setBounds(520,50,500,30);
		lhead.setFont(f);
		
		add=new JButton("ADD");
		add.setBounds(100,100,100,30);
		add.addActionListener(this);
		
		mod=new JButton("Modify");
		mod.setBounds(250,100,100,30);
		
		del=new JButton("DELETE");
		del.setBounds(550,100,100,30);
		del.addActionListener(this);
		
		print=new JButton("PRINT");
		print.setBounds(300,100,90,30);
		print.addActionListener(this);
		
		al=new JButton("ADMIN LIST");
		al.setBounds(500,100,100,30);
		al.addActionListener(this);
		
		sl=new JButton("STUDENT LIST");
		sl.setBounds(700,100,150,30);
		sl.addActionListener(this);
		
		back=new JButton("BACK");
		back.setBounds(10,10,80,30);
		back.addActionListener(this);
		
		tsearch=new JTextField("Enter Name ");
		tsearch.setBounds(900,100,180,30);
		
		search=new JButton("Search");
		search.setBounds(1100,100,100,30);
		search.addActionListener(this);
		
	
		
		
		
		 display=new JTextArea("\t\t\t\t\t\t DISPLAY SCREEN");
		 display.setBounds(50,200,1230,400);
		 display.setBackground(Color.lightGray);
		 display.setForeground(Color.black);
		 display.isEditable();
		 
		 S1=new JScrollPane(display);
			getContentPane().add(S1,BorderLayout.CENTER);
		
		
		
		
		Acon.add(S1);
		//Acon.add(T1);
		Acon.add(lhead);
		//Acon.add(del);
		Acon.add(add);
		Acon.add(al);
		Acon.add(sl);
		//Acon.add(mod);
		Acon.add(back);
		Acon.add(display);
		Acon.add(print);
		Acon.add(search);
		Acon.add(tsearch);
	
		Acon.setBackground(Color.BLACK);
		setTitle("Admin Login");
		
		setLocation(10,20);
		
		setBackground(Color.red);
		setLayout(null);
		setVisible(true);
		setSize(1700,700);
		setResizable(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		
		String ch=e.getActionCommand();
		if(ch=="BACK")
		{
			dispose();
			Win4 w4=new Win4();
		
		}
		if(ch=="ADD")
		{
		JFrame no=new JFrame();
		
			
			no.setTitle("Fill details");
			JLabel l=new JLabel("Fill the Details :");
			l.setForeground(Color.BLACK);
			l.setBounds(10,10,200,10);
			lname=new JLabel("Enter  Name");
			lgen=new JLabel("Gender : ");
			ldob=new JLabel("Date of Birth:");
			lcourse=new JLabel("Course: ");
			lnote=new JLabel("NOTE: Course is only of  Student ");
			lnote.setForeground(Color.RED);
			lemail=new JLabel("Enter Email");
			lphone=new JLabel("Enter phone No :");
			lpass=new JLabel("Enter password : ");
			
			
			lname.setBounds(10,30,150,20);
			lgen.setBounds(10,60,150,20);
			ldob.setBounds(10,90,150,20);
			lcourse.setBounds(10,120,150,20);
			lnote.setBounds(10,150,250,20);
			lemail.setBounds(10,180,150,20);
			lphone.setBounds(10,210,150,20);
			lpass.setBounds(10,240,150,20);
			
			tname=new JTextField();
			tname.setBounds(130,30,200,20);
			r1=new JRadioButton("Male");
			r1.setBounds(130,60,70,20);
			
			r2=new JRadioButton("Female");
			r2.setBounds(200,60,70,20);
			
			gender.add(r1);
			gender.add(r2);
			
			String[] daylist=new String[31];
			for(int i=1;i<=31;i++)
			{
				daylist[i-1]=Integer.toString(i);
			}
			day =new JComboBox(daylist);
			 day.setBounds(135,90,50,25);
			 day.setEditable(true);
			 String[] monthlist= {" jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","DEC"};
			 month =new JComboBox(monthlist);
			 month.setBounds(205,90,75,25);
			 month.setEditable(true);
			 String[] yearlist=new String[31];
			 for(int i=1990;i<=2020;i++)
			 {
				 yearlist[i-1990]=Integer.toString(i);
			 }
			 year=new JComboBox(yearlist);
			 year.setBounds(305,90,60,25);
			 year.setEditable(true);

			 String[] courselist= {"  BCA","  MCA","  BBA","  MSCIT","  BCOM","  MCOM","  CEH","  CISM","  CHIF","  HM"};
			 course =new JComboBox(courselist);
			 course.setBounds(120,120,100,20);
			 course.setEditable(true);
			
			 temail=new JTextField();
			temail.setBounds(130,180,180,20);
			
			check=new JButton("CHECK");
			check.setBounds(310,180,75,20);
			check.addActionListener(this);
			
			tphone=new JTextField();
			tphone.setBounds(190,210,150,20);
			String[] code= {"+91","+92","+880","+86","+81","+977","+7","+975"};
			 ccode =new JComboBox(code);
			 ccode.setBounds(130,210,58,20);
			 ccode.setEditable(true);
			
			tpass=new JPasswordField();
			tpass.setBounds(130,240,150,20);
			
			lsq=new JLabel("Security question :  ");
			lsq.setBounds(10,280,200,50);
			
			sq=new JLabel(" NOTE : Choose a security question that only you can Answer :");
			sq.setBounds(10,300,400,50);
			sq.setForeground(Color.GREEN);
			sa=new JLabel("Security Answer : ");
			sa.setBounds(10,370,150,50);			
			
			String[] queslist= {"\tChoose a security Question"," Which is Your Favorite color ? "," What is your vehicle registration Number ?",
					" What was your First phone Number ?"," What was the name of your First Teacher ?"," What is your pet's name ?",
					" Which is your Favorite book",};
			 osq =new JComboBox(queslist);
			 osq.setBounds(55,350,320,25);
			 osq.setEditable(true);
			 
				tsq=new JTextField();
				tsq.setBounds(130,385,150,20);
			
			
			l.setForeground(Color.black);
			no.setBackground(Color.BLACK);
			As=new JButton("Add as student");
			As.setBounds(30,450,150,30);
			As.addActionListener(this);
		
			Ad=new JButton("Add as Admin");
			Ad.setBounds(200,450,150,30);
			Ad.addActionListener(this);
			
			clear=new JButton("Reset");
			clear.setBounds(400,450,100,30);
			clear.addActionListener(this);
			back1=new JButton("Back");
			back1.setBounds(450,10,100,30);
			back1.addActionListener(this);
			no.add(tname);
			no.add(day);
			no.add(clear);
			no.add(month);
			no.add(year);
			no.add(course);
			no.add(temail);
			no.add(tpass);
			no.add(tphone);
			no.add(ccode);
			no.add(r1);
			no.add(r2);
			no.add(As);
			no.add(Ad);
			//no.add(back1);
			no.add(l);
			no.add(lname);
			no.add(ldob);
			no.add(lgen);
			no.add(lcourse);
			no.add(lnote);
			no.add(lphone);
			no.add(lpass);
			no.add(lemail);
			no.add(check);
			no.add(sq);
			no.add(sa);
			no.add(osq);
			no.add(lsq);
			no.add(tsq);
			
			no.setLocation(400,100);
			
			no.setBackground(Color.red);
			no.setLayout(null);
			no.setVisible(true);
			no.setSize(600,550);
			no.setResizable(true);
			//no.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			no.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						
		}
		
		if(ch=="Search") 
		{
			String s=tsearch.getText();
		
			String sname=s.strip();
			String line="";
			try
			{
				FileInputStream  fin=new FileInputStream("D:\\Studentinfo.txt");
				Scanner sc=new Scanner(fin);
				while(sc.hasNextLine())
				{
					line=sc.nextLine();
					if(line.startsWith(sname))
					display.setText("\n"+line);
					
						
				}
				sc.close();
			
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			
			try
			{
				FileInputStream  fin=new FileInputStream("D:\\Admininfo.txt");
				Scanner sc=new Scanner(fin);
				while(sc.hasNextLine())
				{
					line=sc.nextLine();
					if(line.startsWith(sname))
					display.setText("\n"+line);
			
					
				}
				sc.close();
				
				
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			
		}
		if(ch=="Add as student")
		{
			FileWriter fp;
			String name=tname.getText();
			String email=temail.getText();
			String mobile=tphone.getText();
			String courses=(String)course.getSelectedItem();
			String Gen="Male";
			String pass=tpass.getText();
			
			if(r2.isSelected())
			{
				Gen="Female";
			}
			String secque=tsq.getText();
			String ccode1=(String)ccode.getSelectedItem();
			String osq1=(String)osq.getSelectedItem();
			String date=(String)day.getSelectedItem();
			String mon=(String)month.getSelectedItem();
			String yr=(String)year.getSelectedItem();

			try {
				File file=new File("D:\\Studentinfo.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			else
			{
				
			}
				
			FileWriter fp1=new FileWriter("D:\\\\Studentinfo.txt",true);
				BufferedWriter bw=new BufferedWriter(fp1);

			bw.write(""+name+"\t\t | "+email +"\t\t | "+ccode1+ mobile+"\t| "+date+" "+mon+" "+yr+
					"\t\t | "+Gen+"\t\t | "+courses+"\t\t | "+pass+"\n");
				bw.flush();
				bw.close();
			
			}
			catch (Exception e1)
			{
			System.out.println(e1);
			}
			try {
				
				File file=new File("D:\\Studentlogin.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			else
			{
				
			}
				FileWriter fp1=new FileWriter("D:\\Studentlogin.txt", true);
				BufferedWriter bw=new BufferedWriter(fp1);

				bw.write(email+"  "+"password is : "+pass+"\n"+pass+"\n"+"\n"+osq1+secque+"\n");
				bw.flush();
				bw.close();

			}
			catch (Exception e1)
			{
			System.out.println(e1);
			}
			
		 
			JOptionPane.showMessageDialog(this,"Student Data added Successfully");
			
		}//  add for student
		
		if(ch=="Add as Admin")
		{
			FileWriter fp;
			String name=tname.getText();
			String email=temail.getText();
			String mobile=tphone.getText();
			String courses=(String)course.getSelectedItem();
			String Gen="Male";
			String pass=tpass.getText();
			
			if(r2.isSelected())
			{
				Gen="Female";
			}
			String secque=tsq.getText();
			String ccode1=(String)ccode.getSelectedItem();
			String osq1=(String)osq.getSelectedItem();
			String date=(String)day.getSelectedItem();
			String mon=(String)month.getSelectedItem();
			String yr=(String)year.getSelectedItem();

			try {
				File file=new File("D:\\Admininfo.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			else
			{
				
			}
				FileWriter fp1=new FileWriter("D:\\\\Admininfo.txt", true);
				BufferedWriter bw=new BufferedWriter(fp1);
			
			
			bw.write(""+name+"\t\t |"+email +"\t\t | "+ccode1+ mobile+"\t\t | "+date+" "+mon+" "+yr+
					"\t\t | "+Gen+"\t\t | "+pass+"\n");
				bw.flush();
				bw.close();

			}
			catch (Exception e1)
			{
			System.out.println(e1);
			}
			try {
				File file=new File("D:\\Adminlogin.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			else
			{
				
			}
				FileWriter fp1=new FileWriter("D:\\Adminlogin.txt", true);
				BufferedWriter bw=new BufferedWriter(fp1);
			

				bw.write(email+"  "+"password is : "+pass+"\n"+pass+"\n"+"\n"+osq1+secque+"\n");
				bw.flush();
				bw.close();

			}
			catch (Exception e1)
			{
			System.out.println(e1);
			}
			JOptionPane.showMessageDialog(this,"Admin Data added Successfully");
		 }//end
			
		if(ch=="Reset")
		{
			 temail.setText(null);
			 tname.setText(null);
			 tphone.setText(null);
			 tpass.setText(null);
			 display.setText(null);
			 gender.clearSelection();
			 day.setSelectedIndex(0);
			 month.setSelectedIndex(0);
			 year.setSelectedIndex(0);
			 course.setSelectedIndex(0);
			 osq.setSelectedIndex(0);
			 ccode.setSelectedIndex(0);
			 tsq.setText(null);
			 JOptionPane.showMessageDialog(this, "RESET SUCESSFULLY ");
			 
		}
		if(ch=="Back")
		{	dispose();
			Awin aw=new Awin();
		}
		
		if(ch=="STUDENT LIST")
		{
			
			try {
				FileReader rd=new FileReader("D:\\\\Studentinfo.txt");
				BufferedReader br=new BufferedReader(rd);
				display.read(br, null);
				br.close();
				display.requestFocus();
				
						
			}
			catch(Exception e2)
			{
			System.out.println(e2);
			}
			
		}
		if(ch=="ADMIN LIST") {
			
			try
			{
				FileReader rd=new FileReader("D:\\\\Admininfo.txt");
				BufferedReader br=new BufferedReader(rd);
				display.read(br, null);
				br.close();
				display.requestFocus();
				
				
			}
			catch(Exception e2)
			{
			System.out.println(e2);
			}
		
			
	}//Admin list
		
		if(ch=="PRINT")
		{
			try
			{
				
				boolean complete=display.print();
				if(complete)
				{
			JOptionPane.showMessageDialog(this,"Print Successfully");
				}
				else
				{
			JOptionPane.showMessageDialog(this,"Printing Not Done");
				}
			
			
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}	
		}//end of print
		
		if(ch=="CHECK")
		{
			try
			{
			String mail=temail.getText();
			System.out.println(mail);

				File f1=new File("D:\\Studentlogin.txt");
				
				String[] words=null;
				
				FileReader fr=new FileReader(f1);
				BufferedReader br1=new BufferedReader(fr);
				String s;
				String input= mail;
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
					
					JOptionPane.showMessageDialog(this,"This Email Id is already Exist ");
				}
				else
				{
					JOptionPane.showMessageDialog(this,"You are Good To go with this Email Id :) ");
				} 
		}
		catch(Exception e0)
			{
			System.out.println(e0);
			}
	 }//end of check
		
		
	}
	
}


