package com.java.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.frame.Frame_Setting;

public class XListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
		if(e.getActionCommand().equals("x1")) {
			Frame_Setting.t1.setText("");
		}else if(e.getActionCommand().equals("x2")) {
			Frame_Setting.t2.setText("");
		}else if(e.getActionCommand().equals("x3")) {
			Frame_Setting.t3.setText("");
		}else if(e.getActionCommand().equals("x4")) {
			Frame_Setting.t4.setText("");
		}else if(e.getActionCommand().equals("x5")) {
			Frame_Setting.t5.setText("");
		}else if(e.getActionCommand().equals("x6")) {
			Frame_Setting.t6.setText("");
		}else if(e.getActionCommand().equals("xRunning")) {
			Frame_Setting.xRunning.setText("");
		}
		
		
		
	}

}
