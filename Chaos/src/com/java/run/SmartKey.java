package com.java.run;

public class SmartKey implements Runnable{
	private boolean run = true;
	public SmartKey() {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(run) {
			System.out.println("test");
		}
	}
	
	public void end() {
		run = false;
	}
}
