package com.java.frame;

import javax.swing.JFrame;

import com.java.constants.Constants;
import com.java.listener.FrameKeyListener;
import com.java.listener.WindowListener;

public class Frame {
	JFrame frame = Constants.frame;
	public Frame() {
		frame = new JFrame("À±»ó¿À ÇãÁ¢ ½´¹ß");
		
		
		
		Constants.frame = frame;
		
		Frame_Setting fs = new Frame_Setting();
		
		
		setFrameEndInit();
	}
	
	
	public void setFrameEndInit() {
		
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setBounds(
				Constants.windowWidth/2-Constants.thisWidth/2,
				Constants.windowHeight/2-Constants.thisHeight/2,
				Constants.thisWidth,
				Constants.thisHeight);
		frame.setVisible(true);
		frame.addWindowListener(new WindowListener());
		
		//frame.addKeyListener(new FrameKeyListener());
		//frame.setFocusable(true);
		//frame.setFocusTraversalKeysEnabled(false);
		
		Constants.frame = frame;
	}
}
