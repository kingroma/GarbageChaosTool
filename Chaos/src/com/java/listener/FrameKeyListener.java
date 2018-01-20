package com.java.listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.java.constants.Constants;
import com.java.frame.Frame_Setting;

public class FrameKeyListener implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("keyPressed");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String str = Constants.lock;
		//System.out.println(str);
		//System.out.println("press");
		System.out.println(e.getKeyCode());
		if(!str.equals("")) {
			System.out.println(""+e.getKeyChar()+"");
			if(str.equals("a1")) {
				Frame_Setting.t1.setText(""+e.getKeyChar());
				JButton btn = (JButton)e.getSource();
				ImageIcon icon = new ImageIcon("img/anti.png");
				btn.setIcon(icon);
				Constants.lock="";
				Constants.value1 = e.getKeyCode();
			}
			if(str.equals("a2")) {
				Frame_Setting.t2.setText(""+e.getKeyChar());
				JButton btn = (JButton)e.getSource();
				ImageIcon icon = new ImageIcon("img/anti.png");
				btn.setIcon(icon);
				Constants.lock="";
				Constants.value2 = e.getKeyCode();
			}
			if(str.equals("a3")) {
				Frame_Setting.t3.setText(""+e.getKeyChar());
				JButton btn = (JButton)e.getSource();
				ImageIcon icon = new ImageIcon("img/anti.png");
				btn.setIcon(icon);
				Constants.lock="";
				Constants.value3 = e.getKeyCode();
			}
			if(str.equals("a4")) {
				Frame_Setting.t4.setText(""+e.getKeyChar());
				JButton btn = (JButton)e.getSource();
				ImageIcon icon = new ImageIcon("img/anti.png");
				btn.setIcon(icon);
				Constants.lock="";
				Constants.value4 = e.getKeyCode();
			}
			if(str.equals("a5")) {
				Frame_Setting.t5.setText(""+e.getKeyChar());
				JButton btn = (JButton)e.getSource();
				ImageIcon icon = new ImageIcon("img/anti.png");
				btn.setIcon(icon);
				Constants.lock="";
				Constants.value5 = e.getKeyCode();
			}
			if(str.equals("a6")) {
				Frame_Setting.t6.setText(""+e.getKeyChar());
				JButton btn = (JButton)e.getSource();
				ImageIcon icon = new ImageIcon("img/anti.png");
				btn.setIcon(icon);
				Constants.lock="";
				Constants.value6 = e.getKeyCode();
			}
			if(str.equals("hookBtn")) {
				//Frame_Setting..setText(""+e.getKeyChar());
				System.out.println("test");
				Frame_Setting.tRunning.setText(""+e.getKeyChar());
				Constants.lock="";
				Constants.value7 = e.getKeyCode();
			}
			
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("keyPressed");
	}

}
