package com.example;
class Example11{
	public static void main(String args[]){

		/*
		==> nested for loop
		for(initialization; condition; increment/decrement){
		//statement or code to be executed

			for(initialization; condition; increment/decrement){
			//statement or code to be executed

			}
		}
		*/

		 /*
		 R C 0 1
		 0  |1 2|
		 1  |3 4|2x2

		 [0][0] = 1
		 [0][1] = 2
		 [1][0] = 3
		 [1][1]	= 4
		 */
		System.out.println("===========Matrix==============");
		int i = 1;
		for(int r=0;r<=1;r++){
			//System.out.println("=================="+r);
			for(int c=0;c<=1;c++){
				//System.out.println("----------------"+c);
				System.out.println( "["+r+"]"+"["+c+"]" +" = "+(i++));
			}
		}

		/*
		1
		11
		111
		1111
		11111

		*/
	}
}