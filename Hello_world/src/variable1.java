
public class variable {

	public static void main(String[] args) {
		byte b,b1,b2;
		short s,s1,s2;
		int i,i1,i2;
		long l,l1,l2;
		
		//Byte b
		
		b=10;
		
		System.out.println(b);
		
		//range of byte b ( 8 bit ) = - 128 to 127 
		
		b1=127;
		b2=-128;
		
		System.out.println(b1);		
		System.out.println(b2);
		
		//Short s 
		
		s=20;
		
		System.out.println(s);
		
		//range of short s ( 16 bit ) = -32768 to 32767
		
		s1=32767;
		s2=-32768;
				
		System.out.println(s1);		
		System.out.println(s2);
		
		//int i
		
		i=30;
		
		System.out.println(i);
		
		//range of int i ( 32 bit ) = -2147483648 to 247483647
		
		i1=2147483647;
		i2=-2147483648;
		
		System.out.println(i1);		
		System.out.println(i2);
		
		//Long l
		
		l=40;
		
		System.out.println(l);
		
		//range of long l ( 64 bit ) = -9223372036854775807 to 9223372036854775808
		
		l1=-9223372036854775807l;		
		l2=9223372036854775807l;
		
		System.out.println(l1);		
		System.out.println(l2);
		
		//float - 32 bit and double - 64 bit 
		
		//float
		
		float f,f1,f2;
		
		f1=100;
		
		System.out.println(f1);
		
		f2=100.24f;
		
		System.out.println(f2);
		
		//double
		
		double d=233.4554;
		
		System.out.println(d);
		
		//character ( 16 bit ) - 0 to 65535 
		//you can access the characters either by ASCII or string within quotes 
		
		char c1,c2;
		
		c1=97;
		
		c2='b';
		
		System.out.println(c1);		
		System.out.println(c2);
		
		//boolean - it accepts only true or false 
		
		boolean studying=true;
		
		System.out.println(studying);
		
		//Complex type - size of string is unlimited
		
		String msg="Welcome to Java..";
		String msg2=new String("Welome to Java...");
		String msg3=String.valueOf("Welcome to java...");
		
		System.out.println(msg);
		
		System.out.println(msg2);
		
		System.out.println(msg3);
		
		
		
		
		
		
		
	}

}
