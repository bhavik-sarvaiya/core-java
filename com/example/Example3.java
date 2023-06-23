package com.example;
class Example3{
	public static void main(String []dhree){
		// Unary Operator
		
		int a = 10;  
		int b = 20;   
		//prefix 
		a = ++a; // => a+1 => a = aisgn value => 10+1 , a=11
		b = ++b; // => 21
		System.out.println("++a => "+a);  
		System.out.println("++b => "+b);
		
		//postfix
		int x = 10;  
		int y = 20;   
		
		x = x++; // => x = aisgn value => x+1
		y = y++; 
		System.out.println("x++ => "+x);  
		System.out.println("y++ => "+y);
	}
}