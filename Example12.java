class Example12{
	public static void main(String args[]){

		/*
		==> for loop
		for(initialization; condition; increment/decrement){
		//statement or code to be executed
		//9 * 1 = 9
		}
		*/
		System.out.println("===========Table==============");
		int val = 10;
		for(int i=1;i<=10;i++){
			System.out.println(val+" * "+i+" = "+ (val*i) );
		}
		System.out.println("===========factorial==============");
		int f = 1;
		for(int i=val;i>=1;i--){ //1*5 =>5*4=> 20*3 => 60*2 =>120
			System.out.println("f"+" = "+f+" * "+i);
			f = f*i;
		}
		System.out.println(f);

		/*
		1. for useing for loop print fibonacci numbers
		2. using for loop print table of 25
		3. find new code of for.
		*/

	}
}