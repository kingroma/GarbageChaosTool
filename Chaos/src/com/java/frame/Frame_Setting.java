package com.java.frame;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.java.constants.Constants;
import com.java.listener.AntiListener;
import com.java.listener.RoomCheckListener;
import com.java.listener.RunListener;
import com.java.listener.XListener;

public class Frame_Setting {
	private JFrame frame = null;
	public static JLabel room = new JLabel();
	
	public static JButton x1 = new JButton();
	public static JButton x2 = new JButton();
	public static JButton x3 = new JButton();
	public static JButton x4 = new JButton();
	public static JButton x5 = new JButton();
	public static JButton x6 = new JButton();
	public static JButton xRunning = new JButton();
	
	public static JTextField  t1 = new JTextField ();
	public static JTextField  t2 = new JTextField ();
	public static JTextField  t3 = new JTextField ();
	public static JTextField  t4 = new JTextField ();
	public static JTextField  t5 = new JTextField ();
	public static JTextField  t6 = new JTextField ();
	public static JTextField  tRunning = new JTextField ();
	
	public static JButton a1 = new JButton();
	public static JButton a2 = new JButton();
	public static JButton a3 = new JButton();
	public static JButton a4 = new JButton();
	public static JButton a5 = new JButton();
	public static JButton a6 = new JButton();
	
	public static JButton hookBtn = new JButton();
	
	public static JCheckBox cb = new JCheckBox();
	public static JLabel cb_text = new JLabel("윈도 키 , num lock 방지염 ㅅㅂ");
	
	public static JButton roomCheck = new JButton("리첵");
	
	public static JCheckBox sk = new JCheckBox();
	public static JLabel sk_text = new JLabel("스마트키 할거냐");
	
	public static JButton start = new JButton("ㄱㄱ");
	
