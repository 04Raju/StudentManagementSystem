package S_01;

import java.awt.event.ActionEvent;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class Home_win {
	
	public static void main(String[] args) {
		
		Win0 w=new Win0();
		//Win1 w1=new Win1();
		//Win2 w2=new Win2();
		//Win3 w3=new Win3();
		//Win4 w4=new Win4();
		//Fwin fw=new Fwin();
		//Awin aw=new Awin();
		//Lwin lw=new Lwin();
	}
}//End Main Class

class Win0 extends JFrame implements ActionListener
{			Container con0= getContentPane();
			JButton br1,br0,bl1,bl0;
			JLabel l0,l1;
			
	public Win0()	
	{ 
		
		
	
	con0.setBackground(Color.BLACK);
		Font f=new Font("Times New Roman",Font.BOLD,30);
		
		Font f1=new Font("Aril Black Header",Font.BOLD,11);
		
	
		l0=new JLabel("Welcome To UpSkills.");
		JLabel l2=new JLabel("'KNOWLEGE IS THE EYE OF DESIRE AND CAN BECOME THE PILOT OF THE SOUL'");
		l2.setForeground(Color.GREEN);
		l2.setBounds(100,130,900,60);
		l2.setFont(f1);
		l0.setForeground(Color.GREEN);
		l0.setBounds(200,100,450,50);
		l0.setFont(f);
		 br0=new JButton("Register As Student");
		br0.setBounds(210,200,240,40);
		br0.setBackground(Color.black);
		br0.setForeground(Color.GREEN);
	br0.addActionListener(this);
		
		br1=new JButton("Register As Admin");
		br1.setBounds(210,300,240,40);
		br1.setBackground(Color.black);
		br1.setForeground(Color.GREEN);
		br1.addActionListener(this);
		l1=new JLabel("Login here, If you have already Register.");
		l1.setForeground(Color.GREEN);
		l1.setBounds(220,380,450,50);
		l1.setFont(f1);
		
		
		bl1=new JButton("Login As Student");
		bl1.setBackground(Color.black);
		bl1.setForeground(Color.GREEN);
		bl1.setBounds(210,430,240,40);
		bl1.addActionListener(this);
		
		bl0=new JButton("Login As Admin");
		bl0.setBackground(Color.black);
		bl0.setForeground(Color.GREEN);
		bl0.setBounds(210,430,240,40);
		bl0.addActionListener(this);
		
		con0.add(l0);
		con0.add(l1);
		//add(t0);
		con0.add(br1);
		con0.add(br0);
		//con0.add(bl1);
		con0.add(bl0);
		con0.add(l2);
		
		setTitle("UpSkills");
		setLocation(150,20);
		//setBackground(Color.red);
		setLayout(null);
		setVisible(true);
		setSize(700,600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//End of Win0 Constructor 
	 public void actionPerformed(ActionEvent e)
		{
		 
		 String ch=e.getActionCommand();
		 if(ch=="Register As Student")
		 {
			Win1 w1=new Win1();
		}
		 else
			 
		 if(ch=="Register As Admin")
		 {
			 Win2 w2=new Win2();
			
		 }
		 else
			 
		 if(ch=="Login As Student")
		 {
			 Win3 w3=new Win3();
		 }
		 else
			 if(ch=="Login As Admin")
			 {
				 Win4 w4=new Win4();
			 }
		 else {
			 //System.out.println(ch);
			 //Win3 w3=new Win3();
		 }
		 dispose();
}//end of action performed (win0)
}//end of Win0 class
