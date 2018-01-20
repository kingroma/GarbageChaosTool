package com.java.room;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Room {
	public Room() {
		
	}
	
	public String get(){
		try {
			Document doc = Jsoup.connect("http://wapl.kr/wapl/").get();
			
			
			
			//[카오스] 지옥방 [40P 이하] 방제 : 13292 ( 8 / 10 )
			String text = doc.getElementById("wapl-middle").text();
			int i = 0 ; 
			while(i < text.length()) {
				if(i+18<text.length()) {
					if(text.substring(i, i+18).contains("[카오스] 지옥방 [40P 이하]")) {
						//int j = i+18 ;
						String return_value = "";
						for(int j = i+18 ; j < text.length() ; j ++) {
							char current = text.charAt(j);
							return_value += current;
							if(current==')')
								return return_value; 
								//break;
							
						}
						
						System.out.println(return_value);
						break;
					}
						
				}
				i++;
			}
			//System.out.println(doc.body().text());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return "인터넷 연결 후진듯";
			//e.printStackTrace();
		}
		return "";
	}
	
}
