package org.codealpha;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class CharCount extends JFrame implements ActionListener {
	JTextArea t;
	JButton button1,button2;
	CharCount()
	{
		super("Word Character Counter in Java");
		t=new JTextArea();
		t.setSelectedTextColor(Color.RED);
		t.setBounds(60,60,350,250);
		
		
		button1=new JButton("Paragraph");
		button1.setBounds(100,350,140,40);
		button1.setBackground(Color.BLACK);
		button1.setBorder(new LineBorder(Color.ORANGE,2 ));
		button1.setForeground(Color.WHITE);
		
		button2=new JButton("Word");
		button2.setBounds(230,350,140,40);
		button2.setBackground(Color.BLACK);
		button2.setBorder(new LineBorder(Color.ORANGE,2 ));
		button2.setForeground(Color.WHITE);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		add(button1);add(button2);add(t);
		setSize(550,550);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		String text=t.getText();
		if(a.getSource()==button1)
		{
			String words[]=text.split("\\s");
			JOptionPane.showMessageDialog(this,"Total Paragraph : "+words.length);
		}
		if(a.getSource()==button2)
		{
			JOptionPane.showMessageDialog(this,"Total Word including space: "+text.length());
		}
	}
	public static void main(String[] args)
	{
		new CharCount();
	}
}


