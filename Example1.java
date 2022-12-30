class Example1{
	public static void main(String []dhree){
		int a = 10;  
		float f = a;   // value 10.0f
		
		double x = 50.65f;
		int y = (int) x;	// Narrowing -> we use type casting
		
		byte m = 10;  
		byte n = 10;  

		System.out.println(a);  
		System.out.println(f);

		System.out.println("Narrowing");		
		
		System.out.println(x);  
		System.out.println(y);
		
		byte c = (byte)(m+n);  
		System.out.println(c); 
			
	}
}