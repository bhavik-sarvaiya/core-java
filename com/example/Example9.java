package com.example;
class Example9{
	public static void main(String args[]){
		/* -- Nested if else ---
			if(condition){
				if(condition){
					if(condition){
					}else{
					}
				}else{
				}
			}else{
				if(condition){
				}else{
				}
			}
		*/
		int age = 18;
		int weigth = 45;
		if(age>=18){
			//System.out.println("you are eligibal to vote.");
			if(weigth>=50){
				System.out.println("you are eligibal to donate a blood.");
			}else{
				System.out.println("you are not eligibal to donate a blood.");
			}
		}else{
			if(weigth>=40){
				System.out.println("your weight is good");
			}else{
				System.out.println("your weight is not good");
			}
		}
	}
}