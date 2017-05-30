package com.datapak.helloworld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		
		System.out.println(getMessage());
	}

	public static String getMessage() {
		// TODO Auto-generated method stub
		return "Hello "+ getUserName();
	}
	
	public static String getUserName()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Who are you?");
		String name= scanner.next();
		
		return name;
	}

}
