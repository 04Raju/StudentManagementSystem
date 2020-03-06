package S_01;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lwin  extends JFrame {
	Container Lcon= getContentPane();
	JLabel lhead,info;
	
	
	public Lwin()
	{
		//JOptionPane.showMessageDialog(this, "This window is underDevelop mode please come back soon ");
		Font f=new Font("Times New Roman",Font.BOLD,30);
		lhead=new JLabel("Welcome to Upskills");
		lhead.setForeground(Color.GREEN);
		lhead.setBounds(270,50,500,30);
		lhead.setFont(f);
		Font f1=new Font("Times New Roman",Font.BOLD,15);
		info=new JLabel("This window is under Development mode");
		JLabel info1=new JLabel("coming Soon");
		info1.setBounds(200,200,500,30);
		info1.setForeground(Color.CYAN);
		info1.setFont(f);
		info.setBounds(120,150,500,30);
		info.setFont(f1);
		
		info.setForeground(Color.cyan);
		
		
	
		
		
		Lcon.add(lhead);
		Lcon.add(info);
		Lcon.add(info1);
	
		Lcon.setBackground(Color.BLACK);
		setLocation(100,20);
		setLayout(null);
		setVisible(true);
		setSize(700,700);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JOptionPane.showMessageDialog(this, "This window is underDevelop mode please come back soon ");
		dispose();
	
		
		
	}

	
}
