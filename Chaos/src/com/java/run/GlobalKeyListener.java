package com.java.run;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import com.java.constants.Constants;


public class GlobalKeyListener implements NativeKeyListener{
	Robot robot = null;

	@Override
	public void nativeKeyTyped(NativeKeyEvent nativeEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nativeKeyPressed(NativeKeyEvent nativeEvent) {
		// TODO Auto-generated method stub
		//System.out.println("press");
		if(robot==null) {
			try {
				robot = new Robot();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		try{
			Thread.sleep(10);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("press");
		System.out.println(nativeEvent.getKeyCode());
		
		if(nativeEvent.getKeyCode()==28) {
			
		}
		else if(nativeEvent.getKeyCode()==1){
			if(Constants.p1!=null)
				if(Constants.p1.isAlive()) {
					Constants.p1.destroy();try {
					GlobalScreen.unregisterNativeHook();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
		}
		else {
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			//robot.keyPress(KeyEvent);
			//robot.keyPress(InputEvent.);
		}
		//robot.mouseMove(1, 1);77
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent nativeEvent) {
		// TODO Auto-generated method stub
		
	}
	
	

}
