package S_01;


import java.awt.event.ActionEvent;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Win2 extends JFrame implements ActionListener//==================Register as Admin=======================
{ Container con2= getContentPane();
	JLabel lhead, lname,lemail,lgender,ldob,lpassword,lmob,ltp,lcity,lstate,lsq,sq,sa;
	JTextField tname,temail,tphone,tpass,tsq,tsa;
	JRadioButton r1,r2;
	ButtonGroup gender=new ButtonGroup();
	JCheckBox term;
	JComboBox day,month,year,osq,ccode;
	JTextArea display;
	JButton submit,bc,reset,back,check;

public Win2()
	{
	Font f=new Font("Times New Roman",Font.BOLD,20);
	lhead=new JLabel("REGISTER AS ADMIN");
	lhead.setForeground(Color.GREEN);
	lhead.setBounds(270,50,500,30);
	lhead.setFont(f);
	lname=new JLabel("Full Name : ");
	lname.setBounds(50,100,200,50);
	lname.setForeground(Color.GREEN);
	
	lgender=new JLabel("Gender : ");
	lgender.setBounds(50,150,200,50);
	lgender.setForeground(Color.GREEN);
	
	ldob=new JLabel("Date Of Birth :");
	ldob.setBounds(50,200,200,50); 
	ldob.setForeground(Color.GREEN);
	
	lemail=new JLabel("Email ID : ");
	lemail.setBounds(50,250,200,50);
	lemail.setForeground(Color.GREEN);
	
	lmob=new JLabel("Mobile No : ");
	lmob.setBounds(50,300,100,50);
	lmob.setForeground(Color.GREEN);
	
	lpassword=new JLabel("Password :");
	lpassword.setBounds(50,350,200,50);
	lpassword.setForeground(Color.GREEN);
	lsq=new JLabel("Security question :  ");
	lsq.setBounds(50,450,200,50);
	lsq.setForeground(Color.GREEN);
	sq=new JLabel("Choose a security question that only you can Answer :");
	sq.setBounds(50,480,400,50);
	sq.setForeground(Color.GREEN);
	sa=new JLabel("Security Answer : ");
	sa.setBounds(50,545,150,50);
	sa.setForeground(Color.GREEN);
	

	
	ltp=new JLabel("tp");

	tname=new JTextField();
	tname.setBounds(130,115,200,20);
	
	
	r1=new JRadioButton("Male");
	r1.setBounds(130,165,70,20);
	r1.setBackground(Color.black);
	r1.setForeground(Color.GREEN);

	r2=new JRadioButton("Female");
	r2.setBounds(200,163,150,20);
	r2.setBackground(Color.BLACK);
	r2.setForeground(Color.GREEN);
	
gender.add(r1);
gender.add(r2);
String[] daylist=new String[31];
for(int i=1;i<=31;i++)
{
	daylist[i-1]=Integer.toString(i);
}
day =new JComboBox(daylist);
 day.setBounds(135,215,50,25);
 day.setEditable(true);
 String[] monthlist= {" jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","DEC"};
 month =new JComboBox(monthlist);
 month.setBounds(205,215,75,25);
 month.setEditable(true);
 String[] yearlist=new String[31];
 for(int i=1990;i<=2020;i++)
 {
	 yearlist[i-1990]=Integer.toString(i);
 }
 year=new JComboBox(yearlist);
 year.setBounds(305,215,60,25);
 year.setEditable(true);
 
 
 temail=new JTextField();
	temail.setBounds(130,265,200,20);
	
	check=new JButton("CHECK");
	check.setBounds(340,263,80,23);
	check.addActionListener(this);
	
	tphone=new JTextField();
	tphone.setBounds(190,315,140,20);
	
	String[] code= {"+91","+92","+880","+86","+81","+977","+7","+975"};
	 ccode =new JComboBox(code);
	 ccode.setBounds(130,315,58,20);
	 ccode.setEditable(true);
	
	tpass=new JPasswordField();
	tpass.setBounds(130,365,180,20);
	
	String[] queslist= {"\tChoose a security Question"," Which is Your Favorite color ? "," What is your vehicle registration Number ?",
			" What was your First phone Number ?"," What was the name of your First Teacher ?"," What is your pet's name ?",
			" Which is your Favorite book",};
	 osq =new JComboBox(queslist);
	 osq.setBounds(55,520,320,25);
	 osq.setEditable(true);
	 
		tsq=new JTextField();
		tsq.setBounds(160,562,200,20);
	 
	
	
	
	term=new JCheckBox("I accept terms and Conditions ");
	term.setBounds(200,600,250,25);
	
	JButton back=new JButton("BACK");
	back.setBounds(150,655,80,30);
	back.addActionListener(this);
	
	submit=new JButton("SUBMIT");
	submit.setBounds(350,655,80,30);
	submit.addActionListener(this);
	
	reset=new JButton("RESET");
	reset.setBounds(550,655,80,30);
	reset.addActionListener(this);
	
	//Font ff1=new Font("Times New Roman",Font.BOLD,15);
	//display.setFont(ff1);
	
	display=new JTextArea(" DISPLAY BLOCKS");
	display.setBounds(450,100,350,400);
	display.setBackground(Color.GRAY);
	display.setEditable(false);
	display.setForeground(Color.WHITE);
	display.setText("\t        DISPLAY BLOCK ");
	bc=new JButton("CONFIRM");
	bc.setBounds(580,500,100,30);
	
	bc.addActionListener(this);
	
	con2.add(sq); 
	con2.add(check);
	con2.add(ccode);
	con2.add(lhead);
	con2.add(lname);
	con2.add(lgender);
	con2.add(ldob);
	con2.add(lemail);
	con2.add(lmob);
	con2.add(lpassword);
	con2.add(tname);
	con2.add(r1);
	con2.add(r2);
	con2.add(day);
	con2.add(month);
	con2.add(year);
	con2.add(temail);
	con2.add(tphone);
	con2.add(tpass);
	con2.add(osq);
	con2.add(tsq);
	con2.add(term);
	con2.add(back);
	con2.add(submit);
	con2.add(reset);
	con2.add(display);
	con2.add(bc);
	con2.add(lsq);
	con2.add(sa);
	con2.add(ltp);

	
		con2.setBackground(Color.black);
		setLocation(100,5);
		setTitle("Registration Form For Admin");
		setVisible(true);
		setLayout(null);
		setSize(900,750);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
public void actionPerformed(ActionEvent e)
{
	String ch=e.getActionCommand();
	 if(ch=="SUBMIT")
	 {
		 try
			{
			String mail=temail.getText();
		
		File f1=new File("D:\\\\Adminlogin.txt");
				String[] words=null;
				
				FileReader fr=new FileReader(f1);
				BufferedReader br1=new BufferedReader(fr);
				String s;
				String input= mail;
				//String input2=pass;
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

					 tname.setText(null);
					 temail.setText(null);
					 tphone.setText(null);
					 tpass.setText(null);
					 display.setText(null);
					 gender.clearSelection();
					 term.setSelected(false);
					 day.setSelectedIndex(0);
					 month.setSelectedIndex(0);
					 year.setSelectedIndex(0);
				
					 osq.setSelectedIndex(0);
					 ccode.setSelectedIndex(0);
					 tsq.setText(null);
					dispose();
					 Win2 w2=new Win2();
				}
		}
		catch(Exception e0)
			{
			System.out.println(e0);
			}
		

	 
		if(term.isSelected())
		{
			String name=tname.getText();
			String email=temail.getText();
			String mobile=tphone.getText();
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
			
			
			
display.setText("\n \n \t Display BLOCK "+"\n \n Name : "+name+"\n \n Email Id : "+email+"\n \n Phone NO : "+""+ccode1+mobile+
"\n \n Date of Birth : "+date+" "+mon+""+" "+yr+"\n\n Gender :  "+Gen+"\n\n Securiy Question : "+" "+osq1 +"\n\n Security Answer : " +secque);			
		}
		else
		{	display.setForeground(Color.red);
			display.setText("\t \t \n Please accept Terms and Conditons");
			
		}
		FileWriter fp;
		String name=tname.getText();
		String email=temail.getText();
		String mobile=tphone.getText();
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
		}// admininfo details 
		
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
	 }
	
	 else 
	 {
		 
	 }
		if(ch=="BACK")
		{
			Win0 w=new Win0();
			dispose();
		}
		else {
			
		}
		if(ch=="CONFIRM")
		{
			//display.setText("Saved>>>>");
			JOptionPane.showMessageDialog(this, "Saved Successfully ");
			display.setText("\n \t <<< Saved Sucessfully >>>");
		}
		else {
			//JOptionPane.showMessageDialog(this, "Submitted");
			//display.setText("\n \t <<< Saved Successfully >>>");
		} // Confirm Button End;
		
		if(ch=="RESET")
		{
			 tname.setText(null);
			 temail.setText(null);
			 tphone.setText(null);
			 tpass.setText(null);
			 display.setText(null);
			 gender.clearSelection();
			 term.setSelected(false);
			 day.setSelectedIndex(0);
			 month.setSelectedIndex(0);
			 year.setSelectedIndex(0);
		
			 osq.setSelectedIndex(0);
			 ccode.setSelectedIndex(0);
			 tsq.setText(null);
			 JOptionPane.showMessageDialog(this, "RESET SUCESSFULLY ");
			 display.setText("\n \t Reset Sucessfully");
			 }
		else {
				}
		if(ch=="CHECK")
		{
			try
			{
				System.out.println(temail);
			String mail=temail.getText();
			System.out.println(mail);
			
				File f1=new File("D:\\Adminlogin.txt");
				String[] words=null;
				
				FileReader fr=new FileReader(f1);
				BufferedReader br1=new BufferedReader(fr);
				String s;
				String input= mail;
				//String input2=pass;
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
	 }
}//End of ActionPerformemer win2

}// End of Win2