	public Frame_Setting() {
		frame = Constants.frame;
		
		
		
		ImageIcon xBtnIcon = new ImageIcon("img/x.png");
		xRunning.setIcon(xBtnIcon);
		x1.setIcon(xBtnIcon);
		x1.setActionCommand("x1");
		x1.addActionListener(new XListener());
		x2.setIcon(xBtnIcon);
		x2.setActionCommand("x2");
		x2.addActionListener(new XListener());
		x3.setIcon(xBtnIcon);
		x3.setActionCommand("x3");
		x3.addActionListener(new XListener());
		x4.setIcon(xBtnIcon);
		x4.setActionCommand("x4");
		x4.addActionListener(new XListener());
		x5.setIcon(xBtnIcon);
		x5.setActionCommand("x5");
		x5.addActionListener(new XListener());
		x6.setIcon(xBtnIcon);
		x6.setActionCommand("x6");
		x6.addActionListener(new XListener());
		
		xRunning.setActionCommand("xRunning");
		xRunning.addActionListener(new XListener());
		
		int x_start = 10;
		int y_start = 50;
		
		int x_width = 28;
		int y_width = 28;
		
		int x_gab = 440;
		int y_gab = 80;
		x1.setBounds(x_start,y_start,x_width,y_width);
		x2.setBounds(x_start+x_gab,y_start,x_width,y_width);
		
		x3.setBounds(x_start,y_start+y_gab,x_width,y_width);
		x4.setBounds(x_start+x_gab,y_start+y_gab,x_width,y_width);
		
		x5.setBounds(x_start,y_start+2*y_gab,x_width,y_width);
		x6.setBounds(x_start+x_gab,y_start+2*y_gab,x_width,y_width);
		
		xRunning.setBounds(x_start+x_gab,y_start+3*y_gab,x_width,y_width);
		
		
		frame.add(x1);
		frame.add(x2);
		frame.add(x3);
		frame.add(x4);
		frame.add(x5);
		frame.add(x6);
		frame.add(xRunning);
		
		Color background = new Color(230,230,230);
		int text_width =110;
		int text_height = 30;
		int start_gab = x_width+10;
		
		
		
		t1.setEditable(false);
		t1.setBackground(background);
		t1.setBounds(x_start+start_gab,y_start,text_width,text_height);
		t1.setHorizontalAlignment(JTextField.RIGHT);
		
		
		t2.setEditable(false);
		t2.setBackground(background);
		t2.setBounds(x_start+start_gab+280,y_start,text_width,text_height);
		t2.setHorizontalAlignment(JTextField.RIGHT);
		
		
		t3.setEditable(false);
		t3.setBackground(background);
		t3.setBounds(48,130,text_width,text_height);
		t3.setHorizontalAlignment(JTextField.RIGHT);
		
		
		
		t4.setEditable(false);
		t4.setBackground(background);
		t4.setBounds(330,130,text_width,text_height);
		t4.setHorizontalAlignment(JTextField.RIGHT);
		
		
		t5.setEditable(false);
		t5.setBackground(background);
		t5.setBounds(48,210,text_width,text_height);
		t5.setHorizontalAlignment(JTextField.RIGHT);
		
	
		t6.setEditable(false);
		t6.setBackground(background);
		t6.setBounds(330,210,text_width,text_height);
		t6.setHorizontalAlignment(JTextField.RIGHT);
		
		
		tRunning.setEditable(false);
		tRunning.setBackground(background);
		tRunning.setBounds(330,290,text_width,text_height);
		tRunning.setHorizontalAlignment(JTextField.RIGHT);
		
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(t5);
		frame.add(t6);
		frame.add(tRunning);
		
		
		ImageIcon anti = new ImageIcon("img/anti.png");
		
		a1.setActionCommand("a1");
		a1.setBounds(170,38,60,45);
		a1.setIcon(anti);
		a1.addActionListener(new AntiListener());
		
		a2.setActionCommand("a2");
		a2.setBounds(260,38,60,45);
		a2.setIcon(anti);
		a2.addActionListener(new AntiListener());
		
		a3.setActionCommand("a3");
		a3.setName("a3");
		a3.setBounds(170,118,60,45);
		a3.setIcon(anti);
		a3.addActionListener(new AntiListener());
		
		a4.setActionCommand("a4");
		a4.setName("a4");
		a4.setBounds(260,118,60,45);
		a4.setIcon(anti);
		a4.addActionListener(new AntiListener());
		
		a5.setActionCommand("a5");
		a5.setName("a5");
		a5.setBounds(170,198,60,45);
		a5.setIcon(anti);
		a5.addActionListener(new AntiListener());
		
		a6.setActionCommand("a6");
		a6.setName("a6");
		a6.setBounds(260,198,60,45);
		a6.setIcon(anti);
		a6.addActionListener(new AntiListener());
		
		
		
		frame.add(a1);
		frame.add(a2);
		frame.add(a3);
		frame.add(a4);
		frame.add(a5);
		frame.add(a6);
		
		
		
		hookBtn.setText("활성화 / 비활성화 단축키");
		hookBtn.setBounds(120, 285, 200, 40);
		hookBtn.setActionCommand("hookBtn");
		hookBtn.addActionListener(new AntiListener());
		
		frame.add(hookBtn);
		
		
		cb.setBounds(120,335,20,20);
		
		frame.add(cb);
		
		
		cb_text.setBounds(150,320,300,50);
		
		frame.add(cb_text);
		
		
		
		start.setBounds(400,410,60,40);
		start.addActionListener(new RunListener());
		frame.add(start);
		
		
		
		room.setText(Constants.r.get());
		room.setBounds(20,410,150,40);
		
		frame.add(room);
		
		
		roomCheck.setBounds(170,415,60,30);
		roomCheck.addActionListener(new RoomCheckListener());
		
		frame.add(roomCheck);
		
		
		sk.setBounds(120,355,20,20);
		
		frame.add(sk);
		
		
		sk_text.setBounds(150,340,300,50);
		
		frame.add(sk_text);
		
		Constants.frame = frame;
		
	}
}
