package com.example;
class Example6{
	public static void main(String args[]){
		int a=25;  
		int b=5;  
		int c=20;  
		
		System.out.println("a>c = "+ (a>c));
		System.out.println("b<a = "+ (a<b));
		System.out.println("a>c|b<a = "+ (a>c||a<b));//false && true = false
		System.out.println(a<c&b<c); //false & true = false
		
		System.out.println(a<c||a<b);//false && true = true  
		System.out.println(a<c|a<b); //false && true = true
		
		System.out.println("================ Ternary Operator ============");
		/*
		(condition)? true:false;
		*/
		String ans = (a%2 == 0)? "even":"odd";
		System.out.println("number is "+ ans);
	}
}
/*
0 - true
1 - false
AND 
0 1  & (&&)
============
0 0  0
0 1  1
1 1  1
1 0  1 

OR
0 1  | (||)
============
0 0  0
0 1  0
1 0  0
1 1  1 
*/