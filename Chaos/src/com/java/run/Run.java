package com.java.run;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;

import com.java.constants.Constants;
import com.java.frame.Frame_Setting;

public class Run {

	
	
	public Run() {
		System.out.println(charToInt(Frame_Setting.t1.getText().charAt(0)));
		System.out.println(""+Constants.value1+"");
		System.out.println(""+Constants.value2+"");
		System.out.println(""+Constants.value3+"");
		System.out.println(""+Constants.value4+"");
		System.out.println(""+Constants.value5+"");
		System.out.println(""+Constants.value6+"");
		System.out.println(""+Constants.value7+"");
		
		if(Constants.running) {
			Constants.running=false;
			runHookKeyEnd();
			smartKeyOff();
		}else {
			Constants.running=true;
			if(Frame_Setting.sk.isSelected()) {
				this.smartKey();
				
			}
			this.runHookKey();
		}
	}
	public void smartKey() {
		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);
		try {
			GlobalScreen.registerNativeHook();
			//GlobalScreen.addNativeMouseListener(new GlobalMouseListener());
			GlobalScreen.addNativeKeyListener(new GlobalKeyListener());
			GlobalScreen.registerNativeHook();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void smartKeyOff() {
		try {
			GlobalScreen.unregisterNativeHook();
			//GlobalScreen.addNativeMouseListener(new GlobalMouseListener());
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int charToInt(char ch) {
		//Scanner sc = new Scanner(System.in);		
		//System.out.println(""+);
		return (int)ch;
	}
	public void runHookKey() {
		
		Runtime rt1 = Runtime.getRuntime();
		try {
			String format = 
					Constants.value5+" "+Constants.value6+" "+
					Constants.value3+" "+Constants.value4+" "+
					Constants.value1+" "+Constants.value2+" "+
					"0 ";
			if(Frame_Setting.sk.isSelected())
				format+="0";
			else{
				format+="0";
			}
			System.out.println(format);
			Constants.p1 = rt1.exec("exe/Test.exe "+format);
			//Constants.p2 = rt1.exec("exe/Test.exe "+Constants.value2+" 102");
			//Constants.p2 = rt1.exec("exe/Test.exe "+Constants.value3+" 99");
			//Constants.p4 = rt1.exec("exe/Test.exe "+Constants.value4+" 100");
			//Constants.p5 = rt1.exec("exe/Test.exe "+Constants.value5+" 97");
			//Constants.p6 = rt1.exec("exe/Test.exe "+Constants.value6+" 98");
			
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	public void runHookKeyEnd() {
		if(Constants.p1!=null) {
			if(Constants.p1.isAlive())
				Constants.p1.destroy();
		}
		try {
		}catch(Exception e) {
			
		}
		//Constants.p7.destroy();
	}
}
