package com.datapak.helloworld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Who are you?");
		
		String name= scanner.next();
		
		System.out.println(getMessage(name));
	}

	public static String getMessage(String name) {
		// TODO Auto-generated method stub
		return "Hello, "+ name + "!";
	}
	


}
