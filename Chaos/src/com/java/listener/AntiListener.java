package com.java.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.java.constants.Constants;

public class AntiListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
		if(Constants.lock.equals("")) {
			Constants.lock = e.getActionCommand();
			JButton btn = (JButton)e.getSource();
			
			if(!btn.getActionCommand().equals("hookBtn")) {
				
				ImageIcon icon = new ImageIcon("img/dis.png");
				btn.setIcon(icon);
			}
			btn.setFocusable(true);
			btn.setFocusTraversalKeysEnabled(false);
			//btn.setFocusCycleRoot(true);
			//btn.setFocusTraversalPolicyProvider(true);
			//btn.focus
			btn.addKeyListener(new FrameKeyListener());
			//btn.setFocusable(true);
			//btn.setFocusTraversalKeysEnabled(false);
		}
		
	}

}
