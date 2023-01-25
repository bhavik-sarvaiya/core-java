class Example7{
	public static void main(String args[]){
		int a = 25;
		//Assignment Operator
		//a=a+10; //a=25+10=35
		System.out.println("a+=10 : "+ (a+=10));//35
		System.out.println("a-=10 : "+ (a-=10));//25
		System.out.println("a/=10 : "+ (a/=10));//2
		System.out.println("a*=10 : "+ (a*=10));//20


		System.out.println("50*a : "+ (a*=50));

		/*
		//if statement
		if(condition){ condition = true === then ===> show if body execute
			(body/logic/opration)
		}
		*/
		String val = "25";
		if(val != "25"){
			System.out.println("value of a ="+ val);
		}

		/*
		//if else statement
		if(condition){ condition = true === then ===> show if body execute
			(body/logic/opration)
		}else{ conditon = flase === then execute else body part
			(body/logic/opration)
		}
		*/
		int x = 15;
		if(x%2 == 0){
			System.out.println(x +" is even number");
		}else{
			System.out.println(x +" is odd number");
		}

	}
}