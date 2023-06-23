package com.example;
class Example13{
	public static void main(String args[]){

		/*
		1
		11
		111
		1111
		11111

		1
		12
		123
		1234
		12345

		*
		**
		***
		****
		*****

		*/
		System.out.println("===========Matrix==============");
		for(int r=1;r<=5;r++){
			//System.out.println("=================="+r);
			for(int c=1;c<=r;c++){
				//System.out.println("----------------"+c);
				System.out.print(" * ");
			}
			System.out.println("");
		}

	}
}