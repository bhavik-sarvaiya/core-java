/*
class <class name> { }
*/

class Example2{
	static int x = 50; //static variable
	/*
		return-type	method-name(argument){
			//operation (body content)
		}			
	*/
	
	void add(){
		int a = 10;  // local variable
		int b = 20;
		int add = a+b;
		System.out.println("add : "+ add);
	}
	
	public static void main(String args[]){
		
		System.out.println("value of static variable x = "+x);
		
		int y = 56; //instance variable
		System.out.println("value of instance variable y = "+y);
		
		Example2 obj = new Example2(); // using new keyword we create object
		obj.add(); //using obj .we call method add()
	}
}


/*
-> open cmd
-> javac filename.java //complie your source code
-> java filename //execute your java file 
*/