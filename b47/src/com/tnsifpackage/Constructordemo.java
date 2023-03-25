package com.tnsifpackage;
import java.util.Scanner;
public class Constructordemo {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Constructor ob = new Constructor();//creation of object
		ob.backward();//calling the member function of the carClass
		ob.forward();
		ob.stop();
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter");
		int reg= Sc.nextInt();
		System.out.println("reg is "+ob.reg);
	
		//System.out.println("reg is "+ob.amount);
	}

}