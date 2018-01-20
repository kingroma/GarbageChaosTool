package com.java.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.java.constants.Constants;
import com.java.frame.Frame_Setting;

public class RoomCheckListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		e.getActionCommand();
		Frame_Setting.room.setText(Constants.r.get());
	}

}
