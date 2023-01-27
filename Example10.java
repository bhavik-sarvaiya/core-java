class Example10{
	public static void main(String args[]){

		/*
		switch(expression){    expression = value1
			case value1:
				 //code to be executed;
				 break;  //optional
			case value2:
				 //code to be executed;
				 break;  //optional
			......

			default:
			  code to be executed if all cases are not matched;
			}
		*/

		int val = 1;
		switch(val){
			case 1:
				System.out.println("it is part of alphabat A ="+ val);
				break;
			case 2:
				System.out.println("it is part of alphabat B ="+ val);
				break;
			case 3:
				System.out.println("it is part of alphabat C ="+ val);
				break;
			default:
				System.out.println("it is not part of alphabet ="+ val);
		}

		/*
		1.Finding Month
		2.If the character is A, E, I, O, or U, it is vowel otherwise consonant.
		  It is not case-sensitive.
		3.Finding Day
		*/

	}
}