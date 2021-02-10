package com.xworkz.xworkzapp.reverse;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		
		String name="darshan is a good boy";
		System.out.println("string"+name);
		
		//convert string to string array
		String[] name1= name.split(" ");
		String name2=Arrays.toString(name1);
		System.out.println("string array "+name2);
		//converting string to chararray
		char[] revName=name.toCharArray();
		
		for(int i=revName.length-1;i>=0;i--) {
			
			
			System.out.print(revName[i]);
		}
		
		
	
		
	}

}
