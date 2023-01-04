class Example4{
	public static void main(String []args){
		// Unary Operator
		//++ --
		int a = 10;
		int b = 20;
		System.out.println("++");
		System.out.println("==========postfix => a=> asign => a=a+1 ===========");
		System.out.println("value of a ="+ a);
		System.out.println("a++ => "+ a++);  //a=10 => a=a+1 =>a=10+1 =>a=11
		System.out.println("value of b ="+ b);
		System.out.println("b++ => "+ b++);  //b=20 => b=b+1 =>b=20+1 =>b=21
		System.out.println("==========prefix => a=a+1 => a= asign ===========");
		System.out.println("value of a ="+ a);
		System.out.println("++a => "+ ++a); // a=a+1 => a=11+1 => a=12
		System.out.println("value of b ="+ b);
		System.out.println("++b => "+ ++b); // b=b+1 => b=21+1 => b=22

		System.out.println("--");
		System.out.println("==========postfix => a=> asign => a=a+1 ===========");
		System.out.println("value of a ="+ a);
		System.out.println("a++ => "+ a--);  //a=12 => a=a-1 =>a=12-1 =>a=11
		System.out.println("value of b ="+ b);
		System.out.println("b++ => "+ b--);  //b=22 => b=b-1 =>b=22-1 =>b=21
		System.out.println("==========prefix => a=a+1 => a= asign ===========");
		System.out.println("value of a ="+ a);
		System.out.println("++a => "+ --a); // a=a-1 => a=11-1 => a=10
		System.out.println("value of b ="+ b);
		System.out.println("++b => "+ --b); // b=b-1 => b=21-1 => b=20

		System.out.println(a++ + ++a);// 10 + 12 = 22
		System.out.println(b++ + ++b);// 20 + 22 = 42
		System.out.println(a-- + --a);// 12 + 10 = 22
		System.out.println(b-- + --b);// 22 + 20 = 42

		System.out.println(10*20/5+3-1*4/2); //10*2+3-1*2 =>20+3-2 =>20+1=>21

	}
}