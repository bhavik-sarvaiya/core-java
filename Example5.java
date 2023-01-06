class Example5{
	public static void main(String []args){
		// Unary Operator
		//++ --
		int a = 55; //10
		int b = 25; //20
		System.out.println("++");
		System.out.println("==========postfix => a=> asign => a=a+1 ===========");
		System.out.println("value of a ="+ a);
		System.out.println("a++ => "+ a++);  //a=55(asign) => a=a+1 =>a=55+1 =>a=56
		System.out.println("value of b ="+ b);
		System.out.println("b++ => "+ b++);  //b=25(asign) => b=b+1 =>b=25+1 =>b=26
		System.out.println("==========prefix => a=a+1 => a= asign ===========");
		System.out.println("value of a ="+ a);
		System.out.println("++a => "+ ++a); // a=a+1 => a=56+1 => a=57(asign)
		System.out.println("value of b ="+ b);
		System.out.println("++b => "+ ++b); // b=b+1 => b=26+1 => b=27(asign)

		System.out.println("--");
		System.out.println("==========postfix => a=> asign => a=a-1 ===========");
		System.out.println("value of a ="+ a);
		System.out.println("a-- => "+ a--);  //a=57(asign) => a=a-1 =>a=57-1 =>a=56
		System.out.println("value of b ="+ b);
		System.out.println("b-- => "+ b--);  //b=27(asign) => b=b-1 =>b=27-1 =>b=26
		System.out.println("==========prefix => a=a-1 => a= asign ===========");
		System.out.println("value of a ="+ a);
		System.out.println("--a => "+ --a); // a=a-1 => a=56-1 => a=55(asign)
		System.out.println("value of b ="+ b);
		System.out.println("--b => "+ --b); // b=b-1 => b=26-1 => b=25(asign)

		Boolean value = false ; //true /false
		System.out.println("boolea value : "+ !value);
		System.out.println("boolea value : "+ ~(-a));

		//left shift
		System.out.println(10<<2);//10*2*2=10*4=40
		System.out.println(10<<3);//10*2*2*2=10*8=80
		System.out.println(20<<2);//20*2*2=20*4=80
		System.out.println(15<<4);//15*2*2*2*2=15*16=240
		//right shift
		System.out.println(10>>2);//10/2*2=10/4=2
		System.out.println(10>>3);//10/2*2*2=10/8=1
		System.out.println(20>>2);//20/2*2=20/4=5
		System.out.println(15>>4);//15/2*2*2*2=15/16=0

	}
}