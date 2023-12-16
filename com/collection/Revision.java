package com.collection;
class Revision{
	//public access modifier 
	//static keyword
	//void method return type 
	//mian method name (java konws it's starting point of the program) 
	
	public void calculater(Double val1,Double val2,String flag){
		
		if(flag.equals("1")){
			Double ans = val1+val2;
			System.out.println("Addition : "+ans);
		}
		
		if(flag.equals("2")){
			Double ans = val1-val2;
			System.out.println("Subtraction : "+ans);
		}
		
		if(flag.equals("3")){
			Double ans = val1*val2;
			System.out.println("Mul : "+ans);
		}
		
		if(flag.equals("4")){
			Double ans = val1/val2;
			System.out.println("Devision : "+ans);
		}
		
	}
	
	public static void main(String val[]){
		System.out.println("1. add");
		System.out.println("2. sub");
		System.out.println("3. mul");
		System.out.println("4. div");
		
		System.out.println("frist value :"+val[0]);
		System.out.println("second value :"+val[1]);
		System.out.println("operator value :"+val[2]);
		
		Double val1 =  Double.parseDouble(val[0]);
		Double val2 =  Double.parseDouble(val[1]);
		String flag = val[2];
		
		System.out.println("===============================");
		
		Revision object = new Revision();
		object.calculater(val1,val2,flag); //call method calculater using object
		
		System.out.println("===============================");
		
		System.out.println("End of the code.");
	}
}