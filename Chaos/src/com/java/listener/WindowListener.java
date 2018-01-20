package com.java.listener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class WindowListener extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		
		JFrame frame = (JFrame)e.getWindow();
		frame.dispose();
		
	}
}
