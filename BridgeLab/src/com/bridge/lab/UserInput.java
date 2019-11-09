package com.bridge.lab;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int i = 1;
	String  USER_NAME="";
	while(i!=0) {
	USER_NAME = scan.nextLine();
	if(USER_NAME.length()< 4) {
		System.out.println("enter valid name");
	}else {
	i = 0 ;
	}
	}
	String str = "HELLO USER, How are you?";
    System.out.println(str.replace("USER", USER_NAME));
	}

}
